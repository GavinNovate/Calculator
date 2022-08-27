package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.geometry.Rect

@Composable
actual fun WindowInsetsProvider(content: @Composable () -> Unit) {
    // TODO: iOS 待实现，先按照 iPhone 13 写死
    CompositionLocalProvider(
        LocalStatusBarInsets provides Rect(0f, 44f, 0f, 0f),
        LocalNavigationBarInsets provides Rect(0f, 0f, 0f, 22f),
        LocalWindowInsets provides Rect(0f, 44f, 0f, 22f),
        content = content
    )
}