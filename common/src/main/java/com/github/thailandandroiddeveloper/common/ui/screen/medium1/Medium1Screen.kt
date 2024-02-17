package com.github.thailandandroiddeveloper.common.ui.screen.medium1

import androidx.annotation.DrawableRes
import androidx.annotation.FloatRange
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Medium1Screen(uiState: UiState) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.onPrimary
    ) { innerPadding ->
        Box(
            modifier = Modifier,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(MaterialTheme.colorScheme.background)
            ) {
                Box(
                    modifier = Modifier
                        .height(232.dp)
                        .background(Color(0xffFFD8E4))
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(18.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 76.dp, end = 32.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    uiState.activities.forEachIndexed { index, activity ->
                        PostItem(activity)
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .height(80.dp)
                    .background(Color(0xffFFD8E4))
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
private fun PostItem(activity: Activity) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(8.dp)
            )
            .border(
                1.dp,
                MaterialTheme.colorScheme.onSurfaceVariant,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(shape = RoundedCornerShape(8.dp)),
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            modifier = Modifier.height(82.dp),
            painter = painterResource(id = activity.preview),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = activity.title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onTertiaryContainer
        )
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = activity.content,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.tertiary
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(53.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = activity.detail,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.tertiary
            )
            Text(
                modifier = Modifier.background(MaterialTheme.colorScheme.tertiary),
                text = activity.action,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onTertiaryContainer
            )
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