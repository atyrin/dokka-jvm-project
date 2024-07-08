package org.jetbrains.qa.kdoc.rendering.edgecases


/**
 * Class in long name for issue in the viewing of references
 */
class LongPackageName {
    /**
     * @samples [org.jetbrains.qa.kdoc.rendering.samples.sampleBase]
     */
    fun methodWithSample(){
    }
}


/**
 * Class in long name for issue in the viewing of references
 */
class LongPackageNameAndEvenMoreLongClassNameInCamelCase {
    val LONG_PACKAGE_NAME_AND_EVEN_MORE_LONG_CLASS_NAME: Int = 0
    /**
     * @org.jetbrains.qa.kdoc.rendering.sample [sample]
     */
    fun methodInTheClassWithCamelCaseWithSample(){
    }
}


/**
 * Class in long name for issue in the viewing of references
 */
class LONG_PACKAGE_NAME_AND_EVEN_MORE_LONG_CLASS_NAME {
    /**
     * @org.jetbrains.qa.kdoc.rendering.sample [sample]
     */
    fun methodInTheClassWithCamelCaseWithSample(){
    }
}

/**
 * May hav issue with resolve from name: https://github.com/Kotlin/dokka/issues/2464
 */
enum class LongNamedEntries{
    DEFAULT_CENTER_BACKGROUND_ALPHA,
    DEFAULT_CENTER_BACKGROUND_BETA,
    LONG_PACKAGE_NAME_AND_EVEN_MORE_LONG_CLASS_NAME
}

