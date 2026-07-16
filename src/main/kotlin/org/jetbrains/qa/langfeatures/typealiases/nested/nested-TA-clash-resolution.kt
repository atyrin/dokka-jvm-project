package org.jetbrains.qa.langfeatures.typealiases.nested

import org.jetbrains.qa.langfeatures.typealiases.nested.AliasHolder.*

class TopLevelClass

open class AliasHolder {
    typealias AliasToTopLevelClass = TopLevelClass
    protected typealias ProtectedAliasToTopLevelClass = TopLevelClass
    private typealias PrivateAliasToTopLevelClass = TopLevelClass

    class Nested
    typealias AliasToNested = Nested
    protected typealias ProtectedAliasToNested = Nested
    private typealias PrivateAliasToNested = Nested

    inner class Inner{
        val innerProp: Int = 0
        fun innerMethod(){}
    }


    /**
     * Call to value ([Inner]) properties
     *
     * [innerProp] - same issue https://github.com/Kotlin/dokka/issues/3521
     * [innerMethod] - same issue https://github.com/Kotlin/dokka/issues/3521
     */
    typealias AliasToInner = Inner
    protected typealias ProtectedAliasToInner = Inner
    private typealias PrivateAliasToInner = Inner

    open var propOfAliasToTopLevelClass: AliasToTopLevelClass = TopLevelClass()
    open var propOfProtectedAliasToTopLevelClass: ProtectedAliasToTopLevelClass = TopLevelClass()
    open var propOfPrivateAliasToTopLevelClass: PrivateAliasToTopLevelClass = TopLevelClass()

    open var propOfAliasToNested: AliasToNested = Nested()
    open var propOfProtectedAliasToNested: ProtectedAliasToNested = Nested()
    open var propOfPrivateAliasToNested: PrivateAliasToNested = Nested()

    open var propOfAliasToInner: AliasToInner = Inner()
    open var propOfProtectedAliasToInner: ProtectedAliasToInner = Inner()
    open var propOfPrivateAliasToInner: PrivateAliasToInner = Inner()

    open var propOfInaccessibleAliasFromNested: AliasToTopLevelClassInsideNested = NestedAliasHolder.AliasToTopLevelClassInsideNested()
    open var propOfInaccessibleAliasFromInner: AliasToTopLevelClassInsideInner = InnerAliasHolder.AliasToTopLevelClassInsideInner()
    open var propOfInaccessibleAliasFromObject: AliasToTopLevelClassInsideObject = ObjectAliasHolder.AliasToTopLevelClassInsideObject()

    class NestedAliasHolder {
        typealias AliasToTopLevelClassInsideNested = TopLevelClass
        typealias AliasToUpperLevelNestedAlias = AliasToTopLevelClass

        var propOfOwnTypeAlias: AliasToTopLevelClassInsideNested = AliasHolder.AliasToTopLevelClass()

        var propOfUpperLevelAlias: AliasToTopLevelClass = TopLevelClass()
        var propOfProtectedUpperLevelAlias: ProtectedAliasToTopLevelClass = TopLevelClass()
        var propOfPrivateUpperLevelAlias: PrivateAliasToTopLevelClass = TopLevelClass()

        var propOfUpperLevelNestedAliasedType: AliasToNested = Nested()
        var propOfUpperLevelProtectedNestedAliasedType: ProtectedAliasToNested = Nested()
        var propOfUpperLevelPrivateNestedAliasedType: PrivateAliasToNested = Nested()

        var propOfUpperLevelInnerAliasedType: AliasToInner = AliasHolder().Inner()
        var propOfUpperLevelProtectedInnerAliasedType: ProtectedAliasToInner = AliasHolder().Inner()
        var propOfUpperLevelPrivateInnerAliasedType: PrivateAliasToInner = AliasHolder().Inner()
    }

    inner class InnerAliasHolder {
        typealias AliasToTopLevelClassInsideInner = TopLevelClass
        typealias AliasToUpperLevelNestedAlias = AliasToTopLevelClass

        var propOfOwnTypeAlias: AliasToTopLevelClassInsideInner = AliasHolder.AliasToTopLevelClass()

        var propOfUpperLevelAlias: AliasToTopLevelClass = TopLevelClass()
        var propOfProtectedUpperLevelAlias: ProtectedAliasToTopLevelClass = TopLevelClass()
        var propOfPrivateUpperLevelAlias: PrivateAliasToTopLevelClass = TopLevelClass()

        var propOfUpperLevelNestedAliasedType: AliasToNested = Nested()
        var propOfUpperLevelProtectedNestedAliasedType: ProtectedAliasToNested = Nested()
        var propOfUpperLevelPrivateNestedAliasedType: PrivateAliasToNested = Nested()

        var propOfUpperLevelInnerAliasedType: AliasToInner = Inner()
        var propOfUpperLevelProtectedInnerAliasedType: ProtectedAliasToInner = Inner()
        var propOfUpperLevelPrivateInnerAliasedType: PrivateAliasToInner = Inner()
    }

    object ObjectAliasHolder {
        /**
         * References to properties from TA
         *
         * [propOfOwnTypeAlias] - same level property
         * [AliasToUpperLevelNestedAlias] - same level nested typealias
         * [AliasToTopLevelClass] - upper level typealias
         */
        typealias AliasToTopLevelClassInsideObject = TopLevelClass
        typealias AliasToUpperLevelNestedAlias = AliasToTopLevelClass

        var propOfOwnTypeAlias: AliasToTopLevelClassInsideObject = AliasHolder.AliasToTopLevelClass()

        var propOfUpperLevelAlias: AliasToTopLevelClass = TopLevelClass()
        var propOfProtectedUpperLevelAlias: ProtectedAliasToTopLevelClass = TopLevelClass()
        var propOfPrivateUpperLevelAlias: PrivateAliasToTopLevelClass = TopLevelClass()

        var propOfUpperLevelNestedAliasedType: AliasToNested = Nested()
        var propOfUpperLevelProtectedNestedAliasedType: ProtectedAliasToNested = Nested()
        var propOfUpperLevelPrivateNestedAliasedType: PrivateAliasToNested = Nested()

        var propOfUpperLevelInnerAliasedType: AliasToInner = AliasHolder().Inner()
        var propOfUpperLevelProtectedInnerAliasedType: ProtectedAliasToInner = AliasHolder().Inner()
        var propOfUpperLevelPrivateInnerAliasedType: PrivateAliasToInner = AliasHolder().Inner()
    }
}

class SubAliasHolder: AliasHolder() {

    typealias AliasToPortectedParentTypealias = ProtectedAliasToTopLevelClass
    override var propOfAliasToTopLevelClass: AliasToTopLevelClass = AliasHolder.AliasToTopLevelClass()
    override var propOfProtectedAliasToTopLevelClass: ProtectedAliasToTopLevelClass = AliasHolder.ProtectedAliasToTopLevelClass()

    override var propOfAliasToNested: AliasToNested = AliasHolder.AliasToNested()
    override var propOfProtectedAliasToNested: ProtectedAliasToNested = AliasHolder.ProtectedAliasToNested()

    override var propOfAliasToInner: AliasToInner = AliasHolder().AliasToInner()
    override var propOfProtectedAliasToInner: ProtectedAliasToInner = AliasHolder().ProtectedAliasToInner()

    override var propOfInaccessibleAliasFromNested: AliasToTopLevelClassInsideNested = NestedAliasHolder.AliasToTopLevelClassInsideNested()
    override var propOfInaccessibleAliasFromInner: AliasToTopLevelClassInsideInner = InnerAliasHolder.AliasToTopLevelClassInsideInner()
    override var propOfInaccessibleAliasFromObject: AliasToTopLevelClassInsideObject = ObjectAliasHolder.AliasToTopLevelClassInsideObject()
}


typealias AliasToTopLevelClassInsideNested = AliasHolder.NestedAliasHolder.AliasToTopLevelClassInsideNested
typealias AliasToTopLevelClassInsideInner = AliasHolder.InnerAliasHolder.AliasToTopLevelClassInsideInner

/**
 * clash with name of nested TA [AliasToTopLevelClassInsideObject]
 */
typealias AliasToTopLevelClassInsideObject = AliasHolder.ObjectAliasHolder.AliasToTopLevelClassInsideObject

/**
 *  ```
 *  class Nested
 *  typealias ListTA<T> = List<T>
 *  typealias ListOfNestedTA = ListTA<Nested>
 *   ```
 */
class TaToTaContainer {
    class Nested

    typealias ListTA<T> = List<T>
    typealias ListOfNestedTA = ListTA<Nested>
}

/**
 * * [AliasToTopLevelClassInsideNested] AliasToTopLevelClassInsideNested
 * * [AliasToTopLevelClassInsideInner] AliasToTopLevelClassInsideInner
 *
 * * [AliasHolder.NestedAliasHolder.AliasToTopLevelClassInsideNested] AliasToTopLevelClassInsideNested
 * * [AliasHolder.NestedAliasHolder.AliasToUpperLevelNestedAlias] AliasToUpperLevelNestedAlias
 */
fun referencesToNestedTypeAliasesInTaToTaContainer() {}