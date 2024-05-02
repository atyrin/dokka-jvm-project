package org.jetbrains.qa.langfeatures.dataobjects


/**
 * Data object [DataObject]
 */
data object DataObject{
    /**
     * Property in data object
     */
    val properyInDataObject: String = ""


    /**
     * Function in data object
     */
    fun functionInDataObject(){

    }
}


/**
 * Class with nested objects [ClassWithNestedDO.DO01] and [ClassWithNestedDO.DO02]
 */
class ClassWithNestedDO{
    data object DO01
    data object DO02
}