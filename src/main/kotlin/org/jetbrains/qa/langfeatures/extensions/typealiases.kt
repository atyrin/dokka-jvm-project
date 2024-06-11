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
fun TypeAliasWithExtensions.extensionOnTA1(){}

/**
 * Extension for typealias [TypeAliasWithExtensions]
 * With single params.
 * @param param Integer param
 * @receiver some description about receiver [TypeAliasWithExtensions]
 */
fun TypeAliasWithExtensions.extensionOnTA1(param: Int){
    member()
}

/**
 * Extension for typealias [TypeAliasWithExtensions].
 * And also a reference to a member of type aliased type [ClassForTypealias] -- [ClassForTypealias.member]
 * The reference: [this.member] or [member]
 */
fun TypeAliasWithExtensions.extensionOnTACallMember() {
}