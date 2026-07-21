pluginManagement {
    setOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            gradlePluginPortal()
            mavenCentral()
            maven("https://redirector.kotlinlang.org/maven/dokka-dev")
            maven("https://redirector.kotlinlang.org/maven/dokka-test")
            maven("https://redirector.kotlinlang.org/maven/dev")
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
