package org.jetbrains.qa.kdoc.location

/**
 * Class contrain parameters that used in [CrossLinksConsumer]
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

){
    val property: Int = 0
    val propertyWithKDoc: Int = 0
}


/**
 * Description has a links to parameters of another class @see [CrossLinksSource.param] (unresolves as param)
 *  see [CrossLinksSource.paramWithKDoc] (unresolves as param)
 *  see [CrossLinksSource.internalPropInConstructorWithKDoc] \n
 *  See [CrossLinksSource.internalPropInConstructor] \n
 *  See [CrossLinksSource.propInConstructor]
 *  See [CrossLinksSource.propInConstructorWithKDoc]
 *  See [CrossLinksSource.property]
 *  See [CrossLinksSource.propertyWithKDoc]
 *  See [CrossLinksSource]

 * @see [CrossLinksSource.paramWithKDoc] unresolves as param
 * @see [CrossLinksSource.internalPropInConstructorWithKDoc] resolved
 */
fun String.crossLinksInExtension(){
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
 * See [CrossLinksSource]
 */
class CrossLinksConsumer{

}