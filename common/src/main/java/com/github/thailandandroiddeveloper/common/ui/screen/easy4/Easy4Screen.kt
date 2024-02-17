package com.github.thailandandroiddeveloper.common.ui.screen.easy4

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.PixelTablet
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
private fun Easy4Screen(uiState: UiState) {
    // TODO
    Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.Start) {
        Image(painter = painterResource(id = uiState.map),
            contentDescription = "image description",
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxHeight().width(668.dp) )

        Box(Modifier.fillMaxHeight().width(12.dp).background(MaterialTheme.colorScheme.outline))

        Box(Modifier.fillMaxHeight().weight(1f).background(MaterialTheme.colorScheme.onPrimary))
    }
}

@Preview(group = PixelTablet.name, device = PixelTablet.spec, showBackground = true)
@Composable
fun Easy4ScreenPreview() = AppTheme {
    val uiState = UiState(
        closeIcon = R.drawable.ic_easy_4_close,
        map = R.drawable.img_easy_4_map,
        from = Location(
            image = R.drawable.img_easy_4_muvmi,
            pinIcon = R.drawable.ic_easy_4_location,
            address = "33 SPACE 15 17 Soi Pradipat, พญาไท Phaya Thai, Bangkok 10400",
        ),
        to = Location(
            image = R.drawable.img_easy_4_lmwn,
            pinIcon = R.drawable.ic_easy_4_location,
            address = "T-ONE BUILDING, อาคาร ทีวัน 8 Sukhumvit Rd, Phra Khanong, Khlong Toei, Bangkok 10110",
        ),
        travelIcon = R.drawable.ic_easy_4_car,
        durationInfo = Info(
            icon = R.drawable.ic_easy_4_duration,
            text = "17 min",
        ),
        distanceInfo = Info(
            icon = R.drawable.ic_easy_4_distance,
            text = "12.1 km",
        ),
    )
    Easy4Screen(uiState = uiState)
}

private data class UiState(
    @DrawableRes val closeIcon: Int,
    @DrawableRes val map: Int,
    val from: Location,
    val to: Location,
    @DrawableRes val travelIcon: Int,
    val durationInfo: Info,
    val distanceInfo: Info,
)

private data class Location(
    @DrawableRes val image: Int,
    @DrawableRes val pinIcon: Int,
    val address: String,
)

private data class Info(
    @DrawableRes val icon: Int,
    val text: String,
)
