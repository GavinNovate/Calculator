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
    LaunchedEffect(view) {
        val insets0 = ViewCompat.getRootWindowInsets(view)
        statusBarInsets = insets0?.getInsets(WindowInsetsCompat.Type.statusBars())?.toRect() ?: Rect.Zero
        navigationBarInsets = insets0?.getInsets(WindowInsetsCompat.Type.navigationBars())?.toRect() ?: Rect.Zero
        ViewCompat.setOnApplyWindowInsetsListener(view) { _, insets ->
            statusBarInsets = insets.getInsets(WindowInsetsCompat.Type.statusBars()).toRect()
            navigationBarInsets = insets.getInsets(WindowInsetsCompat.Type.navigationBars()).toRect()
            WindowInsetsCompat.CONSUMED
        }
    }

    CompositionLocalProvider(
        LocalStatusBarInsets provides statusBarInsets,
        LocalNavigationBarInsets provides navigationBarInsets,
        content = content
    )
}

private fun Insets.toRect() = Rect(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat())