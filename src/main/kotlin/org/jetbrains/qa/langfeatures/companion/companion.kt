package org.jetbrains.qa.langfeatures.companion



/**
 * Class [WithEmptyCompanion] with a companion: [WithEmptyCompanion.Companion]
 */
class WithEmptyCompanion{
    companion object{

    }
}

/**
 * Class [WithFieldedCompanion] with companion [WithFieldedCompanion.WithValue].
 * Companion has field: [value] or [WithFieldedCompanion.value] or [WithFieldedCompanion.WithValue.value]
 */
class WithFieldedCompanion{
    companion object WithValue{
        val value: String = " "
    }
}

class WithFieldedWithJvmFieldCompanion{

    companion object WithJvmFieldValue{
        @JvmField
        val value: String = " "
    }
}

/**
 * Class [WithFunctionedCompanion] with companion [WithFunctionedCompanion.WithFunc].
 * Companion has field: [value] or [WithFunctionedCompanion.func] or [WithFunctionedCompanion.WithFunc.func]
 */
class WithFunctionedCompanion{

    /**
     * Companion in [WithFunctionedCompanion] with function [func]
     */
    companion object WithFunc{

        /**
         * Function in [WithFunctionedCompanion.WithFunc]
         */
        fun func(){}
    }
}

/**
 * Extension for companion [WithFunctionedCompanion.WithFunc]: [WithFunctionedCompanion.WithFunc.extension]
 *
 * For nested extension see [org.jetbrains.qa.langfeatures.extensions]
 */
fun WithFunctionedCompanion.WithFunc.extension(){}

class WithFunctioedAndJvmStaticCompanion{
    companion object WithJvmStaticFunc{
        @JvmStatic
        fun func(){}
    }
}

/**
 * A parent interface for class [WithCompanionThatHasAParent] companion
 */
interface CParent{
    fun func(): String
}

/**
 * Class [WithCompanionThatHasAParent] with companion [WithCompanionThatHasAParent.WithParent].
 * Companion has fun: [func] or [WithFunctionedCompanion.func] or [WithFunctionedCompanion.WithFunc.func]
 */
class WithCompanionThatHasAParent{
    companion object WithParent: CParent{
        override fun func() = "OK"
    }
}


/**
 * @suppress
 */
fun useCompanions(){
    WithEmptyCompanion
    WithFieldedCompanion.value
    WithFieldedCompanion.value
    WithFieldedWithJvmFieldCompanion.value
    WithFieldedWithJvmFieldCompanion.value
    WithFunctionedCompanion.func()
    WithFunctionedCompanion.func()
}