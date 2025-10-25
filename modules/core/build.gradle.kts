plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

kotlin {
    js {
        browser { }
        binaries.executable()
    }
    jvm { }
}
