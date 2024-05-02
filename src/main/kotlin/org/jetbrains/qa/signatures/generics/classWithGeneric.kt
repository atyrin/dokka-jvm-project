package org.jetbrains.qa.signatures.generics

/**
 * This class is parametrized with T
 */
class ClassWithGeneric<T>(val x: Int, var s: String) { }

/**
 * This class parameterized with T and one param has type T
 */
class ClassWithGenericAndParam<T>(x: T) { }


fun simpleFun(params: Array<in String>){}