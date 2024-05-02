package org.jetbrains.qa.kdoc.rendering.samples

/**
 * Reference without FQN -- in the same package. WILL NOT BE RENDERED
 * See [github issue](https://github.com/Kotlin/dokka/issues/2656)
 * @see [sampleBase] is not rendered since suppressed
 * @sample [sampleBase] sample here is not rendered
 */
fun sampleNonFqnIsNotRendered(a: Int): Int{
    return a + 1
}

/**
 * Function with sample with FQN
 * @see [org.jetbrains.qa.kdoc.rendering.samples.sampleBase]
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase]
 */
fun sampleByFqn(a: Int): Int{
    return a + 1
}

/**
 * Function with sample with FQN. Samples contain something and return
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.samplesComplex]
 */
fun sampleWithSomeLogic(a: Int): Int{
    return a + 1
}

/**
 * Samples has a reference to external dependency (ktor)
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.samplesDependencies]
 */
fun sampleWithExternalDependencies(a: Int): Int{
    return a + 1
}