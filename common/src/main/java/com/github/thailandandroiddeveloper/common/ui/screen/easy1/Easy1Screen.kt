package com.github.thailandandroiddeveloper.common.ui.screen.easy1

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Easy1Screen(uiState: UiState) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(1500.dp)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.height(40.dp)
        ) {
            uiState.menus.forEach {
                Text(
                    text = it.text,
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(vertical = 10.dp, horizontal = 12.dp)
                )
            }
        }
        Content(uiState)
    }
}

@Composable
private fun Content(uiState: UiState) {
    Row(
        modifier = Modifier
            .height(1000.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        ImgCol(uiState = uiState, modifier = Modifier.padding(top = 80.dp))
        ImgCol(uiState = uiState, modifier = Modifier.padding(top = 40.dp))
        ImgCol(uiState = uiState, modifier = Modifier.padding(top = 0.dp))
    }
}

@Composable
private fun ImgCol(
    modifier: Modifier = Modifier,
    uiState: UiState,
    offset: Int = 0,
) {
    Column(
        modifier = modifier.height(1500.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        uiState.items.forEach { item ->
            Image(
                painter = painterResource(item.resource),
                contentDescription = null,
                modifier = Modifier
                    .size(116.dp, 120.dp)
                    .clip(
                        RoundedCornerShape(8.dp)
                    )
            )
        }
        uiState.items.forEach { item ->
            Image(
                painter = painterResource(item.resource),
                contentDescription = null,
                modifier = Modifier
                    .size(116.dp, 120.dp)
                    .clip(
                        RoundedCornerShape(8.dp)
                    )
            )
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