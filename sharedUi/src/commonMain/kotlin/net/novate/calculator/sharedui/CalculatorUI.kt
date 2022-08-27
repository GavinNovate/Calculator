package net.novate.calculator.sharedui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.novate.calculator.sharedui.base.OrientationProvider
import net.novate.calculator.sharedui.base.WindowInsetsProvider
import net.novate.calculator.sharedui.ui.StandardCalculator
import net.novate.calculator.sharedui.ui.theme.CalculatorTheme

@Composable
fun CalculatorUI() {
    WindowInsetsProvider {
        OrientationProvider {
            CalculatorTheme {
                StandardCalculator()
            }
        }
        /*Box(
            Modifier.fillMaxSize().background(Color.White)
                .windowInsetsPadding()
        ) {
            Box(
                Modifier.fillMaxWidth().wrapContentHeight().padding(16.dp).align(Alignment.BottomCenter)
            ) {
                Column {
                    Row {
                        Operator("(")
                        Operator(")")
                        Operator("%")
                        Operator("⌫")
                    }
                    Spacer(Modifier.height(4.dp))
                    Row {
                        Number("7")
                        Number("8")
                        Number("9")
                        Operator("÷")
                    }
                    Spacer(Modifier.height(4.dp))
                    Row {
                        Number("4")
                        Number("5")
                        Number("6")
                        Operator("×")
                    }
                    Spacer(Modifier.height(4.dp))
                    Row {
                        Number("1")
                        Number("2")
                        Number("3")
                        Operator("-")
                    }
                    Spacer(Modifier.height(4.dp))
                    Row {
                        Number("0")
                        Number(".")
                        Calculator()
                        Operator("+")
                    }
                }
            }
        }*/
    }
}

val calculatorBackgroundColor = Color(0xFF4285f4)
val calculatorTextColor = Color.White

val numberBackgroundColor = Color(0xFFF1F3F4)
val numberTextColor = Color(0xFF202124)

val operatorBackgroundColor = Color(0xFFDADCE0)
val operatorTextColor = Color(0xFF202124)

@Composable
inline fun RowScope.Number(text: String) =
    Button(text, span = 1f, textColor = numberTextColor, backgroundColor = numberBackgroundColor)

@Composable
inline fun RowScope.Operator(text: String) =
    Button(text, span = 1f, textColor = operatorTextColor, backgroundColor = operatorBackgroundColor)

@Composable
inline fun RowScope.Calculator(span: Float = 1f) =
    Button("=", span = 1f, textColor = calculatorTextColor, backgroundColor = calculatorBackgroundColor)

@Composable
fun RowScope.Button(text: String, span: Float = 1f, textColor: Color, backgroundColor: Color) {
    Box(
        modifier = Modifier
            .weight(span)
            .padding(all = 8.dp)
            .aspectRatio(1.5f)
            .shadow(elevation = 2.dp, shape = CircleShape)
//            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor).clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = Color.Black)
            ) {

            }

    ) {
        Text(
            text,
            color = textColor,
            modifier = Modifier.align(Alignment.Center),
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
    }
}