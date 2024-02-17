![Event Cover](image%2Fevent-header.jpg)

# Jetpack Compose Battle - Final Round
[English at below](#english)

---
# รายละเอียดสำหรับการแข่งขัน Jetpack Compose Battle ในรอบสุดท้าย
## สิ่งที่ผู้เข้าแข่งขันจะต้องทำ
* นำ Laptop มาด้วยตัวเอง
* Accept Invite สำหรับ Git Repository บน Github - https://github.com/ThailandAndroidDeveloper/jetpack-compose-battle-2024-competition
* แชร์หน้าจอในห้อง Discord ที่ชื่อว่า `Contestant Final Round` ตลอดเวลาที่แข่งขัน

## สิ่งที่ผู้เข้าแข่งขันจะได้เจอในการแข่งขันรอบสุดท้าย
* โจทย์ระดับง่าย 4 ข้อ ข้อละ 1 คะแนน
* โจทย์ระดับปานกลาง 2 ข้อ ข้อละ 3 คะแนน
* โจทย์ระดับยาก 1 ข้อ ข้อละ 5 คะแนน
   * โจทย์ระดับยากจะต้องสร้าง UI ใน `@Composable` ที่มีอยู่ตัวเดียวให้รองรับกับ `@Preview` ทั้ง 2 แบบ (Google Pixel 7 กับ Google Pixel Tablet)
* ใช้ระยะเวลาแข่งขันทั้งหมด 90 นาที
* โค้ดจะต้อง Push ขึ้น Git ทุก ๆ 10 นาทีเพื่ออัปเดตคะแนนล่าสุด
   * โค้ดควรทำงานได้ปกติเพื่อให้ระบบตรวจคะแนนทำงานได้
   * ทีมงานจะคอยแจ้งให้ทราบเมื่อถึงเวลาที่กำหนด

## สิ่งที่ผู้เข้าแข่งขันควรรู้
* โจทย์บน Figma จะถูกส่งให้ในห้อง Discord ตอน 16.00 น.
* ภาพต้นฉบับสำหรับการทำ Snapshot Testing เพื่อประเมินคะแนนจะถูก Push ขึ้นมาใน Git Repository ต้นฉบับตอน 16.00 น.
* ผู้เข้าแข่งขันไม่จำเป็นต้องทำให้ครบทั้งหมด 7 ข้อ ดังนั้นการวางแผนเพื่อทำเฉพาะข้อที่สำคัญเพื่อให้ได้คะแนนสูงสุดจึงสิ่งที่สำคัญสำหรับการคว้าชัยชนะในการแข่งขันนี้
* จากนโยบายใหม่ของ Figma ทำให้การใช้ Figma ในการแข่งขันรอบสุดท้ายจะต้องใช้ Inspector Mode เพื่อดู UI ที่ทีมงานเตรียมไว้ให้ ไม่สามารถใช้ Dev Mode ได้อีกต่อไป
* ภาพต้นฉบับที่ใช้ใน Snapshot Testing จะเป็นภาพที่ Export มาจาก Figma
   * ซึ่งเป็นคนละวิธีกับรอบคัดเลือกที่ทีมงานสร้าง UI ขึ้นมาเพื่อใช้เป็นภาพต้นฉบับ
   * การใช้ภาพต้นฉบับจาก Figma จะไม่สามารถเขียนโค้ดให้เหมือนได้แบบ 100%
* อันดับของผู้เข้าแข่งขันจะเรียงลำดับตามคะแนนที่ได้ (จากมากไปน้อย) ในกรณีที่คะแนนเท่ากัน ทีมงานจะตัดสินจากเวลาของ Last Commit ว่าใคร Push Last Commit ได้เร็วกว่า
* คะแนนของผู้เข้าแข่งขันแต่ละคนจะอิงจาก Commit ล่าสุดเสมอ ถึงแม้ว่าจะได้คะแนนลดลงจาก Commit ก่อนหน้าก็ตาม

## การเตรียมตัวสำหรับการแข่งขัน
* เริ่มลงทะเบียนตั้งแต่ 15.00 - 15.30 น.
* ทีมงานจะแจ้งกติกาและเงื่อนไขในการแข่งขันให้ทราบตอน 15.30 น.
* การเตรียมตัวสำหรับการแข่งขันจะเริ่มขึ้นตอน 16.00 น. 
   * Clone และสร้าง Branch ใหม่ที่กำหนดเป็นชื่อของตัวเอง
      * ใช้เป็นตัวพิมพ์เล็กทั้งหมด
      * ยกตัวอย่างเช่น “Somkiat” ก็ให้ตั้งชื่อ Branch ว่า `somkiat`
   * Commit 1 ครั้งแล้วเปิด Pull Request เพื่อทดสอบระบบ
   * แจ้งให้ทีมงานทราบ เพื่อให้ทีมงานตรวจสอบความถูกต้องของระบบให้คะแนน
* การแข่งขันจะเริ่มต้นขึ้นตอน 16.30 น.
* การแข่งขันจะสิ้นสุดตอน 18.00 น.
* ประกาศผลผู้ชนะตอน 18.30 น.

## เกี่ยวกับโปรเจคที่ใช้ในการแข่งขัน
* โค้ดสำหรับการแข่งขัน
   * ใช้โปรเจคจาก https://github.com/ThailandAndroidDeveloper/jetpack-compose-battle-2024-competition
   * ไฟล์ที่ใช้ในการแข่งขันจะอยู่ใน `<project>/common/src/main/java/com/github/thailandandroiddeveloper/common/ui/screen/<level>/<Name>Screen.kt`
      * `Easy1Screen.kt`
      * `Easy2Screen.kt`
      * `Easy3Screen.kt`
      * `Easy4Screen.kt`
      * `Medium1Screen.kt`
      * `Medium2Screen.kt`
      * `Hard1Screen.kt`
   * สามารถสร้าง Composable Function เพิ่มในไฟล์ดังกล่าวได้ตามใจชอบ ขอแค่ห้ามแก้ไขข้อมูลใน `@Preview` ที่อยู่ในไฟล์ดังกล่าวก็พอ
   * ไฟล์รูปภาพที่ต้องใช้ทั้งหมดจะอยู่ในโปรเจคแล้ว
   * ข้อความและรูปภาพจะถูกสร้างเป็น Data Class ที่มีชื่อว่า `uiState` ไว้ให้แล้ว เพื่อช่วยลดระยะเวลาจากการก๊อปข้อความและค้นหาชื่อไฟล์รูป
      * ยกตัวอย่างเช่น `uiState.title` หรือ `uiState.profileImage` เป็นต้น
      * ```kotlin
        @Composable
        private fun Easy1Screen(uiState: UiState) { /* ... */ }
        ```
      * โดย Data Class ของ UI State จะอยู่บรรทัดล่างสุดในไฟล์ของแต่ละข้อ
   * ค่าต่าง ๆ เช่น ขนาด ฟอนต์ ความหนาของตัวอักษรไม่ต้องสร้างขึ้นมาเอง ให้ดูจากใน Figma และเรียกใช้งานผ่าน `MaterialTheme` ได้เลย ยกตัวอย่างเช่น `MaterialTheme.typography.headlineMedium.fontSize` เป็นต้น
   * ค่าสีที่ใช้ใน UI ไม่ต้องสร้างขึ้นมาเอง ให้ดูจากใน Figma และเรียกใช้งานผ่าน `MaterialTheme` ได้เลย เช่น `MaterialTheme.colors.primary` เป็นต้น
   * คะแนนจะถูกคำนวณจากการรัน Snapshot Testing ด้วย Paparazzi โดยผู้เข้าแข่งขันสามารถทดสอบได้ด้วยการใช้คำสั่ง `./gradlew :screenshot-test:verifyPaparazziDebug` เผื่อดูผลลัพธ์ได้ก่อนส่งโจทย์
      * โดยผลลัพธ์ที่ได้จะอยู่ใน `<project>/screenshot-test/diff/` ที่จะบอกผลต่างของภาพที่ได้จากโค้ดเทียบกับภาพที่ถูกต้อง
      * ค่าที่ได้จากผลของ Snapshot Testing จะมีค่าเป็น % เมื่อเทียบกับภาพต้นฉบับ
      * ถ้าที่ได้มีค่าเท่ากับ 0 แปลว่าผลลัพธ์ถูกต้องแบบ 100%
   * ภาพต้นฉบับที่ใช้เปรียบเทียบใน Snapshot Testing จะอยู่ใน `/screenshot-test/src/test/snapshots/images` (ห้ามแก้ไข)

## เวอร์ชันของโปรแกรมที่แนะนำ
* Android Studio Hedgehog 2023.1.1 Patch 2 (Latest Stable)
* Embedded JDK (JBR 17.0.7)

## สิ่งที่ทีมงานเตรียมให้ภายในงาน
* หน้าจอแสดงคะแนนของผู้เข้าแข่งขันทุกท่าน
   * คะแนนจะอัปเดตตามผลลัพธ์ที่ได้จาก Continuous Integration บน GitHub ที่ผู้เข้าแข่งขันเปิด Pull Request ไว้
   * หน้าจอดังกล่าวจะหยุดอัปเดตคะแนนใน 10 นาทีสุดท้าย
* ทีมงานที่คอยให้ความช่วยเหลือในระหว่างการแข่งขัน
   * ให้คำแนะนำสำหรับการ Setup Project ก่อนเริ่มทำการแข่งขัน
   * แจ้งเตือนเมื่อถึงเวลา Push โค้ดทุก ๆ 10 นาที
   * แจ้งเวลาแข่งขันที่เหลืออยู่
   * ช่วยเหลือเมื่อเกิดเหตุที่อยู่นอกเหนือจากการแข่งขัน
* อาหารและเครื่องดื่ม
   * ข้าวกล่องสำหรับมื้อเย็น
   * ขนม
   * เครื่องดื่ม

## สิ่งที่ผู้เข้าแข่งขันห้ามทำ
* ห้ามใช้ 3rd Party Plugin บน Android Studio เพื่อช่วยพิมพ์
   * ถ้าติดตั้งไว้อยู่แล้ว สามารถปิดชั่วคราวในระหว่างการแข่งขันได้
* ห้ามใช้ 3rd Party Plugin บน Figma
* ห้ามติดตั้ง 3rd Party Library เพิ่มในโปรเจค
* ห้ามแก้ไขไฟล์อื่น ๆ นอกเหนือจากที่กำหนดไว้
* ห้ามปิดการแชร์หน้าจอบน Discord ตลอดการแข่งขัน

## Sponsors
* [MuvMi](https://muvmi.co/)
* [LINE MAN Wongnai](https://lmwn.com/)

---

# English
# Details for the final round of the Jetpack Compose Battle competition
## Tasks for contestants
* Bring your own laptop
* Accept the invite to the Git Repository on Github - https://github.com/ThailandAndroidDeveloper/jetpack-compose-battle-2024-competition
* Share your screen in the Discord room named `Contestant Final Round` throughout the competition.

## What contestants will encounter in the final round of the competition
* 4 easy-level tasks, each worth 1 point
* 2 medium-level tasks, each worth 3 points
* 1 hard-level task, worth 5 points
   * The hard-level task requires creating a UI in `@Composable` that supports both `@Preview` modes (Google Pixel 7 and Google Pixel Tablet).
* Total competition time is 90 minutes
* Code must be pushed to Git every 10 minutes to update the latest scores.
   * The code should work properly for the scoring system to work.
   * The staff will notify when it's time to push the code.

## Things Contestants Should Know
* Figma link will be sent to the Discord room at 4:00 PM.
* Original images for snapshot testing will be pushed to the Git Repository at 4:00 PM.
* Contestants are not required to complete all 7 tasks, so planning to tackle only the crucial tasks to achieve the highest score is essential for winning this competition.
* Due to Figma's new policy, the use of Figma in the final round of the competition must use Inspector Mode to view the UI provided by the organizing team. Dev Mode can no longer be used.
* The original images used in Snapshot Testing will be exported from Figma.
  * This differs from the qualify round where the staff created UI for use as original images.
  * Using original images from Figma may not result in code that matches 100%.
* Contestant rankings will be based on their scores (from highest to lowest). In the case of tied scores, the staff will determine based on the time of the last commit, who pushed the last commit faster.
* Each contestant's score will always be based on their latest commit. Even if the score decreases from the previous Commit.

## Preparation for the Competition
* Registration starts from 3:00 PM to 3:30 PM.
* The staff will inform participants of the rules and conditions of the competition at 3:30 PM.
* Preparation for the competition will begin at 4:00 PM. 
   * Clone and create a new branch with your with name
      * Use all lowercase letters and no spaces.
      * For example, if your name is "Somkiat", name your branch `somkiat`.
   * Commit once and open a pull request to test the system.
   * Inform the staff for system validation and scoring.
* The competition will start at 4:30 PM.
* The competition will end at 6:00 PM.
* Winners will be announced at 6:30 PM.

## About the Project Used in the Competition
* Code for the competition
   * Use the project from https://github.com/ThailandAndroidDeveloper/jetpack-compose-battle-2024-competition
   * Files used in the competition will be in `<project>/common/src/main/java/com/github/thailandandroiddeveloper/common/ui/screen/<level>/<Name>Screen.kt`
      * `Easy1Screen.kt`
      * `Easy2Screen.kt`
      * `Easy3Screen.kt`
      * `Easy4Screen.kt`
      * `Medium1Screen.kt`
      * `Medium2Screen.kt`
      * `Hard1Screen.kt`
   * Additional Composable Functions can be created in these files as desired, but refrain from modifying the data in `@Preview` in those files.
   * All necessary image files will already be in the project.
   * Text and images will be created as Data Classes named `uiState` to reduce time copying text and searching for image file names.
      * For example, `uiState.title` or `uiState.profileImage`.
      * ```kotlin
        @Composable
        private fun Easy1Screen(uiState: UiState) { /* ... */ }
        ```
      * The UI State Data Class will be at the bottom of each file.
   * Various values like size, font, and text thickness can be derived from Figma and accessed through `MaterialTheme`. For example: `MaterialTheme.typography.headlineMedium.fontSize`
   * UI color values can be obtained from Figma and accessed through `MaterialTheme`. For example: `MaterialTheme.colors.primary`
   * Scores will be calculated through Snapshot Testing with Paparazzi. Competitors can test using `./gradlew :screenshot-test:verifyPaparazziDebug`.
      * Results will be in `<project>/screenshot-test/diff/`, indicating differences from the correct images.
      * Snapshot Testing results are presented as percentages comparing with the original images.
      * A result of 0 means 100% accuracy.
   * Original images for Snapshot Testing are in `/screenshot-test/src/test/snapshots/images` (do not modify).

## Recommended Software Versions
* Android Studio Hedgehog 2023.1.1 Patch 2 (Latest Stable)
* Embedded JDK (JBR 17.0.7)

## What the Organizing Team Provides During the Event
* Scoreboard displaying scores of all participants
   * Scores will be updated based on the results from Continuous Integration on GitHub where participants have opened pull requests.
   * The scoreboard will stop updating scores in the last 10 minutes.
* Team assistance available during the competition
   * Guidance for project setup before the competition begins
   * Notifications for code pushes every 10 minutes
   * Remaining competition time updates
   * Assistance for any issues beyond the scope of the competition
* Food and Beverages
   * Boxed meals for dinner
   * Snacks
   * Beverages

## Prohibited Actions for Contestants
* Prohibited from using 3rd Party Plugins on Android Studio for typing assistance.
   * If already installed, it can be temporarily disabled during the competition.
* Prohibited from using 3rd Party Plugins on Figma.
* Prohibited from installing additional 3rd Party Libraries in the project.
* Prohibited from modifying files other than those specified.
* Prohibited from turning off screen sharing on Discord throughout the competition.

## Sponsors
* [MuvMi](https://muvmi.co/)
* [LINE MAN Wongnai](https://lmwn.com/)

