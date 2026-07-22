package org.jetbrains.qa.langfeatures.companion.`object`

/**
 * A parent interface for class [WithCompanionThatHasAParent] companion
 */
interface CParent {
    fun func(): String
}

/**
 * Class [WithCompanionThatHasAParent] with companion [WithCompanionThatHasAParent.WithParent].
 * Companion has fun: [func] or [WithFunctionedCompanion.func] or [WithFunctionedCompanion.WithFunc.func]
 */
class WithCompanionThatHasAParent {
    companion object WithParent : CParent {
        override fun func() = "OK"
    }
}