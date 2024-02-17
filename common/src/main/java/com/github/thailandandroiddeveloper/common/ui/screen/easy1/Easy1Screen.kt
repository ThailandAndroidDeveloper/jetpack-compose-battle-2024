package com.github.thailandandroiddeveloper.common.ui.screen.easy1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
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
    // TODO Hello
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary)
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp)
    ) {
        Row {
            uiState.menus.forEach {
                val color = if (it.text == "Home") {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
                }
                Text(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                    text = it.text,
                    style = MaterialTheme.typography.labelLarge,
                    color = color
                )
            }
        }
        Row {
            Column(
                modifier = Modifier
                    .width(116.dp)
                    .padding(top = 96.dp)
                    .verticalScroll(ScrollState(0))

            ) {
                (6 downTo 0).forEach {
                    Image(
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .height(120.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        painter = painterResource(id = uiState.items[(it)%4].resource),
                        contentDescription = null
                    )
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .width(116.dp)
                    .padding(top = 56.dp)
                    .verticalScroll(ScrollState(0))
            ) {
                (6 downTo 0).forEach {
                    Image(
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        painter = painterResource(id = uiState.items[(it+3)%4].resource),
                        contentDescription = null
                    )
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .width(116.dp)
                    .padding(top = 16.dp)
                    .verticalScroll(ScrollState(0))
            ) {
                (6 downTo 0).forEach {
                    Image(
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        painter = painterResource(id = uiState.items[(it+2)%4].resource),
                        contentDescription = null
                    )
                }
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