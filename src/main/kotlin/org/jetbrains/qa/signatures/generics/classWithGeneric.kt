package org.jetbrains.qa.signatures.generics

/**
 * This class is parametrized with T
 */
class ClassWithGeneric<T>(val x: Int, var s: String) {}

/**
 * This class parameterized with T and one param has type T
 */
class ClassWithGenericAndParam<T>(x: T)

/**
 * This class parameterized with T and generic members
 */
class ClassWithGenericMembers<T>(x: T) {

    constructor(x: T, y: List<T>) : this(x)

    val prop: T? = null
    fun func(param: T): T? = null

    class Nested<E>(val e: E)
    inner class Inner<X>(val x: X)
    inner class InnerWithParentParam(val x: T)
}