package net.novate.calculator.sharedui.base

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration

@Composable
actual fun OrientationProvider(content: @Composable () -> Unit) {
    val configuration = LocalConfiguration.current
    CompositionLocalProvider(
        LocalOrientation provides configuration.toOrientation(),
        content = content
    )
}

private fun Configuration.toOrientation(): Orientation = when (orientation) {
    Configuration.ORIENTATION_LANDSCAPE -> Orientation.LANDSCAPE
    else -> Orientation.PORTRAIT
}