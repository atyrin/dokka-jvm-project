import org.jetbrains.dokka.versioning.VersioningConfiguration
import org.jetbrains.dokka.versioning.VersioningPlugin
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


tasks.dokkaHtml {
    dokkaSourceSets {
        configureEach {
            moduleName.set("Dokka JVM Project")

            // override output location
            val dokka_output_name: String? by project
            outputDirectory.set(layout.buildDirectory.dir(dokka_output_name ?: "dokka"))

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
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PUBLIC,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PROTECTED,
//                    org.jetbrains.dokka.DokkaConfiguration.Visibility.INTERNAL,
//                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PRIVATE,
//                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PACKAGE
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
                remoteUrl.set(URI("https://jetbrains.team/p/kqa/repositories/dokka-jvm-project/files/src").toURL())
                remoteLineSuffix.set("?tab=source&line=")
            }

            externalDocumentationLink {
                url.set(URI("https://api.ktor.io/").toURL())
                packageListUrl.set(
                    rootProject.projectDir.resolve("ktor-package-list.txt").toURL()
                )
            }
        }
    }

    pluginConfiguration<org.jetbrains.dokka.base.DokkaBase, org.jetbrains.dokka.base.DokkaBaseConfiguration> {
        customAssets = listOf(file("css/homeIcon.svg"))
        customStyleSheets = listOf(
            file("css/homeIcon.css"),
//                file("css/logo-styles.css"),
//                file("prism.css")
        )
        footerMessage = "Custom Footer Message (tm)"
        templatesDir = file("templates")
//            separateInheritedMembers = true
        homepageLink = "https://github.com/Kotlin/dokka" // starting 1.9.20
    }


    pluginConfiguration<VersioningPlugin, VersioningConfiguration> {
        version = "2.0.0"
        versionsOrdering = listOf("2.0.0", "1.9.20", "1.9.10", "1.8.20", "1.8.10")
        olderVersionsDir = file("documentation/version")
        renderVersionsNavigationOnAllPages = true
    }
}