package com.github.thailandandroiddeveloper.common.ui.screen.hard1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.preview.PixelTablet
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Hard1Screen(uiState: UiState) {
    // TODO
    Box(modifier = Modifier.fillMaxSize().background(Color.Green)) {
        Text(text = "Hard 1")
    }
}

@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
@Preview(group = PixelTablet.name, device = PixelTablet.spec, showBackground = true)
@Composable
fun Hard1ScreenPreview() = AppTheme {
    val uiState = UiState(
        welcome = Welcome(
            greeting = "Good evening",
            name = "John Doe",
        ),
        topMenu = TopMenu(
            items = listOf(
                TopMenu.Item(
                    icon = R.drawable.ic_hard_1_notification,
                    showBadge = true,
                ),
                TopMenu.Item(
                    icon = R.drawable.img_hard_1_profile,
                    showBadge = false
                ),
            )
        ),
        primaryMenus = listOf(
            PrimaryMenu(
                menus = listOf(
                    PrimaryMenu.Item(
                        icon = R.drawable.ic_hard_1_home,
                        text = "Home",
                        selected = true,
                    ),
                    PrimaryMenu.Item(
                        icon = R.drawable.ic_hard_1_search,
                        text = "Search",
                        selected = false,
                    ),
                    PrimaryMenu.Item(
                        icon = R.drawable.ic_hard_1_event,
                        text = "Event",
                        selected = false,
                    ),
                    PrimaryMenu.Item(
                        icon = R.drawable.ic_hard_1_favourite,
                        text = "Favourite",
                        selected = false,
                    ),
                ),
            ),
            PrimaryMenu(
                menus = listOf(
                    PrimaryMenu.Item(
                        icon = R.drawable.ic_hard_1_lab,
                        text = "Lab",
                        selected = false,
                    ),
                    PrimaryMenu.Item(
                        icon = R.drawable.ic_hard_1_settings,
                        text = "Settings",
                        selected = false,
                    ),
                ),
            )
        ),
        cards = listOf(
            Card.Post(
                photo = R.drawable.img_hard_1_post_1,
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vitae mauris vitae turpis euismod pharetra. Donec dui odio, commodo vitae erat vitae, ullamcorper pellentesque neque. Proin iaculis porttitor risus. Maecenas at finibus erat. Fusce mauris dui, cursus vel ultricies lacinia, tristique eu odio.",
                likeButton = R.drawable.ic_hard_1_like,
                shareButton = R.drawable.ic_hard_1_share,
            ),
            Card.Reward(
                icon = R.drawable.ic_hard_1_reward,
                text = "Lorem ipsum dolor sit amet.",
            ),
            Card.Post(
                photo = R.drawable.img_hard_1_post_3,
                text = "Curabitur semper felis ex, sit amet pulvinar leo eleifend eu. Sed quis nibh ut orci tempus posuere. Morbi elementum sapien ante, id aliquam odio ultrices eu. Nam quis lacus pellentesque, sollicitudin diam ut, elementum urna. Nullam ut turpis justo. Nam nulla ante, ornare eget purus ornare, mattis tempor eros. Proin sem mi",
                likeButton = R.drawable.ic_hard_1_like,
                shareButton = R.drawable.ic_hard_1_share,
            ),
            Card.Post(
                photo = R.drawable.img_hard_1_post_4,
                text = "Pellentesque nec dolor a nibh pellentesque faucibus ac vel dui. Aenean non commodo dui. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                likeButton = R.drawable.ic_hard_1_like,
                shareButton = R.drawable.ic_hard_1_share,
            ),
            Card.Suggestion(
                text = "Morbi eu mauris sapien. Praesent fringilla euismod orci, eget facilisis lorem lobortis a. Nunc facilisis elit vitae lorem efficitur, vel aliquam metus tincidunt.",
                moreButton = "More",
                moreIcon = R.drawable.ic_hard_1_more,
            ),
            Card.Post(
                photo = R.drawable.img_hard_1_post_6,
                text = "Vestibulum nec sem tincidunt, luctus erat id, semper velit. Donec pretium, ex hendrerit laoreet dignissim, odio erat efficitur augue, vel feugiat ligula eros et dui. Pellentesque porta eget dolor sit amet blandit.",
                likeButton = R.drawable.ic_hard_1_like,
                shareButton = R.drawable.ic_hard_1_share,
            ),
            Card.Suggestion(
                text = "Proin condimentum sagittis sem ut viverra. Donec vel rhoncus quam. Cras id urna vulputate dui convallis tincidunt non ut ipsum. Sed euismod lobortis lectus ac auctor.",
                moreButton = "More",
                moreIcon = R.drawable.ic_hard_1_more,
            ),
            Card.Post(
                photo = R.drawable.img_hard_1_post_8,
                text = "Aliquam tristique nulla efficitur ornare dignissim. Integer tempor risus vel pretium pharetra. Etiam mattis, turpis at eleifend porttitor, ipsum nunc elementum erat, eget porttitor ante ante quis massa.",
                likeButton = R.drawable.ic_hard_1_like,
                shareButton = R.drawable.ic_hard_1_share,
            ),
            Card.Post(
                photo = R.drawable.img_hard_1_post_9,
                text = "Phasellus ligula leo, consequat a viverra at, dignissim vel lorem. Proin suscipit nibh et diam interdum, vel placerat turpis venenatis. Morbi lacinia pharetra ligula, ac ornare tortor tincidunt eget. Aenean vel tincidunt ante. Etiam aliquet tristique dui nec dignissim. Mauris et rhoncus dolor.",
                likeButton = R.drawable.ic_hard_1_like,
                shareButton = R.drawable.ic_hard_1_share,
            ),
        ),
    )
    Hard1Screen(uiState = uiState)
}

private data class UiState(
    val welcome: Welcome,
    val topMenu: TopMenu,
    val primaryMenus: List<PrimaryMenu>,
    val cards: List<Card>,
)

private data class Welcome(
    val greeting: String,
    val name: String,
)

private data class TopMenu(
    val items: List<Item>,
) {
    data class Item(
        @DrawableRes val icon: Int,
        val showBadge: Boolean,
    )
}

private data class PrimaryMenu(
    val menus: List<Item>,
) {
    data class Item(
        @DrawableRes val icon: Int,
        val text: String,
        val selected: Boolean,
    )
}

private sealed class Card {
    data class Post(
        @DrawableRes val photo: Int,
        val text: String,
        @DrawableRes val likeButton: Int,
        @DrawableRes val shareButton: Int,
    ) : Card()

    data class Reward(
        @DrawableRes val icon: Int,
        val text: String,
    ) : Card()

    data class Suggestion(
        val text: String,
        val moreButton: String,
        @DrawableRes val moreIcon: Int,
    ) : Card()
}