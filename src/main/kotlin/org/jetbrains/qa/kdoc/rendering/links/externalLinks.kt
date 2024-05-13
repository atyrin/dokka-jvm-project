package org.jetbrains.qa.kdoc.rendering.links

/**
 * Links to embeded external resource: Android SDK, JDK
 */
class ExternalImplicitLinks {
    /**
     * @see [java.applet.AppletContext.showDocument] method
     * @see [java.applet.AppletContext] class
     * @see [java.io.StringReader] стрин ридер
     * @see  [java.io.StringReader.TRANSFER_BUFFER_SIZE] just see it as well
     * @see  [java.io.StringReader.lock] without parameters
     * @see  [java.io.StringReader.mark] with int param
     */
    fun toJdk() {}
}

/**
 * External explicit resources. Supported via package lists.
 */
class ExternalExplicitLinks {
    //todo:
    fun coroutines(){}
}