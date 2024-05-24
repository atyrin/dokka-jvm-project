package org.jetbrains.qa.kdoc.rendering.samples

/**
 * @suppress
 */
fun sampleBase() {
    val a = 1
    val b = 2
    val sum = a + b
    println(sum)
}


/**
 * @suppress
 */
fun samplesComplex(): String {
    val a = 1..6
    val sum = a.sum()
    println(sum)
    return sum.toString()
}

/**
 * @suppress
 */
fun samplesWithReplacement(): String {
    val a = 1..6
    val sum = a.sum()
    replaceMe("<- shouldBeReplaced")
    println(sum)
    return sum.toString()
}

/**
 *
 * See dokka-test-plugin
 * @suppress
 */
fun replaceMe(s: String){}