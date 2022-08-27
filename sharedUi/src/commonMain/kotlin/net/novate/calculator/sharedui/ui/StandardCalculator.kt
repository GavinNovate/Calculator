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
import net.novate.calculator.sharedui.ui.theme.Theme

@Composable
fun StandardCalculator() {
    Box(modifier = Modifier.fillMaxSize().background(Theme.colors.backgroundColor)) {
        Column(modifier = Modifier.fillMaxSize()) {

            Box(modifier = Modifier.fillMaxWidth().weight(0.3f))

            Box(modifier = Modifier.weight(0.7f)) {
                Surface(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .background(
                            color = Theme.colors.surfaceColor,
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
    Text("1+1", fontSize = 24.sp, color = Theme.colors.textPrimaryColor)
}

@Composable
fun ResultText() {
    Text("3", fontSize = 28.sp, color = Theme.colors.textSecondaryColor)
}


@Composable
fun StandardKeypad() {
    Row(
        modifier = Modifier.fillMaxSize().background(Theme.colors.surfaceColor)
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
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "C",
            textColor = Theme.colors.primaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "7",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor,
            textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "4",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "1",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "0",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
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
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "÷",
            textSize = 26.sp,
            textColor = Theme.colors.primaryColor,
            backgroundColor = Theme.colors.buttonColor,
            onClick = {}
        )
        Button(
            text = "8",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "5",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "2",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = ".",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
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
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "×",
            textSize = 26.sp,
            textColor = Theme.colors.primaryColor,
            backgroundColor = Theme.colors.buttonColor,
            onClick = {}
        )
        Button(
            text = "9",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "6",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "4",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "%",
            textColor = Theme.colors.textPrimaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
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
            textColor = Theme.colors.textSecondaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "⌫",
            textColor = Theme.colors.primaryColor,
            backgroundColor = Theme.colors.buttonColor, textSize = 20.sp,
            onClick = {}
        )
        Button(
            text = "-",
            textSize = 26.sp,
            textColor = Theme.colors.primaryColor,
            backgroundColor = Theme.colors.buttonColor,
            onClick = {}
        )
        Button(
            text = "+",
            textSize = 26.sp,
            textColor = Theme.colors.primaryColor,
            backgroundColor = Theme.colors.buttonColor,
            onClick = {}
        )
        Button(
            text = "=",
            textSize = 26.sp,
            textColor = Color.White,
            backgroundColor = Theme.colors.primaryColor,
            span = 2f,
            coerceInWidth = false,
            onClick = {}
        )
    }
}

@Composable
fun NumberKeypad() {

}
