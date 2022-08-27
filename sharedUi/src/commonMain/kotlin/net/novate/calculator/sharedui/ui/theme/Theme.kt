package net.novate.calculator.sharedui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val lightPrimaryColor = Color(0xFF0B58F7)
val lightBackgroundColor = Color(0xFFE9ECF1)
val lightSurfaceColor = Color(0xFFF3F4F6)

val lightButtonColor = Color.White

val lightPrimaryTextColor = Color(0xFF181818)
val lightSecondaryTextColor = Color(0xFF626262)

private val DarkColorPalette = darkColors()

private val LightColorPalette = lightColors(
    primary = lightPrimaryColor,
    primaryVariant = lightPrimaryColor,
    secondary = lightPrimaryColor,
    secondaryVariant = lightPrimaryColor,
    background = lightBackgroundColor,
    surface = lightSurfaceColor,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black
)


@Composable
fun CalculatorTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        content = content
    )
}