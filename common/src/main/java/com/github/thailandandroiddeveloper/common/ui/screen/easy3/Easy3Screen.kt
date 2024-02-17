package com.github.thailandandroiddeveloper.common.ui.screen.easy3

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Easy3Screen(uiState: UiState) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = uiState.backIcon),
                            contentDescription = ""
                        )
                    }
                },
                actions = {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = uiState.done,
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
            )
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Column(modifier = Modifier.padding(horizontal = 48.dp)) {
                Text(
                    text = uiState.title,
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Text(
                    text = uiState.description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 16.dp,
                    bottom = 13.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(32.dp))
                        .background(color = MaterialTheme.colorScheme.onPrimary)
                        .padding(start = 32.dp, end = 16.dp, top = 20.dp)
                ) {
                    LazyColumn {
                        items(uiState.friend.friends) {
                            FriendSection(it)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FriendSection(it: Friend) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = it.image),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier.clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = it.name,modifier = Modifier.weight(1f))
        Checkbox(checked = it.checked, onCheckedChange = {})
    }
    Spacer(modifier = Modifier.height(16.dp))
}

@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
@Composable
fun Easy3ScreenPreview() = AppTheme {
    val uiState = UiState(
        backIcon = R.drawable.ic_easy_3_back,
        done = "Done",
        title = "Invite your friend",
        description = "68 friends in your list",
        friend = FriendSection(
            checkedIcon = R.drawable.ic_easy_3_check,
            friends = listOf(
                Friend(
                    image = R.drawable.img_easy_3_celia,
                    name = "Celia Stevens",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_angelo,
                    name = "Angelo Tran",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_miranda,
                    name = "Miranda Coleman",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_sam,
                    name = "Sam Burgess",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_sherrie,
                    name = "Sherrie Tucker",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_dorothy,
                    name = "Dorothy Crowley",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_douglas,
                    name = "Douglas Frost",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_jonathan,
                    name = "Jonathan Rhodes",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_marshall,
                    name = "Marshall Juarez",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_grace,
                    name = "Grace Dougherty",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_tommy,
                    name = "Tommy Wright",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_gerald,
                    name = "Gerald Alexander",
                    checked = false,
                ),
            )
        ),
    )
    Easy3Screen(uiState = uiState)
}

private data class UiState(
    @DrawableRes val backIcon: Int,
    val done: String,
    val title: String,
    val description: String,
    val friend: FriendSection,
)

private data class FriendSection(
    @DrawableRes val checkedIcon: Int,
    val friends: List<Friend>,
)

private data class Friend(
    @DrawableRes val image: Int,
    val name: String,
    val checked: Boolean,
)
