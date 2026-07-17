package org.jetbrains.qa.dependencies

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import org.http4k.core.Filter
import org.http4k.core.HttpHandler
import org.http4k.core.Method.GET
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.routing.bind
import org.http4k.routing.path
import org.http4k.routing.routes

class ExternalDependnecies {
    val client = HttpClient(CIO)

    /**
     * Link to the [HttpClient] doesn't work because of [https://github.com/Kotlin/dokka/issues/2444]
     *
     * @return [HttpStatusCode]
     * @param client ktor [HttpClient]
     */
    suspend fun ktorClient(client: HttpClient): HttpStatusCode {
        val response: HttpResponse = client.get("https://ktor.io/")
        println(response.status)
        println(response.bodyAsText())
        return response.status
    }

    /**
     * Property with type [Filter]
     */
    val http4k: Filter = Filter { next: HttpHandler ->
        { request: Request ->
            val start = System.currentTimeMillis()
            val response = next(request)
            val latency = System.currentTimeMillis() - start
            println("Request to ${request.uri} took ${latency}ms")
            response
        }
    }
}

/**
 * Usersolved reference to [ExternalDependnecies1]
 */
val a = ExternalDependnecies1()