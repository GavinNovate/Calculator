package net.novate.calculator.sharedui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CalculatorUi() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("Hello Calculator!", modifier = Modifier.align(Alignment.Center))
    }
}