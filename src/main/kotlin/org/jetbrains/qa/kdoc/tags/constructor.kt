package org.jetbrains.qa.kdoc.tags.constructor

/**
 * @constructor description for default constructor
 */
class ConstructorTagDefault

/**
 * @constructor description for default constructor
 */
class ConstructorTagExplicitDefault()

/**
 * @constructor description for primary constructor
 */
class ConstructorTagPrimary(primary: String){
}

/**
 * @constructor description for secondary constructor NOT VISIBLE
 */
class ConstructorTagSecondary{
    constructor(secondary: String)
}

/**
 * Constructor Kdoc is located on constructor declaration
 */
class ConstructorTagSecondaryNonTag{

    /**
     * description for secondary constructor
     * Reference to class: [ConstructorTagSecondaryNonTag]
     */
    constructor(secondary: String)
}

/**
 * @constructor description for primary constructor [ConstructorTagWithClassReference],
 * external reference: [ConstructorTagDefault]
 */
class ConstructorTagWithClassReference()


/**
 * @constructor description for parent constructor
 */
open class ConstructorTagParent()

class ConstructorTagInhereted: ConstructorTagParent()


/**
 * @constructor description for interface constructor
 */
interface ConstructorTagInterface

/**
 * @constructor description for enum constructor
 */
enum class ConstructorTagEnum{
    A, B
}


/**
 * @constructor description for annotation constructor
 */
annotation class ConstructorTagAnnotationClass(val p: Int)