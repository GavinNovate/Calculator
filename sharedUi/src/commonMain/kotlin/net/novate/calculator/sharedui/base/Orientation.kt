package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.neverEqualPolicy

/**
 * 屏幕方向
 */
enum class Orientation {
    PORTRAIT, LANDSCAPE
}

val LocalOrientation = compositionLocalOf<Orientation>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalOrientation")
}

@Composable
expect fun OrientationProvider(content: @Composable () -> Unit)