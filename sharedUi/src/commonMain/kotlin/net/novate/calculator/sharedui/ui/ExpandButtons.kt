package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.novate.calculator.sharedui.base.LocalOrientation
import net.novate.calculator.sharedui.base.Orientation
import net.novate.calculator.sharedui.base.modifiers.coerceInWidth

@Composable
fun ExpandButtonColumn1(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = "(",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "1/x",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "x!",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "log₂",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "sin",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "sin⁻¹",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}

@Composable
fun ExpandButtonColumn2(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = ")",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "x²",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "√x",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "logₑ",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "cos",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "cos⁻¹",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}

@Composable
fun ExpandButtonColumn3(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = "e",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "x³",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "³√x",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "log₁₀",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "tan",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "tan⁻¹",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}

@Composable
fun ExpandButtonColumn4(
    modifier: Modifier
) = Column(modifier = modifier) {
    val isPortrait = LocalOrientation.current == Orientation.PORTRAIT
    SecondaryOperationButton(
        text = "π",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "xʸ",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "ʸ√x",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "logₙ",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "cot",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
    SecondaryOperationButton(
        text = "cot⁻¹",
        modifier = Modifier.fillMaxWidth().weight(1f).coerceInWidth()
    ) {

    }
}