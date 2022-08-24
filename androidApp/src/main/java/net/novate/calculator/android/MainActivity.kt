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

var Window.isDecorFitsSystemWindows: Boolean
    set(value) = WindowCompat.setDecorFitsSystemWindows(this, value)
    get() = TODO()