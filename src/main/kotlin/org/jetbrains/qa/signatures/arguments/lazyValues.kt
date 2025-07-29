package org.jetbrains.qa.signatures.arguments.lazy

/**
 * There was a diff in K1/K2
 */
open class ClassWithLazyProp(val lazyValue: Lazy<String>){
    constructor(a: String, lazyValue: Lazy<String> ): this(lazyValue)
}

fun funWithlazyArg(lazyValue: Lazy<String>){}