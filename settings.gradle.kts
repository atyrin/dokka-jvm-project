pluginManagement {
    setOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            gradlePluginPortal()
            mavenCentral()
            maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
            maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
            maven("https://redirector.kotlinlang.org/maven/dokka-test")
            maven("https://packages.jetbrains.team/maven/p/kt/dokka-test")
            maven("https://packages.jetbrains.team/maven/p/kt/dokka-dev")
            maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
            maven("https://oss.sonatype.org/content/repositories/orgjetbrainsdokka-1104")
            mavenLocal()
        }
    }
}

rootProject.name = "dokka-jvm-project"

includeBuild("dokka-test-plugin")
