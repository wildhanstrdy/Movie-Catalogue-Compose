package com.example.movie.ui.theme

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.example.common.ColorsPallete


val DarkColorPalette =  EducatorAppsColor(
    appHomeRecyclerViewItemColor = ColorsPallete.Purple200,
    appHomeRecyclerViewTextColor = ColorsPallete.White,
    appHomeRecyclerViewDividerColor = ColorsPallete.White
)

val LightColorPalette = EducatorAppsColor(
    appHomeRecyclerViewItemColor = ColorsPallete.Teal200,
    appHomeRecyclerViewTextColor = ColorsPallete.White,
    appHomeRecyclerViewDividerColor = ColorsPallete.Black
)

@Composable
fun ProvideEducatorAppsColors(
    colors: EducatorAppsColor,
    content: @Composable () -> Unit
) {
    val colorPalette = remember {
        colors
    }
    colorPalette.updateColor(colors)
    CompositionLocalProvider(LocalEducatorAppsColor provides colorPalette, content = content)
}

val LocalEducatorAppsColor = staticCompositionLocalOf<EducatorAppsColor> {
    error("No EducatorAppsColor provided")
}

class EducatorAppsColor(
    appHomeRecyclerViewItemColor: Color,
    appHomeRecyclerViewTextColor: Color,
    appHomeRecyclerViewDividerColor: Color
) {
    var appHomeRecyclerViewItemColor by mutableStateOf(appHomeRecyclerViewItemColor)
        private set
    var appHomeRecyclerViewTextColor by mutableStateOf(appHomeRecyclerViewTextColor)
        private set
    var appHomeRecyclerViewDividerColor by mutableStateOf(appHomeRecyclerViewDividerColor)
        private set

    fun updateColor(colors: EducatorAppsColor) {
        appHomeRecyclerViewItemColor = colors.appHomeRecyclerViewItemColor
        appHomeRecyclerViewTextColor = colors.appHomeRecyclerViewTextColor
        appHomeRecyclerViewDividerColor = colors.appHomeRecyclerViewDividerColor
    }
}
