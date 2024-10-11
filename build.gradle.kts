import org.jetbrains.dokka.gradle.engine.parameters.VisibilityModifier
import java.net.URI

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.dokka)
}

group = "org.jetbrains.qa"
version = "2.0.0"

kotlin {
    jvmToolchain(17)
}

buildscript {
    dependencies {
        classpath(libs.dokka.base)
        classpath(libs.dokka.versioning)

        classpath("org.jetbrains.qa:dokka-test-plugin") // see included build
    }
}


dependencies {
    // used for external dependencies tests
    implementation(libs.bundles.external)

    dokkaHtmlPlugin(libs.dokka.versioning)
    dokkaHtmlPlugin(libs.dokka.mermaid)
//    dokkaHtmlPlugin(libs.dokka.javadoc)
//    dokkaHtmlPlugin(libs.dokka.kotlin.`as`.java)

    dokkaHtmlPlugin("org.jetbrains.qa:dokka-test-plugin")
}


dokka {
    dokkaPublications.html {
        // override output location
        val dokka_output_name: String? by project
        outputDirectory.set(layout.buildDirectory.dir(dokka_output_name ?: "dokka"))
    }
    dokkaSourceSets {
        configureEach {
            moduleName.set("Dokka JVM Project")

            // change location for links to JDK references
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
                    VisibilityModifier.Public,
                    VisibilityModifier.Protected
                )
            )

            // Suppress a package
            perPackageOption {
                matchingRegex.set(""".*\.secret.*""") // will match all .internal packages and sub-packages
                suppress.set(true)
            }

            // add (sources) to the signature line and navigate to sources
            sourceLink {
                localDirectory.set(projectDir.resolve("src"))
                remoteUrl.set(URI("https://jetbrains.team/p/kqa/repositories/dokka-jvm-project/files/src"))
                remoteLineSuffix.set("?tab=source&line=")
            }

            externalDocumentationLinks {
                create("Ktor") {
                    url.set(URI("https://api.ktor.io/"))
                    packageListUrl.set(
                        rootProject.projectDir.resolve("ktor-package-list.txt").toURI()
                    )
                }
            }
        }
    }

    pluginsConfiguration.html {
        customAssets = files("css/homeIcon.svg")
        customStyleSheets =
            files(
                "css/homeIcon.css",
//                "css/logo-styles.css",
//                "prism.css"
            )
        footerMessage = "Custom Footer Message (tm)"
        templatesDir = file("templates")
//            separateInheritedMembers = true
        homepageLink = "https://github.com/Kotlin/dokka" // starting 1.9.20
    }


    pluginsConfiguration.versioning {
        version = "2.0.0"
        versionsOrdering = listOf("2.0.0", "1.9.20", "1.9.10", "1.8.20", "1.8.10")
        olderVersionsDir = file("documentation/version")
        renderVersionsNavigationOnAllPages = true
    }
}