plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.BIN
    version = "9.1"
}
