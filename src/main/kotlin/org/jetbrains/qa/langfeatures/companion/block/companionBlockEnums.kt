package org.jetbrains.qa.langfeatures.companion.block

/**
 * Enum class [EnumClassWithCompanionBlock] with [companionProperty] and [companionFunction]
 */
enum class EnumClassWithCompanionBlock(val value: String) {
    Entry("entry");

    /**
     * KDOC on companion block
     */
    companion {
        val companionProperty = ""
        fun companionFunction() = "touch"
    }
}