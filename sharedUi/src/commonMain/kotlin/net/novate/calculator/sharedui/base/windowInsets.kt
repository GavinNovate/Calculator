package net.novate.calculator.sharedui.base

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.neverEqualPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.platform.LocalDensity

@Composable
expect fun WindowInsetsProvider(content: @Composable () -> Unit)

@Composable
fun Modifier.statusBarInsetsPadding(): Modifier = absolutePadding(LocalStatusBarInsets.current)

@Composable
fun Modifier.navigationBarInsetsPadding(): Modifier = absolutePadding(LocalNavigationBarInsets.current)

@Composable
fun Modifier.windowInsetsPadding(): Modifier = absolutePadding(LocalWindowInsets.current)

val LocalStatusBarInsets = compositionLocalOf<Rect>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalStatusBarInsets")
}

val LocalNavigationBarInsets = compositionLocalOf<Rect>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalNavigationBarInsets")
}

val LocalWindowInsets = compositionLocalOf<Rect>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalWindowInsets")
}

@Stable
@Composable
private fun Modifier.absolutePadding(rect: Rect): Modifier = with(LocalDensity.current) {
    absolutePadding(rect.left.toDp(), rect.top.toDp(), rect.right.toDp(), rect.bottom.toDp())
}

private inline fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}