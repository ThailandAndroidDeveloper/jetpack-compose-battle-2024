package com.github.thailandandroiddeveloper.common.ui.screen.easy2

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme
import com.github.thailandandroiddeveloper.common.ui.theme.LightColors.Tertiary
import com.github.thailandandroiddeveloper.common.ui.theme.LightColors.TertiaryContainer
import com.github.thailandandroiddeveloper.common.ui.theme.Typography

@Composable
private fun Easy2Screen(uiState: UiState) {
    // TODO
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(TertiaryContainer)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .padding(top = 16.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = uiState.menuIcon),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(221.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Surface(
                    shape = CircleShape,
                    border = BorderStroke(width = 4.dp, color = Tertiary)
                ) {
                    Icon(
                        painter = painterResource(id = uiState.profileImage),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                }
                Text(text = uiState.displayName, style = Typography.titleLarge)
                Spacer(modifier = )
            }

            Column(
                Modifier
                    .background(color = Color.White)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {

            }
        }
    }
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
