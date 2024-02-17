package com.github.thailandandroiddeveloper.common.ui.screen.easy2

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
private fun Easy2Screen(uiState: UiState) {
    // TODO
    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = uiState.menuIcon),
                            contentDescription = ""
                        )
                    }
                },
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.tertiaryContainer),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = uiState.profileImage),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .border(4.dp, MaterialTheme.colorScheme.tertiary, CircleShape)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = uiState.displayName,
                    style = MaterialTheme.typography.titleLarge.copy(MaterialTheme.colorScheme.tertiary)
                )
            }
            Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
                LazyRow {
                    items(uiState.tags) {
                        SuggestChip(tag = it)
                    }
                }
            }
            LazyColumn {
                items(uiState.posts) {
                    CardDetail(it)
                }
            }
        }
    }
}

@Composable
private fun CardDetail(post: Post) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
    ) {
        Row {
            Text(
                text = post.title,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = post.tag,
                Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = MaterialTheme.colorScheme.tertiary)
                    .padding(vertical = 4.dp, horizontal = 8.dp),
                style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onTertiary)
            )
        }
    }
}

@Composable
fun SuggestChip(tag: String) {
    Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.tertiary
        )
    ) {
        Text(text = tag)
    }
    Spacer(modifier = Modifier.width(8.dp))
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
