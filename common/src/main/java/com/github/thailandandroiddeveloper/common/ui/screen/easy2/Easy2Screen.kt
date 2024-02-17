package com.github.thailandandroiddeveloper.common.ui.screen.easy2

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
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
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                ),
                navigationIcon = {
                    IconButton(onClick = {},
                        modifier = Modifier.size(48.dp)) {
                        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_qualify_1_menu),
                            contentDescription = "Menu")
                    }

                },
                title = {  },
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->
        Column (modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(innerPadding)) {

            Column (modifier = Modifier.fillMaxWidth().height(221.dp)
                .background(MaterialTheme.colorScheme.tertiaryContainer)
                .padding(top = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally){

                Image(painter = painterResource(id = uiState.profileImage),
                    contentDescription = "image description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(151.dp).clip(CircleShape).border(4.dp, MaterialTheme.colorScheme.tertiary, CircleShape)
                )

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
