import java.net.URL

plugins {
    alias(libs.plugins.kotlin)
    `maven-publish`
    signing
}

group = "org.jetbrains.qa"
version = "2.0"

dependencies {
    compileOnly(libs.dokka.core)
    implementation(libs.dokka.base)
    compileOnly(libs.dokka.analysis.kotlin)

    testImplementation(kotlin("test"))
    testImplementation(libs.dokka.test.api)
    testImplementation(libs.dokka.base.test.utils)
}

kotlin {
    jvmToolchain(8)
}
