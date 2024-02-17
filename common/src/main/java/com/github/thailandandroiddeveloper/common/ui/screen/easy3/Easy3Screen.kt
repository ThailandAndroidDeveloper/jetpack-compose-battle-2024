package com.github.thailandandroiddeveloper.common.ui.screen.easy3

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Easy3Screen(uiState: UiState) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = uiState.backIcon),
                            contentDescription = null,
                        )
                    }
                },
                actions = {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = uiState.done, style = MaterialTheme.typography.labelLarge)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                ),
            )
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer,
    ) { paddingValues ->
        Content(
            Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            uiState = uiState,
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier, uiState: UiState
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            uiState.title,
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(horizontal = 48.dp)
        )
        Text(
            uiState.description,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(horizontal = 48.dp)
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clip(RoundedCornerShape(32.dp))
                .background(MaterialTheme.colorScheme.onPrimary),
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
