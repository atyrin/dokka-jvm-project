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
version = "2.0.0"

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

        classpath("org.jetbrains.qa:dokka-test-plugin") // see included build
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
    dokkaHtmlPlugin("com.glureau:html-mermaid-dokka-plugin:0.4.4")
    dokkaHtmlPlugin("org.jetbrains.dokka:versioning-plugin:$dokka_version")
    dokkaHtmlPlugin("org.jetbrains.qa:dokka-test-plugin")
//    dokkaHtmlPlugin("org.jetbrains.dokka:javadoc-plugin:$dokka_version")
//    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:$dokka_version")
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
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.INTERNAL,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PRIVATE,
                    org.jetbrains.dokka.DokkaConfiguration.Visibility.PACKAGE
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