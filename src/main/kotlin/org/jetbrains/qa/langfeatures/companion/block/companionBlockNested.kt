package org.jetbrains.qa.langfeatures.companion.block

class CompanionBlockTopHolder {
    class CompanionBlockNestedHolder {
        companion {
            /**
             * nested companion property
             */
            val companionNestedProperty: String = ""
            fun companionNestedFunction(): String = ""
        }
    }

    inner class CompanionBlockInnerHolder {
        companion {
            val companionInnerProperty: String = ""
            fun companionInnerFunction(): String = ""
        }
    }
}

/**
 * outer reference holder for nested companion
 *
 * [CompanionBlockTopHolder.CompanionBlockNestedHolder.companionNestedProperty]
 *
 * [companionNestedProperty] unresolved nested prop
 *
 * [CompanionBlockTopHolder.CompanionBlockInnerHolder.companionInnerProperty]
 *
 * [CompanionBlockTopHolder.CompanionBlockInnerHolder.companionInnerFunction]
 *
 * [companionInnerProperty] unresolved innert prop
 */
fun outerReferenceHolderForNestedCompanion() {}