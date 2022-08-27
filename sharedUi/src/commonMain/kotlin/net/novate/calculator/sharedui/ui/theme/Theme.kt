package net.novate.calculator.sharedui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.neverEqualPolicy
import net.novate.calculator.sharedui.base.noLocalProvidedFor


interface Theme {
    val colors: CalculatorColors

    companion object {

        val colors: CalculatorColors
            @Composable
            @ReadOnlyComposable
            get() = LocalTheme.current.colors
    }
}

object DarkTheme : Theme {
    override val colors: CalculatorColors = DarkCalculatorColors
}

object LightTheme : Theme {
    override val colors: CalculatorColors = LightCalculatorColors
}

val LocalTheme = compositionLocalOf<Theme>(neverEqualPolicy()) {
    noLocalProvidedFor("LocalTheme")
}

@Composable
fun CalculatorTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalTheme provides if (darkTheme) DarkTheme else LightTheme,
        content = content
    )
}