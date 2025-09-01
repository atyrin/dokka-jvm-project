package org.jetbrains.qa.inheritence.generics

interface IPerson<Z> {
    val age: Int

    /**
     * Name description in interface
     */
    val name: String
    val generation: Z
}

/**
 * @property age general persons age -- not rendered on the property page https://github.com/Kotlin/dokka/issues/2304
 * @property name general persons name -- not rendered on the property page https://github.com/Kotlin/dokka/issues/2304
 */
class GeneralPersonImplementation<Z>(
    override val age: Int,
    override val name: String,
    /**
     * general person generation
     */
    override val generation: Z
) : IPerson<Z>

class StringPersonImplementation(override val age: Int, override val name: String, override val generation: String) :
    IPerson<String>

open class Job<T> {
    open fun do1() {}
    open fun do2(generation: T): IPerson<T> {
        return GeneralPersonImplementation(1, "Scott", generation)
    }

    /**
     * Job do3
     */
    open fun do3() {}
}

class GoodJob : Job<Int>() {
    /**
     * GoodJob do3
     */
    override fun do3() {}
}

interface TopLevelInterface<T> {
    fun toOverrideOnTheMiddle(t: T) = 0
}

open class MiddleSubclass<T> : TopLevelInterface<T> {
    override fun toOverrideOnTheMiddle(t: T) = 1
}

/**
 * Should have [toOverrideOnTheMiddle] method with `override` keyword. See https://github.com/Kotlin/dokka/issues/3848
 *
 */
class BottomClass<T> : MiddleSubclass<T>()