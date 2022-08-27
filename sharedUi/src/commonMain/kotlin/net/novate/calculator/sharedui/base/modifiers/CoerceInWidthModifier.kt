package net.novate.calculator.sharedui.base.modifiers

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.platform.InspectorValueInfo
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Constraints

/**
 * 强制把高度限制在宽度的范围内，即：高度不会超出宽度
 */
@Stable
fun Modifier.coerceInWidth() = then(CoerceInWidthModifier)

private object CoerceInWidthModifier : LayoutModifier, InspectorValueInfo(debugInspectorInfo {
    name = "followWidth"
}) {
    override fun MeasureScope.measure(measurable: Measurable, constraints: Constraints): MeasureResult {
        var wrappedConstraints = constraints
        if (constraints.maxHeight > constraints.maxWidth) {
            wrappedConstraints = constraints.copy(
                minWidth = constraints.minWidth,
                maxWidth = constraints.maxWidth,
                minHeight = constraints.minHeight.coerceIn(constraints.minWidth, constraints.maxWidth),
                maxHeight = constraints.maxWidth
            )
        }
        val placeable = measurable.measure(wrappedConstraints)
        return layout(placeable.width, placeable.height) {
            placeable.placeRelative(0, 0)
        }
    }
}