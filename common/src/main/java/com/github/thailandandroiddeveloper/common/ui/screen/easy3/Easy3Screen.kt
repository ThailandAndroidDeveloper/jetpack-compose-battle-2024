package com.github.thailandandroiddeveloper.common.ui.screen.easy3

import android.widget.CheckBox
import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
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
import com.github.thailandandroiddeveloper.common.ui.theme.LightColors.PrimaryContainer
import com.github.thailandandroiddeveloper.common.ui.theme.LightColors.TertiaryContainer
import com.github.thailandandroiddeveloper.common.ui.theme.Typography

@Composable
private fun Easy3Screen(uiState: UiState) {
    // TODO
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryContainer)
            .padding(bottom = 13.dp)
    ) {
        Column(
            modifier = Modifier.padding(
                horizontal = 16.dp
            )
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .padding(top = 16.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = uiState.backIcon),
                        contentDescription = null,
                    )
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = uiState.done, style = Typography.labelLarge)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Column(modifier = Modifier.padding(start = 48.dp)) {
                Text(text = uiState.title, style = Typography.headlineMedium)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = uiState.description, style = Typography.bodyMedium)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Surface(
                shape = RoundedCornerShape(32.dp),
                color = Color.White, modifier = Modifier
                    .fillMaxWidth()
                    .height(753.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .padding(top = 20.dp),
                    verticalArrangement = spacedBy(16.dp)
                ) {
                    uiState.friend.friends.forEach {
                        Item(friend = it)
                    }
                }
            }
        }

    }
}

@Composable
fun Item(friend: Friend) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface(shape = CircleShape) {
            Icon(
                painter = painterResource(id = friend.image),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(48.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = friend.name, modifier = Modifier.fillMaxWidth(), style = Typography.bodyLarge)
        Checkbox(checked = friend.checked, onCheckedChange = {})
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

data class Friend(
    @DrawableRes val image: Int,
    val name: String,
    val checked: Boolean,
)
