package com.github.thailandandroiddeveloper.common.ui.screen.easy1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Easy1Screen(uiState: UiState) {
    // TODO
    Column {
        Row(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary)) {
            uiState.menus.forEach {
                TextButton(modifier = Modifier
                    .padding(8.dp)
                    .height(40.dp),
                    onClick = { }) {
                    Text(text = it.text)
                }
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 30.dp)
        ) {
            uiState.items[0].resource
            item(span = {
                // LazyGridItemSpanScope:
                // maxLineSpan
                GridItemSpan(maxLineSpan)
            }) {
                Image(painter = painterResource(id = uiState.items[0].resource),
                    contentDescription = "image description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 16.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
            // ...
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