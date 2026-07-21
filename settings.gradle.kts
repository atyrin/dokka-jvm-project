pluginManagement {
    setOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            gradlePluginPortal()
            mavenCentral()
            maven("https://redirector.kotlinlang.org/maven/dokka-test")
            maven("https://redirector.kotlinlang.org/maven/dokka-dev")
//            maven("https://packages.jetbrains.team/maven/p/kt/dokka-dev")
            maven("https://redirector.kotlinlang.org/maven/dev")
//            maven("https://oss.sonatype.org/content/repositories/orgjetbrainsdokka-1104")
            mavenLocal()
        }
    }
}

rootProject.name = "dokka-jvm-project"

includeBuild("dokka-test-plugin")
