package com.github.thailandandroiddeveloper.common.ui.screen.medium1

import androidx.annotation.DrawableRes
import androidx.annotation.FloatRange
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme


@Composable
private fun Medium1Screen(uiState: UiState) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(232.dp)
                .background(Color(0xFFFFD8E4))
        ) {
            Text(
                text = uiState.title,
                style = TextStyle(
                    fontSize = 28.sp,
                    letterSpacing = 0.5.sp,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .padding(top = 34.dp)
                    .padding(horizontal = 32.dp)
                    .fillMaxWidth()
            )
            Text(
                text = uiState.subtitle,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color(0xFF7D5260),
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(horizontal = 32.dp)
                    .padding(top = 88.dp)
            )
            Box(
                modifier = Modifier
                    .padding(top = 176.dp)
                    .width(241.dp)
                    .height(40.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
                    .align(Alignment.TopCenter)
            ) {
                Text(
                    text = uiState.searchHint,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                        .padding(start = 16.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        letterSpacing = 0.25.sp,
                    )

                )
                Box(
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .width(32.dp)
                        .height(32.dp)
                        .background(Color(0xFF7D5260), shape = RoundedCornerShape(8.dp))
                        .align(Alignment.CenterEnd)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_medium_1_search),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.Center),
                        tint = Color.White,
                    )
                }
            }
        }
        Row {
            Column(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(68.dp)
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = 32.dp)
                        .height(36.dp)
                        .width(36.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFE7E0EC),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_medium_1_activity_1),
                        contentDescription = "",
                        tint = Color(0xFF7D5260),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Column(modifier = Modifier.padding(start = 48.dp)) {
                    repeat(31) {
                        Box(
                            modifier = Modifier
                                .padding(top = 4.dp)
                                .width(4.dp)
                                .height(4.dp)
                                .background(Color(0xFFE7E0EC), shape = RoundedCornerShape(10.dp))
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(start = 32.dp)
                        .height(36.dp)
                        .width(36.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFE7E0EC),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_medium_1_activity_2),
                        contentDescription = "",
                        tint = Color(0xFF7D5260),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Column(modifier = Modifier.padding(start = 48.dp)) {
                    repeat(25) {
                        Box(
                            modifier = Modifier
                                .padding(top = 4.dp)
                                .width(4.dp)
                                .height(4.dp)
                                .background(Color(0xFFE7E0EC), shape = RoundedCornerShape(10.dp))
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(start = 32.dp)
                        .height(36.dp)
                        .width(36.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0xFFE7E0EC),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_medium_1_activity_3),
                        contentDescription = "",
                        tint = Color(0xFF7D5260),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Column(modifier = Modifier.padding(start = 48.dp)) {
                    repeat(3) {
                        Box(
                            modifier = Modifier
                                .padding(top = 4.dp)
                                .width(4.dp)
                                .height(4.dp)
                                .background(Color(0xFFE7E0EC), shape = RoundedCornerShape(10.dp))
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .width(221.dp)
                    .padding(start = 70.dp)
                    .background(Color.Blue)
                    .border(
                        width = 2.dp,
                        color = Color(0xFFE7E0EC),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFD8E4))
                .fillMaxWidth()
                .height(80.dp)
        ) {

        }
    }
}

@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
@Composable
fun Medium1ScreenPreview() = AppTheme {
    val uiState = UiState(
        title = "Hi, John Doe",
        subtitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vehicula erat pharetra enim dapibus, lacinia tristique felis aliquam. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas suscipit et nibh nec laoreet. Sed imperdiet elit massa,",
        searchHint = "Explore more activities",
        searchIcon = R.drawable.ic_medium_1_search,
        activities = listOf(
            Activity(
                icon = R.drawable.ic_medium_1_activity_1,
                preview = R.drawable.img_medium_1_activity_1,
                title = "Praesent faucibus",
                content = "Morbi feugiat posuere felis, luctus fringilla mauris semper vel.",
                progress = null,

                detail = "Detail",
                action = "Done",
            ),
            Activity(
                icon = R.drawable.ic_medium_1_activity_2,
                preview = R.drawable.img_medium_1_activity_2,
                title = "Sollicitudin eu dui tincidunt vestibulum",
                content = "Sed feugiat nisi vitae pulvinar placerat. Nunc mi massa, gravida at eros nec, posuere viverra elit. Mauris ut lobortis arcu, vel malesuada dolor.",
                progress = Progress(
                    value = 0.5f,
                    text = "2 more to done",
                ),
                detail = "Detail",
                action = "Next",
            ),
            Activity(
                icon = R.drawable.ic_medium_1_activity_3,
                preview = R.drawable.img_medium_1_activity_3,
                title = "Morbi feugiat posuere felis",
                content = "Duis diam orci, elementum nec diam et, bibendum porta nulla. Quisque sed turpis congue, finibus ligula ac.",
                progress = null,
                detail = "Detail",
                action = "Done",
            ),
        ),
        menus = listOf(
            Menu(
                icon = R.drawable.ic_medium_1_explore,
                text = "Explore",
                selected = true,
                notificationCount = null,
            ),
            Menu(
                icon = R.drawable.ic_medium_1_highlight,
                text = "Highlight",
                selected = false,
                notificationCount = null,
            ),
            Menu(
                icon = R.drawable.ic_medium_1_notification,
                text = "Notification",
                selected = false,
                notificationCount = 3,
            ),
        ),
    )
    Medium1Screen(uiState = uiState)
}

private data class UiState(
    val title: String,
    val subtitle: String,
    val searchHint: String,
    @DrawableRes val searchIcon: Int,
    val activities: List<Activity>,
    val menus: List<Menu>,
)

private data class Activity(
    @DrawableRes val icon: Int,
    @DrawableRes val preview: Int,
    val title: String,
    val content: String,
    val progress: Progress?,
    val detail: String,
    val action: String,
)

private data class Progress(
    @FloatRange(from = 0.0, to = 1.0) val value: Float,
    val text: String,
)

private data class Menu(
    @DrawableRes val icon: Int,
    val text: String,
    val selected: Boolean,
    val notificationCount: Int?,
)