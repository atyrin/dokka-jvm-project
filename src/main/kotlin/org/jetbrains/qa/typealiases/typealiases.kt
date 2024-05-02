package org.jetbrains.qa.typealiases

open class OpenTAClass
typealias OpenTA = OpenTAClass
/**
 * typealias with name [TypealiasToClass]
 */
class ClassForUsingInTypeAlias(val name: String){
    fun func(){}

    inner class Inner
}

fun OpenTA.x(){}

/**
 * This is a typealias to local class [ClassForUsingInTypeAlias]
 */
typealias TypealiasToClass = ClassForUsingInTypeAlias

/**
 * This is a typealias to inner class inside local class [ClassForUsingInTypeAlias.Inner]
 */
typealias TypealiasToInnerClass = ClassForUsingInTypeAlias.Inner


/**
 * Typealias to external class in java stdlib [java.io.BufferedInputStream]
 */
typealias TypealiasToExternalClass = java.io.BufferedInputStream

/**
 * Typealias to functional type `(Int, String, Any) -> Unit`
 */
typealias TypeAliasToFunctionType = (Int, String, Any) -> Unit

/**
 * Typealias to functional type `(T) -> Boolean`
 */
typealias TypeAliasToFunctionTypeWithGeneric<T> = (T) -> Boolean