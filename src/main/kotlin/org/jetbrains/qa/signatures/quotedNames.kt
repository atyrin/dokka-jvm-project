package org.jetbrains.qa.signatures

/**
 * Function with dashes in name
 */
fun `quoted-name-with-dashes`() {}



/**
 * Function with quoted param
 * @param `param a` param with quoted name
 */
fun `quoted-name-with-quoted-param`(`param a`: String) {}


/**
 * Class with spaces in the name
 * [`Quoted Class Name`] [Quoted Class Name]
 */
class `Quoted Class Name`() {

    /**
     * Function in class with quited name
     */
    fun `function it quoted class`(){}
}

/**
 * Class [Class With Quoted Name]
 */
class `Class With Quoted Name`