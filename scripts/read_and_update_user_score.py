from functools import reduce
from os import listdir
from os.path import isfile, join, basename, splitext
import re
import sys
import json
import firebase_admin
from firebase_admin import credentials
from firebase_admin import firestore


def get_assignment_info(file_name):
    texts = file_name.split('_')
    return {
        'assignment_name': texts[0],
        'device_name': texts[1]
    }


def get_assignment_level(test_name):
    texts = re.split(r'\d+', test_name)
    return texts[0]


def get_percentage_score(percentage_accuracy):
    return (100.0 - float(percentage_accuracy)) / 100.0


def read_assignment_result(file_path):
    try:
        with open(file_path, 'r') as file:
            file_basename = basename(file_path)
            info = get_assignment_info(splitext(file_basename)[0])
            level = get_assignment_level(info['assignment_name'])
            score = get_percentage_score(file.read())

            return {
                'assignment_level': level,
                'assignment_name': info['assignment_name'],
                'device_name': info['device_name'],
                'score': score
            }
    except IOError:
        raise Exception(f'File(path: {file_path}) not found!')
    except Exception as err:
        raise Exception(f'Unexpected {err}, {type(err)}')


def read_all_assignment_in_directory(dir_path):
    file_paths = [
        join(dir_path, f)
        for f in listdir(dir_path)
        if isfile(join(dir_path, f))
    ]

    return [
        read_assignment_result(fp)
        for fp in file_paths
    ]


def calculate_and_map_assignment_score(assignment):
    devices = assignment['devices']
    if (len(devices) <= 0):
        assignment['score'] = 0
    else:
        sum_score = 0
        for device in devices:
            sum_score += device['score']
        assignment['score'] = sum_score / len(devices)

    return assignment


def get_assignment_score_ratio(level):
    match level.lower():
        case 'easy' | 'qualify':
            return 1
        case 'medium':
            return 3
        case 'hard':
            return 5


def calculate_all_assignments_total_score(assignments):
    total_score = 0

    for assignment in assignments:
        ratio = get_assignment_score_ratio(assignment['level'])
        score = ratio * assignment['score']
        total_score += score

    return total_score


def create_user_score_json(username, assignment_results):
    assignments = []

    for ar in assignment_results:
        matched_assignment = next(
            filter(lambda a: a['name'] == ar['assignment_name'], assignments),
            None
        )

        if matched_assignment is None:
            assignments.append(
                {
                    'name': ar['assignment_name'],
                    'level': ar['assignment_level'],
                    'devices': [
                        {
                            'name': ar['device_name'],
                            'score': ar['score'],
                        }
                    ],
                }
            )
        else:
            devices = matched_assignment['devices']
            matched_device = next(
                filter(lambda d: d['name'] == ar['device_name'], devices),
                None
            )

            if matched_device is None:
                devices.append({
                    'name': ar['device_name'],
                    'score': ar['score'],
                })
            else:
                matched_device = {
                    'name': ar['device_name'],
                    'score': ar['score'],
                }

    calculated_score_assignments = list(
        map(
            calculate_and_map_assignment_score,
            assignments
        )
    )

    return json.dumps({
        'username': username,
        'totalScore': calculate_all_assignments_total_score(calculated_score_assignments),
        'assignments': calculated_score_assignments
    })


def is_firestore_ready():
    try:
        cred = credentials.Certificate('firebase-admin-sdk.json')
        firebase_admin.initialize_app(cred)
        return True
    except Exception as e:
        print(f'Error initializing Firestore client: {e}')
        return False

def upload_firestore(username, user_score_json):
    if not is_firestore_ready():
        print('Firestore is not ready. Upload operation aborted.')
        return

    db = firestore.client()
    doc_ref = db.collection('user_score').document(username)

    try:
        doc_ref.set(json.loads(user_score_json), merge=True)
        print(f'Upload for {username} successfully set.')
    except Exception as e:
        print(f'Error uploading for {username}: {e}')
        return
    doc_ref.update({'timestamp': firestore.SERVER_TIMESTAMP})

    document = doc_ref.get()
    if document.exists:
        print(f'Data for {username}: {document.to_dict()}')
    else:
        print(f'No data found for {username}')


# Run script - python ./scripts/read_and_update_user_score.py <username> <dir_path>
try:
    username = sys.argv[1]
    dir_path = sys.argv[2]
    print(f'Reading files in directory: {dir_path}')

    assignment_results = read_all_assignment_in_directory(dir_path)

    user_score_json = create_user_score_json(
        username,
        assignment_results
    )

    print('\nCompleted map to user test result')
    print(f'User test result:\n {user_score_json}')
    upload_firestore(username, user_score_json)
except Exception as err:
    print(err)
