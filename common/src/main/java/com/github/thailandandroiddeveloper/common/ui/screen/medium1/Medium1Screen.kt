package com.github.thailandandroiddeveloper.common.ui.screen.medium1

import androidx.annotation.DrawableRes
import androidx.annotation.FloatRange
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Medium1Screen(uiState: UiState) {
    Scaffold(
        topBar = {
            MTopAppBar(uiState)
        },
        bottomBar = {
            MBottomBar(uiState)
        },
        containerColor = MaterialTheme.colorScheme.background,
    ) { paddingValues ->
        Content(
            Modifier
                .padding(paddingValues)
                .fillMaxSize()
        )
    }
}

@Composable
fun Content(
    modifier: Modifier = Modifier,
) {

}

@Composable
private fun MTopAppBar(uiState: UiState) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFD8E4))
            .padding(horizontal = 32.dp)
            .padding(top = 34.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = uiState.title, style = MaterialTheme.typography.headlineMedium)
        Text(
            modifier = Modifier.height(72.dp),
            text = uiState.subtitle,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis
        )
        TextField(
            modifier = Modifier
                .width(241.dp)
                .height(40.dp),
            value = "", onValueChange = {},
            trailingIcon = {
                Icon(
                    painter = painterResource(uiState.searchIcon),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(MaterialTheme.colorScheme.tertiary)
                        .padding(4.dp)
                )
            },
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = MaterialTheme.colorScheme.onTertiary,
                unfocusedIndicatorColor = Color.Transparent,
            )
        )
    }
}

@Composable
private fun MBottomBar(uiState: UiState) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
    ) {
        uiState.menus.forEach {
            NavigationBarItem(
                selected = it.selected,
                label = {
                    Text(text = it.text)
                },
                onClick = { /*TODO*/ }, icon = {
                    Icon(painter = painterResource(it.icon), contentDescription = null)
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color(0xFFEFB8C8),
                )
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