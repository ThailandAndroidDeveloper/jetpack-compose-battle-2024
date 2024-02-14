package com.github.thailandandroiddeveloper.common.ui.screen.medium2

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
import com.github.thailandandroiddeveloper.common.ui.preview.PixelTablet
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Medium2Screen(uiState: UiState) {
    // TODO
    Box(modifier = Modifier.fillMaxSize().background(Color.Green)) {
        Text(text = "Medium 2")
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