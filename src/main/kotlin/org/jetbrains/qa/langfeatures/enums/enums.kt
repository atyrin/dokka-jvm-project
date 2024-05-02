package org.jetbrains.qa.langfeatures.enums

/**
 * Simple kotlin Enum class
 */
enum class EnumKotlin {
    NORTH,
    SOUTH,
    WEST,
    EAST, // trailing comma
}

/**
 * Enum class with param [x]
 * @param x param
 */
enum class EnumKotlinParam(val x: String) {
    NORTH("n"),
    EAST("e"), // trailing comma
}

/**
 * Enum class with member override function
 */
enum class EnumKotlinWithMethod {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        /**
         * Override Signal in [TALKING]
         */
        override fun signal(): EnumKotlinWithMethod {
            return entryOnly()
        }
        fun entryOnly() = WAITING
    };

    /**
     * Enum class function to override.
     * BTW its abstract
     * @return [EnumKotlinWithMethod]
     */
    abstract fun signal(): EnumKotlinWithMethod
    fun rootFun() {}
}

/**
 * Extension method for Enum class
 */
public fun EnumKotlinWithMethod.extension(){}

val a = EnumKotlinWithMethod.TALKING.extension()


val x = EnumKotlin.entries.size