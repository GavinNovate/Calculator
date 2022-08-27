package net.novate.calculator.sharedui.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color


interface CalculatorColors {

    /**
     * 主色；主要用于计算按钮的背景色和加减乘除等重要按钮的文字色
     */
    val primaryColor: Color

    /**
     * 按钮的颜色；除计算按钮外
     */
    val buttonColor: Color

    /**
     * 键盘卡片颜色
     */
    val surfaceColor: Color

    /**
     * 应用背景色
     */
    val backgroundColor: Color

    /**
     * 以主色做背景时其上的内容的颜色；通常是文字
     */
    val onPrimaryColor: Color

    /**
     * 按钮色上的内容的颜色
     */
    val onButtonColor: Color

    /**
     * 文字主色
     */
    val textPrimaryColor: Color

    /**
     * 文字次色
     */
    val textSecondaryColor: Color
}

@Immutable
object DarkCalculatorColors : CalculatorColors {
    override val primaryColor: Color = Color(0xFF007CFF)

    override val buttonColor: Color = Color(0xFF252931)

    override val surfaceColor: Color = Color(0xFF212225)

    override val backgroundColor: Color = Color.Black

    override val onPrimaryColor: Color = Color(0xFFDCE2E2)

    override val onButtonColor: Color = Color.White

    override val textPrimaryColor: Color = Color(0xFFDCE2E2)

    override val textSecondaryColor: Color = Color(0xFFA6A7AB)
}

@Immutable
object LightCalculatorColors : CalculatorColors {

    override val primaryColor: Color = Color(0xFF005AFF)

    override val buttonColor: Color = Color(0xFFFAFAFA)

    override val surfaceColor: Color = Color(0xFFF3F4F6)

    override val backgroundColor: Color = Color(0xFFE8ECF2)

    override val onPrimaryColor: Color = Color(0xFFFDFFFF)

    override val onButtonColor: Color = Color.Black

    override val textPrimaryColor: Color = Color(0xFF181818)

    override val textSecondaryColor: Color = Color(0xFF808080)
}