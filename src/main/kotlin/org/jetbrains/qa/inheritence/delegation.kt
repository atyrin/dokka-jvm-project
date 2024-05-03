package org.jetbrains.qa.inheritence.delegation

interface CookieJar {
    /**
     * Saves cookies
     */
    fun saveFromResponse(url: String)
}

class CookieJarImpl() : CookieJar {
    override fun saveFromResponse(url: String) {}
}


/**
 * Expected to have a method [saveFromResponse] with override modifier
 */
class JavaNetCookieJar private constructor(
    delegate: CookieJarImpl,
) : CookieJar by delegate