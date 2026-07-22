package org.jetbrains.qa.langfeatures.companion.extension

class CompanionExtensionHolder

/**
 * Companion extension property for a class without a companion object. This
 * covers the KEEP's promise that the companion scope can be extended even
 * when no companion declaration exists on the target class.
 */
companion val CompanionExtensionHolder.companionExtProperty: String = "extVal "

/**
 * Companion extension function for a class without a companion object. The
 * parameter is documented so the standalone extension page also exercises
 * ordinary KDoc rendering.
 *
 * @param k suffix used in the returned value
 */
companion fun CompanionExtensionHolder.companionExtFunction(k: String = "") = "extFun:$k "

/**
 * A mutable companion extension property. Unlike an ordinary Kotlin
 * extension property, this form may have backing-field-like initialization;
 * the `var` signature and setter are included to check their Dokka rendering.
 */
companion var CompanionExtensionHolder.companionExtVarProperty: String
    get() = "extension"
    set(value) {
        check(value.isNotEmpty())
    }

typealias CompanionExtensionHolderAlias = CompanionExtensionHolder

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
fun outerReferenceHolder() {}

class CompanionExtensionWithConflictHolder {
    val baseProperty = 0

    /**
     * base function
     */
    fun companionWithConflictExtFunction() {}
    val companionWithConflictExtProperty = ""

    companion {
        val companionWithConflictExtProperty = ""

        /**
         * Inner fun in companion block
         */
        fun companionWithConflictExtFunction() {}
    }

    companion object {
        val companionWithConflictExtProperty = ""

        /**
         * Fun in Companion object
         */
        fun companionWithConflictExtFunction() {}
    }
}

companion val CompanionExtensionWithConflictHolder.companionWithConflictExtProperty: String = "extVal "

/**
 * Extenstion companion fun.
 *
 * Reference to a [baseProperty] from the [CompanionExtensionWithConflictHolder] is unresolved.
 * But works with fqn: [CompanionExtensionWithConflictHolder.baseProperty]
 */
companion fun CompanionExtensionWithConflictHolder.companionWithConflictExtFunction() = "extFun "

/**
 * overload with arg for extension companion
 */
companion fun CompanionExtensionWithConflictHolder.companionWithConflictExtFunction(overload: String) =
    "extFun $overload"


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
fun outerReferenceWithConflictHolder() {}

/**
 * @suppress
 */
fun use() {
    CompanionExtensionWithConflictHolder.companionWithConflictExtFunction()
    CompanionExtensionWithConflictHolder.Companion.companionWithConflictExtFunction()
    CompanionExtensionWithConflictHolder().companionWithConflictExtFunction()
}
