package org.jetbrains.qa.kdoc.resolve.links

/**
 * A various Links to stdlib documentation
 * Consider signatures and KDocs
 */
class KotlinLangStdLibLinks {

    /**
     * [Nothing] leads to 404 https://github.com/Kotlin/dokka/issues/2320
     */
    fun navigationToKotlinLang(): Nothing {
        TODO()
    }

    /**
     * [Unit]
     */
    fun navigationToKotlinLangUnit(): Unit {
        TODO()
    }

    /**
     * [List]
     */
    fun navigationToKotlinLangList(): List<String> {
        TODO()
    }

    /**
     * [Set]
     */
    fun navigationToKotlinLangSet(): Set<String> {
        TODO()
    }

    /**
     * [Map] of [String] to [ByteArray]
     */
    fun navigationToKotlinLangMap(): Map<String, ByteArray> {
        TODO()
    }

    /**
     * Nullable generic standard-library type should preserve both the type argument and the
     * nullable marker while resolving the link to [List].
     */
    fun navigationToKotlinLangNullableList(): List<String>? {
        TODO()
    }

    /**
     * [Char]
     */
    fun navigationToKotlinLangChar(): Char {
        TODO()
    }
}
