package com.github.thailandandroiddeveloper.common.ui.screen.easy3

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Easy3Screen(uiState: UiState) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 148.dp)
                .background(MaterialTheme.colorScheme.onPrimary, RoundedCornerShape(32.dp))
                .fillMaxWidth()
                .height(753.dp)
        ) {

        }
    }
}

@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
@Composable
fun Easy3ScreenPreview() = AppTheme {
    val uiState = UiState(
        backIcon = R.drawable.ic_easy_3_back,
        done = "Done",
        title = "Invite your friend",
        description = "68 friends in your list",
        friend = FriendSection(
            checkedIcon = R.drawable.ic_easy_3_check,
            friends = listOf(
                Friend(
                    image = R.drawable.img_easy_3_celia,
                    name = "Celia Stevens",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_angelo,
                    name = "Angelo Tran",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_miranda,
                    name = "Miranda Coleman",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_sam,
                    name = "Sam Burgess",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_sherrie,
                    name = "Sherrie Tucker",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_dorothy,
                    name = "Dorothy Crowley",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_douglas,
                    name = "Douglas Frost",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_jonathan,
                    name = "Jonathan Rhodes",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_marshall,
                    name = "Marshall Juarez",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_grace,
                    name = "Grace Dougherty",
                    checked = true,
                ),
                Friend(
                    image = R.drawable.img_easy_3_tommy,
                    name = "Tommy Wright",
                    checked = false,
                ),
                Friend(
                    image = R.drawable.img_easy_3_gerald,
                    name = "Gerald Alexander",
                    checked = false,
                ),
            )
        ),
    )
    Easy3Screen(uiState = uiState)
}

private data class UiState(
    @DrawableRes val backIcon: Int,
    val done: String,
    val title: String,
    val description: String,
    val friend: FriendSection,
)

private data class FriendSection(
    @DrawableRes val checkedIcon: Int,
    val friends: List<Friend>,
)

private data class Friend(
    @DrawableRes val image: Int,
    val name: String,
    val checked: Boolean,
)
