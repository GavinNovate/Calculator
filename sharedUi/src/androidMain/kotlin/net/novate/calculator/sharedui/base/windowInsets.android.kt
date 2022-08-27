package net.novate.calculator.sharedui.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.platform.LocalView
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Composable
actual fun WindowInsetsProvider(content: @Composable () -> Unit) {
    val view = LocalView.current
    var statusBarInsets by remember { mutableStateOf(Rect.Zero) }
    var navigationBarInsets by remember { mutableStateOf(Rect.Zero) }
    var windowInsets by remember { mutableStateOf(Rect.Zero) }
    LaunchedEffect(view) {
        val rootWindowInsets = ViewCompat.getRootWindowInsets(view)
        statusBarInsets = rootWindowInsets?.statusBarsInsets?.toRect() ?: Rect.Zero
        navigationBarInsets = rootWindowInsets?.navigationBarsInsets?.toRect() ?: Rect.Zero
        windowInsets = rootWindowInsets?.windowInsets?.toRect() ?: Rect.Zero

        ViewCompat.setOnApplyWindowInsetsListener(view) { _, insets ->
            statusBarInsets = insets.statusBarsInsets.toRect()
            navigationBarInsets = insets.navigationBarsInsets.toRect()
            windowInsets = insets.windowInsets.toRect()
            WindowInsetsCompat.CONSUMED
        }
    }

    CompositionLocalProvider(
        LocalStatusBarInsets provides statusBarInsets,
        LocalNavigationBarInsets provides navigationBarInsets,
        LocalWindowInsets provides windowInsets,
        content = content
    )
}

private val WindowInsetsCompat.statusBarsInsets: Insets
    get() = getInsets(WindowInsetsCompat.Type.statusBars())

private val WindowInsetsCompat.navigationBarsInsets: Insets
    get() = getInsets(WindowInsetsCompat.Type.navigationBars())

private val WindowInsetsCompat.windowInsets: Insets
    get() = getInsets(WindowInsetsCompat.Type.statusBars() or WindowInsetsCompat.Type.navigationBars())

private fun Insets.toRect() = Rect(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat())