pluginManagement{
    repositories{
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        mavenLocal()
        google()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("org.jetbrains.kotlin")) {
                gradle.rootProject.extra["kotlin_version"]?.let { useVersion(it as String) }
            }

            if (requested.id.id.startsWith("org.jetbrains.dokka")) {
                gradle.rootProject.extra["dokka_version"]?.let { useVersion(it as String) }
            }
        }
    }
}

rootProject.name = "dokka-jvm-project"

includeBuild("dokka-test-plugin")