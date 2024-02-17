package com.github.thailandandroiddeveloper.common.ui.screen.medium1

import androidx.annotation.DrawableRes
import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Medium1Screen(uiState: UiState) {
    // TODO
    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = Modifier.height(80.dp),
                containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            ) {
                uiState.menus.forEach {
                    NavigationBarItem(
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = MaterialTheme.colorScheme.onTertiaryContainer,
                            selectedTextColor = MaterialTheme.colorScheme.onTertiaryContainer,
                            unselectedIconColor = MaterialTheme.colorScheme.onSurface,
                            unselectedTextColor = MaterialTheme.colorScheme.onSurface,
                            indicatorColor = MaterialTheme.colorScheme.tertiary
                        ),
                        selected = it.selected, onClick = { /*TODO*/ },
                        icon = {
                            BadgedBox(badge = {
                                if (it.notificationCount != null) {
                                    Badge {
                                        Text(text = "${it.notificationCount}")
                                    }
                                }
                            }) {
                                Icon(
                                    painter = painterResource(id = it.icon),
                                    contentDescription = null
                                )
                            }
                        },
                        label = { Text(text = it.text) }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiaryContainer)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(232.dp)
                            .padding(horizontal = 32.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier.padding(
                                top = 34.dp
                            ),
                            text = uiState.title,
                            style = MaterialTheme.typography.headlineMedium,
                        )
                        Text(
                            text = uiState.subtitle,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 3,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.tertiary
                        )
                        Box(
                            Modifier
                                .height(40.dp)
                                .width(214.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.onTertiary),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Text(
                                modifier = Modifier.padding(start = 10.dp),
                                text = uiState.searchHint,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Icon(
                                modifier = Modifier
                                    .size(32.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(MaterialTheme.colorScheme.tertiary)
                                    .padding(4.dp)
                                    .align(Alignment.CenterEnd),
                                painter = painterResource(id = uiState.searchIcon),
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onTertiary
                            )
                        }
                    }
                }
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.padding(start = 76.dp, top = 16.dp)
                ) {
                    items(uiState.activities) { act ->
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.onTertiary
                            ),
                            modifier = Modifier
                                .width(303.dp)
                        ) {
                            Column(
                            ) {
                                Image(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(82.dp),
                                    painter = painterResource(id = act.preview),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier.padding(
                                        start = 16.dp,
                                        end = 16.dp,
                                        bottom = 16.dp
                                    )
                                ) {
                                    Column {
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = act.title,
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                        Spacer(modifier = Modifier.height(1.dp))
                                        Text(
                                            textAlign = TextAlign.Start,
                                            maxLines = 2,
                                            overflow = TextOverflow.Ellipsis,
                                            text = act.content,
                                            style = MaterialTheme.typography.bodyLarge,
                                        )
                                    }
                                    if (act.progress != null) {
                                        Spacer(modifier = Modifier.height(16.dp))
                                        LinearProgressIndicator(
                                            strokeCap = StrokeCap.Round,
                                            modifier = Modifier.fillMaxWidth()
                                                .height(8.dp)
                                                .clip(RoundedCornerShape(8.dp))
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Box(
                                            Modifier.fillMaxWidth(),
                                            contentAlignment = Alignment.CenterEnd
                                        ) {
                                            Text(text = act.progress.text)
                                        }
                                    }
                                    Box(
                                        Modifier.fillMaxWidth()
                                    ) {
                                        Row(
                                            modifier = Modifier.align(Alignment.TopEnd)
                                        ) {
                                            Button(
                                                onClick = { /*TODO*/ },
                                                colors = ButtonDefaults.buttonColors(
                                                    containerColor = MaterialTheme.colorScheme.onTertiary,
                                                    contentColor = MaterialTheme.colorScheme.onTertiaryContainer
                                                ),
                                            ) {
                                                Text(text = act.detail)

                                            }
                                            Spacer(modifier = Modifier.width(8.dp))
                                            Button(
                                                modifier = Modifier.clip(RoundedCornerShape(8.dp)),
                                                colors = ButtonDefaults.buttonColors(
                                                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                                                    contentColor = MaterialTheme.colorScheme.onTertiaryContainer
                                                ),
                                                onClick = { /*TODO*/ }) {
                                                Text(text = act.action)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
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