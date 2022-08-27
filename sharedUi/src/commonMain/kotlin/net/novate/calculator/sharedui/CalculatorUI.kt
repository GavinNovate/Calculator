package net.novate.calculator.sharedui

import androidx.compose.runtime.Composable
import net.novate.calculator.sharedui.base.OrientationProvider
import net.novate.calculator.sharedui.base.WindowInsetsProvider
import net.novate.calculator.sharedui.ui.Calculator
import net.novate.calculator.sharedui.ui.theme.CalculatorTheme

@Composable
fun CalculatorUI() {
    WindowInsetsProvider {
        OrientationProvider {
            CalculatorTheme {
                Calculator()
            }
        }
    }
}