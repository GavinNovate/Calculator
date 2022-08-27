package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.novate.calculator.sharedui.base.LocalOrientation
import net.novate.calculator.sharedui.base.Orientation
import net.novate.calculator.sharedui.base.isPortrait
import net.novate.calculator.sharedui.base.modifiers.coerceInWidth
import net.novate.calculator.sharedui.ui.theme.Theme

@Composable
fun ColumnScope.Button(
    text: String,
    textColor: Color,
    backgroundColor: Color,
    textSize: TextUnit = 20.sp,
    span: Float = 1f,
    coerceInWidth: Boolean = true,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(span)
            .run {
                if (coerceInWidth) {
                    coerceInWidth()
                } else {
                    this
                }
            }
            .padding(all = if (LocalOrientation.current == Orientation.PORTRAIT) 8.dp else 4.dp)
            .shadow(
                elevation = 4.dp,
                shape = CircleShape,
                ambientColor = shadowColor,
                spotColor = shadowColor
            )
            .background(backgroundColor)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = Theme.colors.onButtonColor),
                onClick = onClick
            )

    ) {
        Text(
            text = text,
            modifier = Modifier.align(Alignment.Center),
            color = textColor,
            fontSize = textSize,
            maxLines = 1
        )
    }
}

/**
 * 数字按钮；0 1 2 3 4 5 6 7 8 9 . %
 */
@Composable
fun NumberButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) = Button(
    text = text,
    textSize = numberTextSize,
    textColor = Theme.colors.textPrimaryColor,
    buttonColor = Theme.colors.buttonColor,
    buttonRippleColor = Theme.colors.onButtonColor,
    modifier = modifier,
    onClick = onClick
)

/**
 * 主要操作按钮；C ÷ × ⌫ - +
 */
@Composable
fun PrimaryOperationButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        text = text,
        textSize = if (text.isOperator) operatorTextSize else characterTextSize,
        textColor = Theme.colors.primaryColor,
        buttonColor = Theme.colors.buttonColor,
        buttonRippleColor = Theme.colors.onButtonColor,
        modifier = modifier,
        onClick = onClick
    )
}

/**
 * 次要操作按钮；其他按钮
 */
@Composable
fun SecondaryOperationButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) = Button(
    text = text,
    textSize = characterTextSize,
    textColor = Theme.colors.textSecondaryColor,
    buttonColor = Theme.colors.buttonColor,
    buttonRippleColor = Theme.colors.onButtonColor,
    modifier = modifier,
    onClick = onClick
)

/**
 * 计算按钮
 */
@Composable
fun CalculateButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(if (LocalOrientation.current == Orientation.PORTRAIT) 8.dp else 4.dp)
            .shadow(
                elevation = 4.dp,
                shape = if (isPortrait()) CircleShape else remember { RoundedCornerShape(16.dp) },
                ambientColor = shadowColor,
                spotColor = shadowColor
            )
            .background(Theme.colors.primaryColor)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = Theme.colors.onPrimaryColor),
                onClick = onClick
            )
    ) {
        Text(
            text = "=",
            modifier = Modifier.align(Alignment.Center),
            color = Theme.colors.onPrimaryColor,
            fontSize = operatorTextSize,
            maxLines = 1
        )
    }
}

@Composable
private fun Button(
    text: String,
    textSize: TextUnit,
    textColor: Color,
    buttonColor: Color,
    buttonRippleColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(if (LocalOrientation.current == Orientation.PORTRAIT) 8.dp else 4.dp)
            .shadow(
                elevation = 4.dp,
                shape = CircleShape,
                ambientColor = shadowColor,
                spotColor = shadowColor
            )
            .background(buttonColor)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = buttonRippleColor),
                onClick = onClick
            )
    ) {
        Text(
            text = text,
            modifier = Modifier.align(Alignment.Center),
            color = textColor,
            fontSize = textSize,
            maxLines = 1
        )
    }
}

/**
 * 数字大小
 */
private val numberTextSize: TextUnit
    @Composable
    @ReadOnlyComposable
    get() = if (isPortrait()) 24.sp else 18.sp

/**
 * 字符大小
 */
private val characterTextSize: TextUnit
    @Composable
    @ReadOnlyComposable
    get() = if (isPortrait()) 22.sp else 16.sp

/**
 * 运算符大小
 */
private val operatorTextSize: TextUnit
    @Composable
    @ReadOnlyComposable
    get() = if (isPortrait()) 26.sp else 20.sp

private val Operators = listOf("+", "-", "×", "÷", "=")

/**
 * 字符串是否为运算符
 */
private val String.isOperator: Boolean
    get() = this in Operators

/**
 * 阴影颜色
 */
private val shadowColor = Color.Black.copy(alpha = 0.5f)