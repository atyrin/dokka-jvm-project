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

dependencyResolutionManagement{
    repositories{
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        maven("https://oss.sonatype.org/service/local/repositories/orgjetbrainsdokka-1101/content/")
        mavenLocal()
    }
}

rootProject.name = "dokka-jvm-project"

includeBuild("dokka-test-plugin")