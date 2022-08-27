package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.geometry.Rect

@Composable
actual fun WindowInsetsProvider(content: @Composable () -> Unit) {
    // TODO: iOS 待实现
    CompositionLocalProvider(
        LocalStatusBarInsets provides Rect.Zero,
        LocalNavigationBarInsets provides Rect.Zero,
        LocalWindowInsets provides Rect.Zero,
        content = content
    )
}