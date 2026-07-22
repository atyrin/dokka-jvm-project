package org.perpackage.suppress


/**
 * Annotation to mark elements that should not be visible in Dokka documentation.
 * See the build script
 */
annotation class DokkaHidden()

/**
 * Should be the only visible class in the package along [DokkaHidden]
 */
class NotHidden {
    @DokkaHidden
    val hiddenClassProperty = 0

    @DokkaHidden
    fun hiddenClassFunction() {
    }

    @DokkaHidden
    companion object {
        @DokkaHidden
        val hiddenCompanionProperty = 0
    }
}

@DokkaHidden
class HiddenClass

@DokkaHidden
interface HiddenInterface

@DokkaHidden
abstract class AbstractClass

@DokkaHidden
val hiddenProperty = 0

@DokkaHidden
fun hiddenFunction() {
}

@DokkaHidden
fun NotHidden.hiddenExtFunction() {
}

@DokkaHidden
const val hiddenConst = 0