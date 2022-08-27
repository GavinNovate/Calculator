package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
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

@Stable
@Composable
@ReadOnlyComposable
fun isPortrait() = LocalOrientation.current == Orientation.PORTRAIT

@Stable
@Composable
@ReadOnlyComposable
fun isLandscape() = LocalOrientation.current == Orientation.LANDSCAPE

@Composable
expect fun OrientationProvider(content: @Composable () -> Unit)