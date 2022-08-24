package net.novate.calculator.shareduiios

import androidx.compose.ui.window.Application
import net.novate.calculator.sharedui.CalculatorUI

fun createCalculatorUI() = Application { CalculatorUI() }