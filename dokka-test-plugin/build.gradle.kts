plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.dokka)
    `maven-publish`
    signing
}

group = "org.jetbrains.qa"
version = "2.0"

dependencies {
    compileOnly(libs.dokka.core)
    implementation(libs.dokka.base)
    compileOnly(libs.dokka.analysis.kotlin)

    testImplementation(kotlin("test"))
    testImplementation(libs.dokka.test.api)
    testImplementation(libs.dokka.base.test.utils)
}

kotlin {
    jvmToolchain(8)
}

tasks.dokkaHtml {
    outputDirectory.set(layout.buildDirectory.dir("dokka"))
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
    from(tasks.dokkaHtml)
}

java {
    withSourcesJar()
}

publishing {
    publications {
        val dokkaTemplatePlugin by creating(MavenPublication::class) {
            artifactId = project.name
            from(components["java"])
            artifact(javadocJar)

            pom {
                name.set("Dokka template plugin")
                description.set("This is a plugin template for Dokka")
                url.set("https://github.com/Kotlin/dokka-plugin-template/")
            }
        }
    }
}

