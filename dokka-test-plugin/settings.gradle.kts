pluginManagement {
    setOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            gradlePluginPortal()
            mavenCentral()
            maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
            maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
            maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
            maven("https://oss.sonatype.org/content/repositories/orgjetbrainsdokka-1104")
            mavenLocal()
        }
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "dokka-test-plugin"
