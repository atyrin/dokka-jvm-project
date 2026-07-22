package org.jetbrains.qa.langfeatures.companion.`object`

/**
 * Class [WithFunctionedCompanion] with companion [WithFunctionedCompanion.WithFunc].
 * Companion has function: [WithFunctionedCompanion.func] or [WithFunctionedCompanion.WithFunc.func]
 */
class WithFunctionedCompanion {

    /**
     * Companion in [WithFunctionedCompanion] with function [func]
     */
    companion object WithFunc {

        /**
         * Function in [WithFunctionedCompanion.WithFunc]
         */
        fun func() {}
    }
}

/**
 * Extension for companion [WithFunctionedCompanion.WithFunc]: [WithFunctionedCompanion.WithFunc.extension]
 *
 * For nested extension see [org.jetbrains.qa.langfeatures.extensions]
 */
fun WithFunctionedCompanion.WithFunc.extension() {}

class WithFunctioedAndJvmStaticCompanion {
    companion object WithJvmStaticFunc {
        @JvmStatic
        fun func() {
        }
    }
}