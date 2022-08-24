package net.novate.calculator.android

import android.os.Bundle
import android.view.Window
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import net.novate.calculator.sharedui.CalculatorUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.isDecorFitsSystemWindows = false
        setContent {
            CalculatorUI()
        }
    }
}

/**
 * 设置 Window DecorView 是否适配 SystemWindows
 *
 * @throws NotImplementedError get() 方法暂未实现
 */
var Window.isDecorFitsSystemWindows: Boolean
    set(value) = WindowCompat.setDecorFitsSystemWindows(this, value)
    get() = TODO()