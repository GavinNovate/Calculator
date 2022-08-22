buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jetbrainsComposeDev()
    }
    dependencies {
        classpath(deps.kotlinGradlePlugin)
        classpath(deps.androidGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jetbrainsComposeDev()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}