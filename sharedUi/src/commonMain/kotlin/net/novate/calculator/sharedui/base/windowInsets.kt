package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.neverEqualPolicy
import androidx.compose.ui.geometry.Rect

// TODO: WindowInsets androidMain 中用不了，暂时先用 Rect
val LocalStatusBarInsets = compositionLocalOf<Rect>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalStatusBarInsets")
}

val LocalNavigationBarInsets = compositionLocalOf<Rect>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalNavigationBarInsets")
}

@Composable
expect fun WindowInsetsProvider(content: @Composable () -> Unit)

private inline fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}