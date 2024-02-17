package com.github.thailandandroiddeveloper.common.ui.screen.easy2

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Easy2Screen(uiState: UiState) {
    // TODO
    Column(
        modifier = Modifier
            .background(
                color =  MaterialTheme.colorScheme.onTertiary
            )
    ) {
        TopAppBar(
            title = {},
            navigationIcon = {
                Icon(
                    painter = painterResource(id = uiState.menuIcon),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.tertiaryContainer
            )
        )
        Column(
            modifier = Modifier
                .background(
                    MaterialTheme.colorScheme.tertiaryContainer
                )
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .padding(
                        top = 8.dp
                    )
                    .border(
                        BorderStroke(
                            4.dp,
                            MaterialTheme.colorScheme.tertiary
                        ),
                        CircleShape
                    )
                    .clip(CircleShape)
                    .size(151.dp),
                painter = painterResource(id = uiState.profileImage),
                contentDescription = null
            )

            Text(
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        bottom = 25.dp
                    ),
                style = MaterialTheme.typography.titleLarge,
                text = uiState.displayName,
                color = MaterialTheme.colorScheme.tertiary
            )
        }

        LazyRow(
            modifier = Modifier,
            contentPadding = PaddingValues(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp
            )
        ) {
            items(uiState.tags) { tag ->
                Tag(tag = tag)
                Spacer(
                    modifier = Modifier.padding(
                        start = 8.dp
                    )
                )
            }
        }

        LazyColumn {
            items(uiState.posts) { post ->
                Card(
                    modifier = Modifier
                        .padding(
                            top = 21.dp
                        )
                        .padding(
                            horizontal = 16.dp,
                        ),
                    border = BorderStroke(
                        1.dp,
                        MaterialTheme.colorScheme.outlineVariant
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onTertiary
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp),
                    ) {
                        Row {
                            Text(
                                modifier = Modifier
                                    .weight(1f, fill = true),
                                text = post.title,
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.onTertiaryContainer,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                modifier = Modifier
                                    .background(
                                        MaterialTheme.colorScheme.tertiary,
                                        RoundedCornerShape(
                                            100.dp
                                        )
                                    )
                                    .padding(
                                        horizontal = 8.dp,
                                        vertical = 2.dp
                                    ),
                                text = post.tag,
                                color = MaterialTheme.colorScheme.onTertiary,
                                style = MaterialTheme.typography.labelSmall
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(
                                    top = 4.dp
                                ),
                            text = post.content,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.tertiary,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Tag(tag: String) {
    Text(
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.tertiary,
                RoundedCornerShape(
                    100.dp
                )
            )
            .padding(
                horizontal = 22.5.dp,
                vertical = 10.dp
            ),
        text = tag,
        color = MaterialTheme.colorScheme.onTertiary,
        style = MaterialTheme.typography.labelLarge,
    )
}

@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
@Composable
fun Easy2ScreenPreview() = AppTheme {
    val uiState = UiState(
        menuIcon = R.drawable.ic_easy_2_menu,
        profileImage = R.drawable.img_easy_2_profile,
        displayName = "John Doe (26)",
        tags = listOf("Sport", "Game", "Travel"),
        posts = listOf(
            Post(
                title = "Lorem Ipsum",
                content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse vulputate malesuada risus a venenatis. Sed dui nunc, pellentesque ac laoreet vel, feugiat nec mi.",
                tag = "Sport",
            ),
            Post(
                title = "Mauris pharetra ullamcorper leo in aliquet",
                content = "Sed tortor neque, vehicula quis libero sed, lobortis ultricies lorem. Sed eu egestas risus, sed tempus odio. Vivamus id ligula purus. In hac habitasse platea dictumst.",
                tag = "Travel",
            ),
            Post(
                title = "Donec condimentum egestas mollis",
                content = "Ut quis mauris vel velit condimentum lacinia. Nulla dui quam, accumsan eleifend tristique et, consequat vel dolor. Integer dignissim lectus sapien, a dictum dui auctor vitae. Morbi non nisl interdum.",
                tag = "Game",
            ),
            Post(
                title = "Proin felis tellus, ultricies sit amet porta id",
                content = "Commodo vestibulum enim. Proin sollicitudin dui vitae sem placerat, in luctus mauris condimentum. Phasellus egestas, nisl a efficitur bibendum, leo est vehicula metus, vitae consequat erat eros et felis.",
                tag = "Game",
            ),
        ),
    )
    Easy2Screen(uiState = uiState)
}

private data class UiState(
    @DrawableRes val menuIcon: Int,
    @DrawableRes val profileImage: Int,
    val displayName: String,
    val tags: List<String>,
    val posts: List<Post>,
)

private data class Post(
    val title: String,
    val content: String,
    val tag: String,
)
