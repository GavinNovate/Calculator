package net.novate.calculator.shareduiios

import androidx.compose.ui.window.Application
import net.novate.calculator.sharedui.CalculatorUi

fun createCalculatorUIViewController() = Application { CalculatorUi() }