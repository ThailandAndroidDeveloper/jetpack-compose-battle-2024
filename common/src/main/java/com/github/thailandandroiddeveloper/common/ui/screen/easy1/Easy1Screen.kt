package com.github.thailandandroiddeveloper.common.ui.screen.easy1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Easy1Screen(uiState: UiState) {
    // TODO
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)) {
        Text(text = "Easy 1")
    }
    Column {
        Text(text = "Easy 1")
        Text(text = "Easy 1")
        Text(text = "Easy 1")
        Text(text = "Easy 1")
        Text(text = "Easy 1")
        Text(text = "Easy 7")
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