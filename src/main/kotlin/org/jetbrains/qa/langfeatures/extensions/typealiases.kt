package org.jetbrains.qa.langfeatures.extensions

class ClassForTypealias{
    fun member(){}
}


typealias TypeAliasWithExtensions = ClassForTypealias

/**
 * Extension for typealias [TypeAliasWithExtensions].
 * Also see [this] reference.
 *
 * Without params.
 */
fun TypeAliasWithExtensions.extension1(){}

/**
 * Extension for typealias [TypeAliasWithExtensions]
 * With single params.
 * @param param Integer param
 */
fun TypeAliasWithExtensions.extension1(param: Int){}