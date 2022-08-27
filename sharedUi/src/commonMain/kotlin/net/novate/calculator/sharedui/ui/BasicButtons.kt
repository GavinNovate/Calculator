package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.novate.calculator.sharedui.base.LocalOrientation
import net.novate.calculator.sharedui.base.Orientation
import net.novate.calculator.sharedui.base.modifiers.coerceInWidth

@Composable
fun BasicButtonColumn1(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = "MC",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    PrimaryOperationButton(
        text = "C",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "7",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "4",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "1",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "0",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}

@Composable
fun BasicButtonColumn2(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = "M+",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    PrimaryOperationButton(
        text = "÷",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "8",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "5",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "2",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = ".",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}

@Composable
fun BasicButtonColumn3(
    modifier: Modifier
) = Column(modifier = modifier) {
    SecondaryOperationButton(
        text = "M-",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    PrimaryOperationButton(
        text = "×",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "9",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "6",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "3",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    NumberButton(
        text = "%",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}

@Composable
fun BasicButtonColumn4(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = "MR",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    PrimaryOperationButton(
        text = "⌫",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    PrimaryOperationButton(
        text = "-",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    PrimaryOperationButton(
        text = "+",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    CalculateButton(
        modifier = Modifier.fillMaxWidth().weight(2f)
    ) {

    }
}

