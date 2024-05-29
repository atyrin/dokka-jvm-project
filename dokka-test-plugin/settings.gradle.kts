pluginManagement {
    repositories{
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
    }
}
dependencyResolutionManagement {
    versionCatalogs {
        create("libs")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version ("0.7.0")
}

rootProject.name = "dokka-test-plugin"
