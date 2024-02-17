package com.github.thailandandroiddeveloper.common.ui.screen.medium2

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.PixelTablet
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Medium2Screen(uiState: UiState) {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Drawer(
            modifier = Modifier
                .fillMaxHeight()
                .width(300.dp), uiState = uiState
        )
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(2.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
        Content(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
        )
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(2.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
        Message(
            modifier = Modifier
                .fillMaxHeight()
                .width(320.dp)
        )
    }
}

@Composable
private fun Drawer(
    modifier: Modifier = Modifier,
    uiState: UiState,
) {
    Column(
        modifier = modifier.background(MaterialTheme.colorScheme.onPrimary)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(96.dp)
                .background(MaterialTheme.colorScheme.primary)
                .padding(horizontal = 32.dp, vertical = 8.dp),
            contentAlignment = Alignment.BottomStart,
        ) {
            Text(
                text = uiState.menu.title,
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.headlineMedium
            )
        }
        uiState.menu.menus.forEach {
            MenuPack(it)
        }
    }
}

@Composable
private fun MenuPack(munus: List<Menu>) {
    Column(
        modifier = Modifier.padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        munus.forEach {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(38.dp)
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painterResource(it.icon),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = it.text,
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .padding(horizontal = 16.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.background(MaterialTheme.colorScheme.background)
    ) {

    }
}

@Composable
private fun Message(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.background(MaterialTheme.colorScheme.onPrimary)
    ) {

    }
}


@Preview(group = PixelTablet.name, device = PixelTablet.spec, showBackground = true)
@Composable
fun Medium2ScreenPreview() = AppTheme {
    val uiState = UiState(
        menu = MenuSection(
            title = "Lorem Ipsum",
            menus = listOf(
                listOf(
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_home,
                        text = "Home",
                        selected = false,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_feed,
                        text = "Feed",
                        selected = true,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_profile,
                        text = "Profile",
                        selected = false,
                    ),
                ),
                listOf(
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_bookmark,
                        text = "Bookmark",
                        selected = false,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_event,
                        text = "Event",
                        selected = false,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_group,
                        text = "Group",
                        selected = false,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_friend,
                        text = "Friend",
                        selected = false,
                    ),
                ),
                listOf(
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_about,
                        text = "About",
                        selected = false,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_settings,
                        text = "Settings",
                        selected = false,
                    ),
                    Menu(
                        icon = R.drawable.ic_medium_2_menu_exit,
                        text = "Exit",
                        selected = false,
                    ),
                )
            ),
        ),
        posts = listOf(
            Post(
                profileImage = R.drawable.img_medium_2_feed_marshall,
                name = "Marshall Juarez",
                handle = "@marshall.j",
                formattedDatetime = "12:39 PM",
                photo = null,
                content = "Aliquam tristique nulla efficitur ornare dignissim. Integer tempor risus vel pretium pharetra. Etiam mattis, turpis at eleifend porttitor, ipsum nunc elementum erat, eget porttitor ante ante quis massa.",
                comment = R.drawable.ic_medium_2_comment,
                like = R.drawable.ic_medium_2_like,
                share = R.drawable.ic_medium_2_share,
            ),
            Post(
                profileImage = R.drawable.img_medium_2_feed_angelo,
                name = "Angelo Tran",
                handle = "@angelo.t",
                formattedDatetime = "11:40 AM",
                photo = R.drawable.img_medium_2_post_2_photo,
                content = "Proin condimentum sagittis sem ut viverra. Donec vel rhoncus quam. Cras id urna vulputate dui convallis tincidunt non ut ipsum.",
                comment = R.drawable.ic_medium_2_comment,
                like = R.drawable.ic_medium_2_like,
                share = R.drawable.ic_medium_2_share,
            ),
            Post(
                profileImage = R.drawable.img_medium_2_feed_douglas,
                name = "Douglas Frost",
                handle = "@douglas.f",
                formattedDatetime = "09:32 AM",
                photo = R.drawable.img_medium_2_post_2_photo,
                content = "Phasellus egestas sit amet urna nec luctus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",
                comment = R.drawable.ic_medium_2_comment,
                like = R.drawable.ic_medium_2_like,
                share = R.drawable.ic_medium_2_share,
            ),
        ),
        message = MessageSection(
            title = "Message",
            newMessageIcon = R.drawable.ic_medium_2_new_message,
            messages = listOf(
                Message(
                    sender = R.drawable.img_medium_2_message_jonathan,
                    name = "Jonathan Rhodes",
                    handle = "@jonathan.r",
                    formattedDatetime = "02:36 PM",
                    message = "Aliquam tristique nulla efficitur ornare dignissim.",
                ),
                Message(
                    sender = R.drawable.img_medium_2_message_sherrie,
                    name = "Sherrie Tucker",
                    handle = "@sherrie.t",
                    formattedDatetime = "10:02 AM",
                    message = "Donec pretium, ex hendrerit laoreet dignissim, odio erat efficitur augue, vel feugiat ligula eros et dui. Pellentesque porta eget dolor sit amet blandit.",
                ),
                Message(
                    sender = R.drawable.img_medium_2_message_tommy,
                    name = "Tommy Wright",
                    handle = "@tommy.w",
                    formattedDatetime = "Yesterday",
                    message = "Etiam mattis, turpis at eleifend porttitor, ipsum nunc elementum erat,",
                ),
                Message(
                    sender = R.drawable.img_medium_2_message_grace,
                    name = "Grace Dougherty",
                    handle = "@grace.d",
                    formattedDatetime = "Yesterday",
                    message = "Vestibulum nec sem tincidunt",
                ),
                Message(
                    sender = R.drawable.img_medium_2_message_miranda,
                    name = "Miranda Coleman",
                    handle = "@miranda.c",
                    formattedDatetime = "2 days ago",
                    message = "Aliquam tristique nulla efficitur ornare dignissim.",
                ),
            ),
        ),
    )
    Medium2Screen(uiState = uiState)
}

private data class UiState(
    val menu: MenuSection,
    val posts: List<Post>,
    val message: MessageSection,
)

private data class MenuSection(
    val title: String,
    val menus: List<List<Menu>>,
)

private data class Menu(
    @DrawableRes val icon: Int,
    val text: String,
    val selected: Boolean,
)

private data class Post(
    @DrawableRes val profileImage: Int,
    val name: String,
    val handle: String,
    val formattedDatetime: String,
    @DrawableRes val photo: Int?,
    val content: String,
    @DrawableRes val comment: Int,
    @DrawableRes val like: Int,
    @DrawableRes val share: Int,
)

private data class MessageSection(
    val title: String,
    @DrawableRes val newMessageIcon: Int,
    val messages: List<Message>,
)

private data class Message(
    @DrawableRes val sender: Int,
    val name: String,
    val handle: String,
    val formattedDatetime: String,
    val message: String,
)