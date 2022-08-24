plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    jetbrainsCompose()
}

version = "1.0"

kotlin {
    iosX64("uikitX64")
    iosArm64("uikitArm64")

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "sharedUiiOS"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":sharedUi"))
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val uikitMain by creating {
            dependsOn(commonMain)
        }
        val uikitX64Main by getting {
            dependsOn(uikitMain)
        }
        val uikitArm64Main by getting {
            dependsOn(uikitMain)
        }
    }
}