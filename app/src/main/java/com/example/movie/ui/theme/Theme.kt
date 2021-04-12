package com.example.movie.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.common.EducatorAppTypography
import com.example.common.Shapes


@Composable
fun MovieTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    ProvideEducatorAppsColors(colors = colors) {
        MaterialTheme(
            typography = EducatorAppTypography,
            shapes = Shapes,
            content = content
        )
    }
}

object EducatorColors {
    val colors: EducatorAppsColor
        @Composable
        get() = LocalEducatorAppsColor.current
}