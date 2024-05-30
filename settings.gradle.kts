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
}

rootProject.name = "dokka-jvm-project"

includeBuild("dokka-test-plugin")