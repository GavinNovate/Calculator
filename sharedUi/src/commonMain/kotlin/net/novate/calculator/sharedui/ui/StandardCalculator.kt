package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.novate.calculator.sharedui.base.LocalOrientation
import net.novate.calculator.sharedui.base.Orientation
import net.novate.calculator.sharedui.ui.theme.lightBackgroundColor
import net.novate.calculator.sharedui.ui.theme.lightButtonColor
import net.novate.calculator.sharedui.ui.theme.lightPrimaryColor
import net.novate.calculator.sharedui.ui.theme.lightPrimaryTextColor
import net.novate.calculator.sharedui.ui.theme.lightSecondaryTextColor
import net.novate.calculator.sharedui.ui.theme.lightSurfaceColor


@Composable
fun StandardCalculator() {
    Box(modifier = Modifier.fillMaxSize().background(lightBackgroundColor)) {
        Column(modifier = Modifier.fillMaxSize()) {

            Box(modifier = Modifier.fillMaxWidth().weight(0.3f).background(Color.Blue))

            Box(modifier = Modifier.weight(0.7f).background(Color.Yellow)) {
                Surface(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .background(
                            color = lightSurfaceColor,
                            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                        )
                        .padding(16.dp)
                        .align(Alignment.BottomCenter)
                ) {
                    StandardKeypad()
                }
            }
        }
    }
}

@Composable
fun FormulaText() {
    Text("1+1", fontSize = 24.sp, color = lightPrimaryTextColor)
}

@Composable
fun ResultText() {
    Text("3", fontSize = 28.sp, color = lightSecondaryTextColor)
}


@Composable
fun StandardKeypad() {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        if (LocalOrientation.current == Orientation.LANDSCAPE) {
            ScientificRow1()
            ScientificRow2()
            ScientificRow3()
            ScientificRow4()
        }

        StandardKeypadRow1()
        StandardKeypadRow2()
        StandardKeypadRow3()
        StandardKeypadRow4()
    }
}

@Composable
fun RowScope.StandardKeypadRow1() {
    Column(
        modifier = Modifier.weight(1f).fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "MC",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "C",
            textColor = lightPrimaryColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "7",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "4",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "1",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "0",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.StandardKeypadRow2() {
    Column(
        modifier = Modifier.weight(1f).fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "M+",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "÷",
            textSize = 26.sp,
            textColor = lightPrimaryColor,
            backgroundColor = lightButtonColor,
            onClick = {}
        )
        Button(
            text = "8",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "5",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "2",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = ".",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.StandardKeypadRow3() {
    Column(
        modifier = Modifier.weight(1f).fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "M-",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "×",
            textSize = 26.sp,
            textColor = lightPrimaryColor,
            backgroundColor = lightButtonColor,
            onClick = {}
        )
        Button(
            text = "9",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "6",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "4",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "%",
            textColor = lightPrimaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.StandardKeypadRow4() {
    Column(
        modifier = Modifier.weight(1f).fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            text = "MR",
            textColor = lightSecondaryTextColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "⌫",
            textColor = lightPrimaryColor,
            backgroundColor = lightButtonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "-",
            textSize = 26.sp,
            textColor = lightPrimaryColor,
            backgroundColor = lightButtonColor,
            onClick = {}
        )
        Button(
            text = "+",
            textSize = 26.sp,
            textColor = lightPrimaryColor,
            backgroundColor = lightButtonColor,
            onClick = {}
        )
        Button(
            text = "=",
            textSize = 26.sp,
            textColor = Color.White,
            backgroundColor = lightPrimaryColor,
            span = 2f,
            coerceInWidth = false,
            onClick = {}
        )
    }
}

@Composable
fun NumberKeypad() {

}
