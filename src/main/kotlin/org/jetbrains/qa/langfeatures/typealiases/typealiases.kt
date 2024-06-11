package org.jetbrains.qa.langfeatures.typealiases

open class OpenTAClass
typealias OpenTA = OpenTAClass
/**
 * More cases for extensions and typealiases see in [org.jetbrains.qa.langfeatures.extensions]
 */
fun OpenTA.x(){}


/**
 * TA to a [String]
 */
typealias TypealiasToStdlib = String

/**
 * TA to [java.io.File] from JDK
 */
typealias TypealiasToJava = java.io.File

/**
 * The class in used in typealias with name [TypealiasToClass]
 */
class ClassForUsingInTypeAlias(val name: String){
    fun func(){}

    inner class Inner
}

/**
 * This is a typealias to local class [ClassForUsingInTypeAlias]
 */
typealias TypealiasToClass = ClassForUsingInTypeAlias

/**
 * This is a typealias to inner class inside local class [ClassForUsingInTypeAlias.Inner]
 * Itself: [TypealiasToInnerClass]
 */
typealias TypealiasToInnerClass = ClassForUsingInTypeAlias.Inner


/**
 * Typealias to external class in java stdlib [java.io.BufferedInputStream]
 * Itself: [TypealiasToExternalClass]
 */
typealias TypealiasToExternalClass = java.io.BufferedInputStream

/**
 * Typealias to functional type `(Int, String, Any) -> Unit`
 * Itself: [TypeAliasToFunctionType]
 */
typealias TypeAliasToFunctionType = (Int, String, Any) -> Unit

/**
 * Typealias to functional type `(T) -> Boolean`
 * Itself: [TypeAliasToFunctionTypeWithGeneric]
 */
typealias TypeAliasToFunctionTypeWithGeneric<T> = (T) -> Boolean

/**
 * Typealias to functional type `(T, G) -> Boolean`
 * Itself: [TypeAliasToFunctionTypeWithGeneric2Params]
 */
typealias TypeAliasToFunctionTypeWithGeneric2Params<T, G> = (T, G) -> Boolean


/* visibilities */

public typealias VisibilityTypeAliasPublic = String
internal typealias VisibilityTypeAliasInternal = String
private typealias VisibilityTypeAliasPrivate = String