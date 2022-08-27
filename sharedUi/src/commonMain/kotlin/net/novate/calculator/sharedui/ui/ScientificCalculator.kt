package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import net.novate.calculator.sharedui.ui.theme.Theme

class ScientificCalculator {
}


@Composable
fun ScientificKeypad() {
    Row(

    ) {
        StandardKeypadRow1()
        StandardKeypadRow2()
        StandardKeypadRow3()
        StandardKeypadRow4()
    }
}

@Composable
fun RowScope.ScientificRow1() {
    Column(
        modifier = Modifier.weight(1f).fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "(",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "1/x",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "x!",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "log₂",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "sin",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "sin⁻¹",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.ScientificRow2() {
    Column(
        modifier = Modifier.weight(1f).fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = ")",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "x²",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "√x",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "logₑ",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cos",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cos⁻¹",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.ScientificRow3() {
    Column(
        modifier = Modifier.weight(1f).fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "e",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "x³",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "³√x",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "log₁₀",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "tan",
            textColor = Theme.colors.textSecondaryColor,
            textSize = 20.sp,
            backgroundColor = Theme.colors.buttonColor,
            onClick = {}
        )
        Button(
            text = "tan⁻¹",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.ScientificRow4() {
    Column(
        modifier = Modifier.weight(1f).fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "π",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "xʸ",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "ʸ√x",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "logₙ",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cot",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cot⁻¹",
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
    }
}
