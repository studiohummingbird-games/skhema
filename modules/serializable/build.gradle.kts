plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinSerialization)
    id("maven-publish")
}

group = "games.studiohummingbird.skhema"
version = "0.1.0-v29.3"

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

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization.core)
            implementation(project(":modules:core"))
        }
    }
}
