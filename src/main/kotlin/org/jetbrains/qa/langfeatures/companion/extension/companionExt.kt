package org.jetbrains.qa.langfeatures.companion.extension

class CompanionExtensionHolder
companion val CompanionExtensionHolder.companionExtProperty: String = "extVal "
companion fun CompanionExtensionHolder.companionExtFunction(k: String = "") = "extFun:$k "


/**
 * [CompanionExtensionHolder]
 *
 * [companionExtProperty]
 *
 * [companionExtFunction]
 *
 * [CompanionExtensionHolder.companionExtProperty] - fqn
 *
 * [CompanionExtensionHolder.companionExtFunction] - fqn
 */
fun outerReferenceHolder(){}

class CompanionExtensionWithConflictHolder{
    /**
     * base function
     */
    fun companionWithConflictExtFunction(){}
    val companionWithConflictExtProperty = ""

    companion {
        val companionWithConflictExtProperty = ""

        /**
         * Inner fun in companion block
         */
        fun companionWithConflictExtFunction(){}
    }

    companion object{
        val companionWithConflictExtProperty = ""

        /**
         * Fun in Companion object
         */
        fun companionWithConflictExtFunction(){}
    }
}
companion val CompanionExtensionWithConflictHolder.companionWithConflictExtProperty: String = "extVal "

/**
 * Extenstion companion fun
 */
companion fun CompanionExtensionWithConflictHolder.companionWithConflictExtFunction() = "extFun "

/**
 * overload with arg for extension companion
 */
companion fun CompanionExtensionWithConflictHolder.companionWithConflictExtFunction(overload: String) = "extFun $overload"


/**
 * Reference to [CompanionExtensionWithConflictHolder]
 *
 * [companionWithConflictExtProperty]
 *
 * [companionWithConflictExtFunction]
 *
 * [CompanionExtensionWithConflictHolder.companionWithConflictExtFunction]
 *
 */
fun outerReferenceWithConflictHolder(){}

/**
 * @suppress
 */
fun use(){
    CompanionExtensionWithConflictHolder.companionWithConflictExtFunction()
    CompanionExtensionWithConflictHolder.Companion.companionWithConflictExtFunction()
    CompanionExtensionWithConflictHolder().companionWithConflictExtFunction()
}