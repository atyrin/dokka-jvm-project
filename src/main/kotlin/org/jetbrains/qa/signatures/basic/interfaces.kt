package org.jetbrains.qa.signatures.basic

interface BasicInterface {}

/**
 * SAM interface
 */
fun interface BasicFunInterface{

    /**
     * A method in SAM interface
     */
    fun single()
}

/**
 * Variable implementing SAM [BasicFunInterface]
 */
val samUsage: BasicFunInterface = BasicFunInterface { TODO("Not yet implemented") }

/**
 * Abstract interface
 */
abstract interface AbstractBasicInterface

/**
 * Sealed interface
 */
sealed interface SealedBasicInterface