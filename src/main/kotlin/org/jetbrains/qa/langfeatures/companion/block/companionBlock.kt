package org.jetbrains.qa.langfeatures.companion.block

/**
 * Class holder of companions
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
         * Base companion property
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