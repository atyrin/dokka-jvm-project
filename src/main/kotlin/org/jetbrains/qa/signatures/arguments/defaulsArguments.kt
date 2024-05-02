package org.jetbrains.qa.signatures.arguments

/**
 * Class used in the [defValueFunWithCustomClass]
 */
data class Argument(val arg: String)

/**
 * Default value in a *simple* class
 */
class DefValue(val str: String = "defString", val num: Int = 42)

/**
 * Default value in a *data* class
 */
data class DefValueData(val ch: Char = 'c', val str: String = "defString", val num: Int = 42)


/**
 * Default value in a *data* class
 */
data class DefValueDataWithGap(val str: String = "defString", val unknown: String, val num: Int = 42)


/**
 * Default value in a function
 * @param str param str
 */
fun defValueFun(str: String = "defString"){}

/**
 * Default value in a function
 */
fun defValueFunWithCustomClass(str: String = "defString", custom: Argument = Argument("")){}


const val CONST_DEF_VALUE = "VALUE"
val valWithDefaulValue = "VALUE"

object NamedObjectDefValue{
    /**
     * Const in named object with value = 'VALUE'
     */
    const val CONST_DEF_VALUE_IN_NAMED_OBJECT = "VALUE"
    val valWithDefaulValue = "VALUE"
}

class WithCompanionAndDefaultValueConst{
    companion object{
        const val CONST_DEF_VALUE = "VALUE"
        val valWithDefaulValue = "VALUE"
    }
}
