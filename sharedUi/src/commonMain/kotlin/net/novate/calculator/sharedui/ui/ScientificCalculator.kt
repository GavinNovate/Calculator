package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import net.novate.calculator.sharedui.ui.theme.lightButtonColor
import net.novate.calculator.sharedui.ui.theme.lightSecondaryTextColor

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
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "1/x",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "x!",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "log₂",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "sin",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "sin⁻¹",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
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
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "x²",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "√x",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "logₑ",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cos",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cos⁻¹",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
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
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "x³",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "³√x",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "log₁₀",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "tan",
            textColor = lightSecondaryTextColor,
            textSize = 20.sp,
            backgroundColor = lightButtonColor,
            onClick = {}
        )
        Button(
            text = "tan⁻¹",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
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
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "xʸ",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "ʸ√x",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "logₙ",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cot",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "cot⁻¹",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
    }
}
