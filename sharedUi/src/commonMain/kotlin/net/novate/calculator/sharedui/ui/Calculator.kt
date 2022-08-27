package net.novate.calculator.sharedui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.novate.calculator.sharedui.base.isLandscape
import net.novate.calculator.sharedui.base.isPortrait
import net.novate.calculator.sharedui.ui.theme.Theme

@Composable
fun Calculator() {
    Column(modifier = Modifier.fillMaxSize().background(Theme.colors.backgroundColor)) {

        Box(modifier = Modifier.fillMaxWidth().weight(0.3f)) {
            // TODO: Text
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f)
                .padding(horizontal = 8.dp)
                .background(
                    color = Theme.colors.surfaceColor,
                    shape = RoundedCornerShape(
                        topStart = if (isPortrait()) 16.dp else 8.dp,
                        topEnd = if (isPortrait()) 16.dp else 8.dp
                    )
                )
                .padding(if (isPortrait()) 16.dp else 8.dp)
        ) {
            InputArea()
        }
    }
}

@Composable
fun InputArea() {
    Row(
        modifier = Modifier.fillMaxSize().background(Theme.colors.surfaceColor)
    ) {
        if (isLandscape()) {
            ExpandButtonColumn1(modifier = Modifier.fillMaxHeight().weight(1f))
            ExpandButtonColumn2(modifier = Modifier.fillMaxHeight().weight(1f))
            ExpandButtonColumn3(modifier = Modifier.fillMaxHeight().weight(1f))
            ExpandButtonColumn4(modifier = Modifier.fillMaxHeight().weight(1f))
        }
        BasicButtonColumn1(modifier = Modifier.fillMaxHeight().weight(1f))
        BasicButtonColumn2(modifier = Modifier.fillMaxHeight().weight(1f))
        BasicButtonColumn3(modifier = Modifier.fillMaxHeight().weight(1f))
        BasicButtonColumn4(modifier = Modifier.fillMaxHeight().weight(1f))
    }
}