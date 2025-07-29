package org.jetbrains.qa.kdoc.resolve

import org.jetbrains.qa.kdoc.resolve.links.PackageLinks

/**
 * Class contains parameters that used in [CrossLinksConsumer]
 * @param propInConstructorWithKDoc some prop but in constructor
 * @param internalPropInConstructorWithKDoc some prop but in constructor with internal mod
 * @param paramWithKDoc some param
 * @property propertyWithKDoc some prop
 */
class CrossLinksSource(
    val propInConstructor: String,
    val propInConstructorWithKDoc: String,
    internal val internalPropInConstructorWithKDoc: String,
    internal val internalPropInConstructor: String,
    param: String,
    paramWithKDoc: String,

    ) {
    val property: Int = 0
    val propertyWithKDoc: Int = 0

    fun sourceFunction() {}

    class NestedClass {
        fun nestedFunction() {}
    }

    inner class InnerClass {
        fun innerFunction() {}
    }
}


/**
 * Description has links to parameters of another class @see [CrossLinksSource.param] (unresolves as param)
 * [Link With alias to prop][CrossLinksSource.property]
 * [FQN Link With alias to prop][org.jetbrains.qa.kdoc.resolve.CrossLinksSource.property]
 *  see [CrossLinksSource.paramWithKDoc] (unresolves as param)
 *  see [CrossLinksSource.internalPropInConstructorWithKDoc]
 *  See [CrossLinksSource.internalPropInConstructor]
 *  See [CrossLinksSource.propInConstructor]
 *  See [CrossLinksSource.propInConstructorWithKDoc]
 *  See [CrossLinksSource.property]
 *  See with fqn [org.jetbrains.qa.kdoc.resolve.CrossLinksSource.property]
 *  See [CrossLinksSource.propertyWithKDoc]
 *
 *  See [CrossLinksSource.sourceFunction]
 *
 *  See [CrossLinksSource.NestedClass]
 *  See [CrossLinksSource.NestedClass.nestedFunction]
 *  See [CrossLinksSource.InnerClass]
 *  See [CrossLinksSource.InnerClass.innerFunction]
 *
 *  See [CrossLinksSource]

 * @see [CrossLinksSource.paramWithKDoc] unresolves as param
 * @see [CrossLinksSource.internalPropInConstructorWithKDoc] resolved
 */
fun String.crossLinksInExtension() {
}

/**
 * Description has a links to parameters of another class
 * See [CrossLinksSource.param]
 * See [CrossLinksSource.paramWithKDoc]
 * See [CrossLinksSource.internalPropInConstructorWithKDoc]
 * See [CrossLinksSource.internalPropInConstructor]
 * See [CrossLinksSource.propInConstructor]
 * See [CrossLinksSource.propInConstructorWithKDoc]
 * See [CrossLinksSource.property]
 * See [CrossLinksSource.propertyWithKDoc]
 *
 * See [CrossLinksSource.sourceFunction]
 * See [CrossLinksSource.NestedClass]
 * See [CrossLinksSource.NestedClass.nestedFunction]
 * See [CrossLinksSource.InnerClass]
 * See [CrossLinksSource.InnerClass.innerFunction]
 *
 * See [CrossLinksSource]
 *
 * See [CrossLinksSource](CrossLinksSource) local link as external
 */
class CrossLinksConsumer



/**
 * See [CrossLinksSource](CrossLinksSource) local link as external
 *
 *
 * See [PackageLinks](PackageLinks) local link as external
 */
class CrossLinksConsumer2(p: PackageLinks)


class Ref

/**
 * Link [Ref](Ref)
 */
fun func(){}