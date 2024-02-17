package com.github.thailandandroiddeveloper.common.ui.screen.hard1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.preview.PixelTablet
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Hard1Screen(uiState: UiState) {
    // TODO
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        if (minHeight > minWidth) {
            Column {
                Box(modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.background,
                        shape = RoundedCornerShape(bottomStart = 100.dp, bottomEnd = 100.dp)
                    )
                    .height(148.dp)
                    .fillMaxWidth()
                ) {
                    Text(
                        modifier = Modifier.padding(top = 48.dp, start = 32.dp),
                        text = uiState.welcome.greeting,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        modifier = Modifier.padding(top = 68.dp, start = 32.dp),
                        text = uiState.welcome.name,
                        style = MaterialTheme.typography.headlineLarge,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                uiState.cards.forEach {
                    when (it) {
                        is Card.Post -> {
                            ItemWithImage(
                                imageRes = it.photo, text = it.text
                            )
                        }
                        is Card.Reward -> {
                            ItemWithReward(it.icon, it.text)
                        }
                        is Card.Suggestion -> {
                            ItemSuggestion(it.text, it.moreIcon)
                        }
                    }
                }
            }
        } else {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 32.dp, bottom = 40.dp)
                        .background(MaterialTheme.colorScheme.background, RoundedCornerShape(12.dp))
                        .width(156.dp)
                        .height(337.dp)
                        .padding(vertical = 10.dp, horizontal = 8.dp)
                ) {
                    uiState.primaryMenus[0].menus.forEach {
                        MenuItem(primaryMenu = it, isSelect = it.text == "Home")
                    }
                    Divider(Modifier.size(124.dp, 1.dp))
                }
            }
        }
    }
}

@Composable
private fun MenuItem(primaryMenu: PrimaryMenu.Item, isSelect: Boolean) {
    val bg = if (isSelect) {
        MaterialTheme.colorScheme.primaryContainer
    } else {
        MaterialTheme.colorScheme.background
    }
    Row(
        modifier = Modifier
            .size(width = 140.dp, height = 44.dp)
            .padding(bottom = 8.dp)
            .background(bg, RoundedCornerShape(8.dp))
    ) {
        Image(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = primaryMenu.icon), contentDescription = null)
        Text(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
            text = primaryMenu.text,
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.primary
        )

    }
}

@Composable
private fun ItemSuggestion(text: String, icon: Int) {
    Row(
        Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .height(80.dp)
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            modifier = Modifier.width(284.dp),
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, top = 12.dp, bottom = 12.dp),
            text = "More",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis
        )
        Image(
            modifier = Modifier
                .padding(start = 5.dp)
                .padding(vertical = 32.dp),
            painter = painterResource(icon), contentDescription = null)
    }
}

@Composable
private fun ItemWithReward(icon: Int, text: String) {
    Row(
        Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .height(50.dp)
            .fillMaxWidth()
            .padding(9.dp)
    ) {
        Image(modifier = Modifier
            .size(width = 32.dp, height = 32.dp)
            .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(4.dp))
            .padding(4.dp),
            painter = painterResource(id = icon), contentDescription = null,
            contentScale = ContentScale.FillBounds)
        Text(
            modifier = Modifier.padding(start = 8.dp, top = 5.dp),
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}

@Composable
private fun ItemWithImage(
    imageRes: Int, text: String
) {
    Row(
        Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .height(108.dp)
            .fillMaxWidth()
    ) {
        Image(modifier = Modifier.size(width = 120.dp, height = 108.dp),
            painter = painterResource(id = imageRes), contentDescription = null,
            contentScale = ContentScale.FillBounds)
        Text(
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 20.dp),
            text = text,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
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