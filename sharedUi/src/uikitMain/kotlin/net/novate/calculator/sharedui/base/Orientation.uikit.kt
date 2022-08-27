package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
actual fun OrientationProvider(content: @Composable () -> Unit) {
    // TODO: iOS 待实现
    CompositionLocalProvider(
        LocalOrientation provides Orientation.PORTRAIT,
        content = content
    )
}