import org.jetbrains.dokka.gradle.engine.parameters.VisibilityModifier
import org.jetbrains.dokka.gradle.engine.plugins.DokkaPluginParametersBaseSpec
import org.jetbrains.dokka.gradle.formats.DokkaFormatPlugin
import org.jetbrains.dokka.gradle.internal.InternalDokkaGradlePluginApi
import java.net.URI

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.dokka)
}

group = "org.jetbrains.qa"
version = "2.3.0"

kotlin {
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs.addAll(
            listOf(
                "-Xcontext-parameters",
                "-Xrender-internal-diagnostic-names",
                "-XXLanguage:+NestedTypeAliases",
                "-Xcompanion-blocks-and-extensions"
            )
        )
    }
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
//    dokkaHtmlPlugin(libs.dokka.mermaid)
//    dokkaHtmlPlugin(libs.dokka.javadoc)
//    dokkaHtmlPlugin(libs.dokka.kotlin.`as`.java)
//    dokkaPlugin("org.jetbrains.dokka:gfm-plugin:2.1.0")

    dokkaHtmlPlugin("org.jetbrains.qa:dokka-test-plugin")
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-playground-samples-plugin")

}


dokka {
//    dokkaGeneratorIsolation = ClassLoaderIsolation()

    dokkaPublications.html {
        // override output location
        val dokka_output_name: String? by project
        outputDirectory.set(layout.buildDirectory.dir(dokka_output_name ?: "dokka"))
        offlineMode.set(false)
        failOnWarning.set(false)
    }
//    dokkaEngineVersion.set("1.9.20")

    dokkaSourceSets {
        configureEach {
            moduleName.set("Dokka JVM Project")
            moduleVersion.set(project.version.toString())
//            failOnWarning.set(false)
//            offlineMode.set(false)

            // change location for links to JDK references
            jdkVersion.set(17)

//            suppressInheritedMembers.set(true)
//            suppressObviousFunctions.set(true)

//            suppress.set(false)
//            displayName.set(name)
//            reportUndocumented.set(false)
//            skipEmptyPackages.set(true)
//            skipDeprecated.set(false)
//            suppressGeneratedFiles.set(true)
//            languageVersion.set("1.7")
//            apiVersion.set("1.7")
//            includes.from(project.files(), "packages.md", "extra.md")
//            analysisPlatform.set(KotlinPlatform.DEFAULT)
//            sourceRoots.from(file("src"))
//            classpath.from(project.files(), file("libs/dependency.jar"))

            includes.from("extra.md")

            samples.from(
                "src/main/kotlin/org/jetbrains/qa/kdoc/rendering/samples/samples.kt",
                "src/main/kotlin/org/jetbrains/qa/kdoc/rendering/samples/samplesWithDependencies.kt",
            )

            documentedVisibilities.set(
                setOf(
                    VisibilityModifier.Public,
                    VisibilityModifier.Protected,
                )
            )

            // Suppress a package
            perPackageOption {
                matchingRegex.set(""".*\.secret.*""") // will match all .internal packages and sub-packages
                suppress.set(true)
            }

            suppressAnnotatedWith.set(setOf("org.perpackage.suppress.DokkaHidden"))

            perPackageOption {
                matchingRegex.set(""".*\.specialoption.*""")
                documentedVisibilities.set(
                    setOf(
                        VisibilityModifier.Public,
                        VisibilityModifier.Internal,
                    )
                )
            }

            // add (sources) to the signature line and navigate to sources
            sourceLink {
                localDirectory.set(projectDir.resolve("src"))
                remoteUrl.set(URI("https://github.com/atyrin/dokka-jvm-project/blob/master/src"))
                remoteLineSuffix.set("#L")
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
        customStyleSheets.from("css/homeIcon.css")
        footerMessage = "Custom Footer Message (tm)"
//        templatesDir = file("templates")
//            separateInheritedMembers = true
        homepageLink = "https://github.com/Kotlin/dokka" // starting 1.9.20
    }

    pluginsConfiguration.versioning {
        version = "2.3.0"
        versionsOrdering = listOf(
            "2.3.0",
            "2.2.0",
            "2.1.0", "2.0.0", "1.9.20", "1.9.10", "1.8.20", "1.8.10"
        )
        olderVersionsDir = file("documentation/version")
        renderVersionsNavigationOnAllPages = true
    }

    pluginsConfiguration.kotlinPlaygroundSamples {
//        this.kotlinPlaygroundScript.set("https://script.url")
//        this.kotlinPlaygroundServer.set("https://my-kotlin-playground-server")
    }
}


//@OptIn(InternalDokkaGradlePluginApi::class)
//abstract class DokkaMarkdownPlugin : DokkaFormatPlugin(formatName = "markdown") {
//    override fun DokkaFormatPlugin.DokkaFormatPluginContext.configure() {
//        project.dependencies {
//            // Sets up current project generation
//            dokkaPlugin(dokka("gfm-plugin"))
//
//            // Sets up multimodule generation
//            formatDependencies.dokkaPublicationPluginClasspathApiOnly.dependencies.addLater(
//                dokka("gfm-template-processing-plugin")
//            )
//        }
//    }
//}