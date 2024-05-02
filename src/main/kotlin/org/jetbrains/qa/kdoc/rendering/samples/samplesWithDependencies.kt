package org.jetbrains.qa.kdoc.rendering.samples

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

/**
 * @suppress
 */
suspend fun samplesDependencies() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://ktor.io/")

    println(response.status)
    println(response.bodyAsText())
}