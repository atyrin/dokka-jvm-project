val dokka_version:String by project
plugins {

    kotlin("jvm") version "2.0.0-RC2"
    id("org.jetbrains.dokka") version "2.0.0-test-49477c44dfc58e2702f4c145ff41190b39d117fb" // Used to create a javadoc jar
//    id("org.jetbrains.dokka") version "1.9.10" // Used to create a javadoc jar
    `maven-publish`
    signing
}

group = "org.jetbrains.qa"
version = "2.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
}

val dokkaVersion: String by project
dependencies {
    compileOnly("org.jetbrains.dokka:dokka-core:$dokkaVersion")
    implementation("org.jetbrains.dokka:dokka-base:$dokkaVersion")
    compileOnly("org.jetbrains.dokka:analysis-kotlin-api:$dokkaVersion")

    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.dokka:dokka-test-api:$dokkaVersion")
    testImplementation("org.jetbrains.dokka:dokka-base-test-utils:$dokkaVersion")
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

    repositories {
        maven("https://oss.sonatype.org/service/local/staging/deploy/maven2/") {
            credentials {
                username = System.getenv("SONATYPE_USER")
                password = System.getenv("SONATYPE_PASSWORD")
            }
        }
    }
}

