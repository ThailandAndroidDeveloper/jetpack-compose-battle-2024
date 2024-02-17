package com.github.thailandandroiddeveloper.common.ui.screen.easy1

import androidx.annotation.DrawableRes
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Easy1Screen(uiState: UiState) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(top = 72.dp)
                .padding(horizontal = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
            ) {
                Spacer(modifier = Modifier.height(80.dp))
                Image(
                    modifier = Modifier
                        .width(116.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = uiState.items[2].resource),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    modifier = Modifier
                        .width(116.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = uiState.items[1].resource),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    modifier = Modifier
                        .width(116.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = uiState.items[0].resource),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    modifier = Modifier
                        .width(116.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = uiState.items[3].resource),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    modifier = Modifier
                        .width(116.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = uiState.items[2].resource),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    modifier = Modifier
                        .width(116.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = uiState.items[1].resource),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            Column(
                modifier = Modifier.weight(1f),
            ) {

            }
            Column(
                modifier = Modifier.weight(1f),
            ) {

            }
        }
    }
}

@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
@Composable
fun Easy1ScreenPreview() = AppTheme {
    val uiState = UiState(
        menus = listOf(
            Menu(text = "Home"),
            Menu(text = "Today"),
            Menu(text = "Following"),
        ),
        items = listOf(
            Item(resource = R.drawable.img_easy_1_gallery_1),
            Item(resource = R.drawable.img_easy_1_gallery_2),
            Item(resource = R.drawable.img_easy_1_gallery_3),
            Item(resource = R.drawable.img_easy_1_gallery_4),
        ),
    )
    Easy1Screen(uiState = uiState)
}

private data class UiState(
    val menus: List<Menu>,
    val items: List<Item>,
)

private data class Menu(
    val text: String,
)

private data class Item(
    @DrawableRes val resource: Int,
)