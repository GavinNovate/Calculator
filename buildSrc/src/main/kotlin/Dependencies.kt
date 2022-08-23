import org.gradle.api.Project
import org.gradle.kotlin.dsl.ScriptHandlerScope

// Kotlin
internal const val kotlinVersion = "1.7.10"

// Compose
internal const val jetbrainsComposeVersion = "1.2.0-alpha01-dev764"

internal const val jetpackComposeVersion = "1.1.0"
internal const val jetpackComposeActivityExtensionVersion = "1.5.1"

// Android
internal const val androidGradlePluginVersion = "7.2.2"

/**
 * 工程依赖
 */
val Project.deps
    get() = ProjectDependencies

object ProjectDependencies {
    val compose get() = ComposeDependencies
}

object ComposeDependencies {
    val android get() = AndroidComposeDependencies
}

object AndroidComposeDependencies {
    const val ui = "androidx.compose.ui:ui:$jetpackComposeVersion"
    const val foundation = "androidx.compose.foundation:foundation:$jetpackComposeVersion"
    const val uiTooling = "androidx.compose.ui:ui-tooling:$jetpackComposeVersion"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$jetpackComposeVersion"

    val extensions get() = AndroidComposeExtensionDependencies
}

object AndroidComposeExtensionDependencies {
    const val activity = "androidx.activity:activity-compose:$jetpackComposeActivityExtensionVersion"
}

/**
 * 工程编译脚本依赖
 */
val ScriptHandlerScope.deps
    get() = ProjectBuildScriptDependencies

object ProjectBuildScriptDependencies {
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidGradlePlugin = "com.android.tools.build:gradle:$androidGradlePluginVersion"
}