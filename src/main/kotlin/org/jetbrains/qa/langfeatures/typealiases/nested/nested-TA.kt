package org.jetbrains.qa.langfeatures.typealiases.nested


/**
 * Has a TA: [BasicTAContainer.AliasToTopLevelClass]
 */
class BasicTopLevelClass

class BasicTAContainer {
    /**
     * TA has an annotation Deprecated with message
     */
    @Deprecated (message = "test")
    typealias AliasToStringWithDeprecatedAnnotation = String

    /**
     * TA to a top level class [BasicTopLevelClass]
     */
    typealias AliasToTopLevelClass = BasicTopLevelClass


    class Nested
    /**
     * Alias to [Nested]
     */
    typealias AliasToNested = Nested

    inner class Inner
    typealias AliasToInner = Inner

    object Object
    typealias AliasToObject = Object

    companion object Companion
    typealias AliasToCompanion = Companion

    typealias AliasToFunctionalType = (Int) -> Boolean
    typealias AliasToFunctionalTypeWithGeneric<T> = (T) -> Boolean
}


/**
 * References to nested type aliases from [BasicTAContainer]:
 * * [BasicTAContainer.AliasToTopLevelClass] AliasToTopLevelClass
 * * [BasicTAContainer.AliasToNested] AliasToNested
 * * [BasicTAContainer.AliasToInner] AliasToInner
 * * [BasicTAContainer.AliasToObject] AliasToObject
 * * [BasicTAContainer.AliasToCompanion] AliasToCompanion
 * * [BasicTAContainer.AliasToFunctionalType] AliasToFunctionalType
 * * [BasicTAContainer.AliasToFunctionalTypeWithGeneric] AliasToFunctionalTypeWithGeneric
 */
fun referencesToNestedTypeAliasesInBasicTAContainer() {}