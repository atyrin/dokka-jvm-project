package org.jetbrains.qa.langfeatures.companion.block

/**
 * Class holder of companions
 * https://github.com/Kotlin/KEEP/blob/main/proposals/KEEP-0449-companions-block-extension.md
 *
 * [companionPropertyString] and [companionPropertyInt] [companionPropertyNoKdoc] are properties
 * [companionPropertyFunction] is a function
 */
class CompanionBlockHolder {

    /**
     * Init kdoc
     */
    init {
        val a = ""
    }

    /**
     * Companion property itself
     */
    companion {
        /**
         * Base companion property
         *
         * @return companion property string
         */
        val companionPropertyString: String = ""

        /**
         * Base companion property. Like [companionPropertyString] but Int.
         * @return [Int]
         */
        val companionPropertyInt: Int = 0
        val companionPropertyNoKdoc: Nothing = TODO()

        /**
         * Base companion function
         * @return companion property function string
         */
        fun companionPropertyFunction(): String = ""
    }

    /**
     * soma edge cases
     */
    companion {
        /**
         * A constant declared in a companion block. This checks that the
         * `const` modifier is retained in the rendered signature.
         */
        const val constantValue: Int = 42

        /**
         * A mutable companion block property. This checks that a companion
         * block `var` is rendered as mutable.
         *
         * Reference to value: [companionPropertyString]
         */
        var mutableValue: String = "initial"

        /**
         * A companion block function with a generic collection signature.
         * This exercises type parameters, collection types, and a function
         * type in the Dokka signature and KDoc parameter table.
         *
         * @param values values to transform
         * @return transformed values keyed by their original value
         */
        fun <T> genericFunction(values: List<T>, transform: (T) -> String): Map<T, String> =
            values.associateWith(transform)

        /**
         * A fake constructor supplied by the companion block. `invoke` is the
         * operator specifically permitted for companion blocks by the KEEP,
         * so its operator signature should be rendered by Dokka.
         */
        operator fun invoke(value: String): CompanionBlockHolder =
            CompanionBlockHolder()
    }

    /**
     * References to the [CompanionBlockHolder]'s companion props and funs
     * [companionPropertyString] - string
     * [companionPropertyInt] - int
     * [companionPropertyFunction] - function
     * [CompanionBlockHolder.companionPropertyString] fqn like property
     * [CompanionBlockHolder.companionPropertyFunction] fqn like function
     */
    fun innerReferenceHolder(){}
}

/**
 * References to the [CompanionBlockHolder]'s companion props and funs
 *
 * [companionPropertyString] - unresolved string
 *
 * [companionPropertyInt] - unresolved int
 *
 * [companionPropertyFunction] - unresolved function
 *
 * [CompanionBlockHolder.companionPropertyString] fqn like property
 *
 * [CompanionBlockHolder.companionPropertyFunction] fqn like function
 */
fun outerReferenceHolder(){}


class CompanionBlockHolderWithConflicts {
    /**
     * base property
     */
    val companionWithConflictsPropertyString: String = ""
    /**
     * base Int property
     */
    val companionWithConflictsPropertyInt: Int = 0

    /**
     * base function
     */
    fun companionWithConflictsPropertyFunction(): String = ""

    companion {
        /**
         * property in companion block
         */
        val companionWithConflictsPropertyString: String = ""
        /**
         * property in companion block
         */
        val companionWithConflictsPropertyInt: Int = 0

        /**
         * function in companion block
         */
        fun companionWithConflictsPropertyFunction(): String = ""
    }

    companion {
        val companionWithConflictsPropertyInAnotherBlock: List<String> = listOf()
    }

    /**
     * Companion object
     */
    companion object {
        /**
         * property in companion object
         */
        val companionWithConflictsPropertyString: String = ""

        /**
         * property in companion object
         */
        val companionWithConflictsPropertyInt: Int = 0

        /**
         * function in companion object
         */
        fun companionWithConflictsPropertyFunction(): String = ""
    }

    /**
     * References to the [CompanionBlockHolderWithConflicts]'s companion props and funs
     *
     * [companionWithConflictsPropertyString] - string
     *
     * [companionWithConflictsPropertyInt] - int
     *
     * [companionWithConflictsPropertyFunction] - function
     *
     * [CompanionBlockHolderWithConflicts.companionWithConflictsPropertyString] fqn like property
     *
     * [CompanionBlockHolderWithConflicts.companionWithConflictsPropertyFunction] fqn like function
     *
     * [CompanionBlockHolderWithConflicts.Companion.companionWithConflictsPropertyString] fqn to companion object property
     *
     * [CompanionBlockHolderWithConflicts.Companion.companionWithConflictsPropertyFunction] fqn to companion object function
     */
    fun innerReferenceHolder(){}
}

/**
 * References to the [CompanionBlockHolderWithConflicts]'s companion props and funs
 *
 * [companionWithConflictsPropertyString] - unresolved string
 *
 * [companionWithConflictsPropertyInt] - unresolved int
 *
 * [companionWithConflictsPropertyFunction] - unresolved function
 *
 * [CompanionBlockHolderWithConflicts.companionWithConflictsPropertyString] fqn like property
 *
 * [CompanionBlockHolderWithConflicts.companionWithConflictsPropertyFunction] fqn like function
 *
 * [CompanionBlockHolderWithConflicts.Companion.companionWithConflictsPropertyString] fqn to companion object property
 *
 * [CompanionBlockHolderWithConflicts.Companion.companionWithConflictsPropertyFunction] fqn to companion object function
 */
fun outerReferenceHolderWithConflicts(){}