package org.jetbrains.qa.kdoc.location

/**
 * Class with all valid tags
 * @since 1.1
 * @author David Blaine <david@blain.com>
 * @throws NullPointerException on NPE `@throws` param
 * @throws NoSuchMethodException on NSME `@throws` param
 * @exception Exception Here is an `@exception` param
 * @see [java.io.StringReader.lock] see property
 * @see [java.io.StringReader.mark] see method
 * @see [java.io.StringReader] see class
 * @return [Int] exactly the same as param divided by 2
 * @param param primary constructor params
 * @sample [org.jetbrains.qa.kdoc.rendering.samples.sampleBase] sample function
 */
class ClassKDocLocation(param: String) {
}

/**
 * Class with params tag. But there are no params.
 * // not rendered with K2 on constructors page https://github.com/Kotlin/dokka/issues/3348
 * @param [paramInt] integer param
 * @param [paramStr] string param
 */
class ClassWithNonExistingParams

/**
 * Class with receiver tag. Shouldn't be applicable.
 *
 * @receiver String so, the receiver function. It is a class. So should be N/A
 */
class ClassWithReceiverTag

/**
 * Descriptions on properties
 */
data class DataClassExtras(
    /** it's  first parameter*/
    val param1: String,
    /** it is the second*/
    var param2: Int,
    var param3: Int,
    var param4: Int,
    var param5: Int, var param6: Int, var param7: Int, var param8: Int
)

