import org.jetbrains.dokka.versioning.VersioningConfiguration
import org.jetbrains.dokka.versioning.VersioningPlugin
import java.net.URI
import java.net.URL

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.dokka")
    id("maven-publish")
}

group = "org.jetbrains.qa"
version = "1.9.0"

kotlin {
    jvmToolchain(17)
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        maven("https://oss.sonatype.org/service/local/repositories/orgjetbrainsdokka-1101/content/")
        mavenLocal()
    }
}

buildscript {
    dependencies {
        val dokka_version: String by project
        classpath("org.jetbrains.dokka:dokka-base:$dokka_version")
        classpath("org.jetbrains.dokka:versioning-plugin:$dokka_version")
        classpath("org.jetbrains.qa:dokka-test-plugin")
    }
}

// used for external dependencies tests
dependencies {
    api("com.squareup.wire:wire-runtime:4.9.3")
    implementation("junit:junit:4.13.1")

    implementation("org.http4k:http4k-core:5.13.2.0")
    implementation("org.http4k:http4k-server-jetty:5.13.2.0")
    implementation("org.http4k:http4k-client-okhttp:5.13.2.0")

    val ktor_version: String by project
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")

    val dokka_version: String by project
//    dokkaHtmlPlugin("com.glureau:html-mermaid-dokka-plugin:0.4.4")
    dokkaHtmlPlugin("org.jetbrains.dokka:versioning-plugin:$dokka_version")
    dokkaHtmlPlugin("org.jetbrains.qa:dokka-test-plugin")
//    dokkaHtmlPlugin("org.jetbrains.dokka:javadoc-plugin:$dokka_version")
//    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:$dokka_version")
}


//tasks.withType<org.jetbrains.dokka.gradle.DokkaTask>().configureEach {
//    //"customStyleSheets": ["${file("css/app.css")}"],
//    //"templatesDir": "${file("templates")}",
//    val dokkaBaseConfiguration = """
//    {
//
//      "footerMessage": "(c) 2022 MyOrg",
//      "separateInheritedMembers": false,
//
//      "mergeImplicitExpectActualDeclarations": false
//    }
//    """
//    pluginsMapConfiguration.set(
//        mapOf(
//            // fully qualified plugin name to json configuration
//            "org.jetbrains.dokka.base.DokkaBase" to dokkaBaseConfiguration
//        )
//    )
//}

tasks.dokkaHtml.configure {
    moduleName = ""
    dokkaSourceSets {
        configureEach {
            moduleName.set("Dokka JVM Project")
            val dokka_output_name: String? by project
            outputDirectory.set(layout.buildDirectory.dir(dokka_output_name ?: "dokka"))
            jdkVersion.set(17)
//            suppress.set(false)
//            suppressInheritedMembers.set(true)
//            suppressObviousFunctions.set(true)

            includes.from("extra.md")
            samples.from(
                "src/main/kotlin/org/jetbrains/qa/kdoc/rendering/samples/samples.kt",
                "src/main/kotlin/org/jetbrains/qa/kdoc/rendering/samples/samplesWithDependencies.kt",
            )
            documentedVisibilities.set(
                setOf(
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PUBLIC,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PROTECTED,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.INTERNAL,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PRIVATE,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PACKAGE
                )
            )

            perPackageOption {
                // will match kotlin and all sub-packages of it
                matchingRegex.set("kotlin($|\\.).*")

                // All options are optional
                skipDeprecated.set(false)
                reportUndocumented.set(true) // Emit warnings about not documented members
                includeNonPublic.set(false) // Deprecated, prefer using documentedVisibilities

                // Visibilities that should be included in the documentation
                // If set by user, overrides includeNonPublic. Default is PUBLIC
            }
            // Suppress a package
            perPackageOption {
                matchingRegex.set(""".*\.internal.*""") // will match all .internal packages and sub-packages
                suppress.set(true)
            }

            sourceLink {
                // Unix based directory relative path to the root of the project (where you execute gradle respectively).
//                val relPath = rootProject.projectDir.toPath().relativize(projectDir.toPath())
//                localDirectory.set(project.rootDir)
                localDirectory.set(projectDir.resolve("src"))
                remoteUrl.set(URI("https://jetbrains.team/p/kqa/repositories/dokka-jvm-project/files/src").toURL())
                remoteLineSuffix.set("?tab=source&line=")
            }
        }
    }

    pluginConfiguration<org.jetbrains.dokka.base.DokkaBase, org.jetbrains.dokka.base.DokkaBaseConfiguration> {
//            customAssets = listOf(file("<path to asset>"))
        customAssets = listOf(file("css/homeIcon.svg"))
        customStyleSheets = listOf(
            file("css/homeIcon.css"),
//                file("css/logo-styles.css"),
//                file("prism.css")
        )
        footerMessage = "Stored XSS JVM Only Module"
        templatesDir = file("templates")
//            separateInheritedMembers = true
//        homepageLink = "https://github.com/Kotlin/kotlinx-atomicfu" // starting 1.9.20
    }

    pluginConfiguration<VersioningPlugin, VersioningConfiguration> {
        version = "2.0.0"
        versionsOrdering = listOf("2.0.0", "1.9.20", "1.9.10", "1.8.20", "1.8.10")
        olderVersionsDir = file("documentation/version")
        renderVersionsNavigationOnAllPages = true
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "local.atyrin"
            artifactId = "dokka-jvm-project"
            version = "1.0.1"

            from(components["java"])
        }
    }
}