import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

/**
 * JetBrains Compose 插件
 */
fun PluginDependenciesSpec.jetbrainsCompose() = id("org.jetbrains.compose") version jetbrainsComposeVersion