package org.jetbrains.qa.langfeatures.companion

/**
 * Class [WithFieldedCompanion] with companion [WithFieldedCompanion.WithValue].
 * Companion has field: [value] or [WithFieldedCompanion.value] or [WithFieldedCompanion.WithValue.value]
 */
class WithFieldedCompanion {
    companion object WithValue {
        val value: String = " "
    }
}

class WithFieldedWithJvmFieldCompanion {
    companion object WithJvmFieldValue {
        @JvmField
        val value: String = " "
    }
}