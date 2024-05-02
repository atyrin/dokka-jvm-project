package org.jetbrains.qa.signatures.visibility


/**
 * Class where constructor has visibility modifiers
 */
open class ClassWithVisibilityMods public constructor(){

    public constructor(pub: String): this(){}
    internal constructor(internal:Int): this(){}

    /**
     * Protected constryctor
     */
    protected constructor(protected: Char): this(){}

    /**
     * Private constructor
     * @param private Byte param
     */
    private constructor(private: Byte): this(){}
}

public class ExplicitPublicClass(){}
class DefaultPublicClass(){}
internal class InternalClass(){}
private class PrivateClass(){}

public object ExplicitPublicObject{}
object DefaultPublicObject{}
internal object InternalObject{}
private object PrivateObject{}

public fun explicitPublicFunction(){}
fun defaultPublicFunction(){}
internal fun internalFunction(){}
private fun privateFunction(){}


public fun Any.explicitPublicExtensionFunction(){}
fun Any.defaultPublicExtensionFunction(){}
internal fun Any.internalExtensionFunction(){}
private fun Any.privateExtensionFunction(){}

public val explicitPublicVal = 0
val defaultPublicVal = 0
internal val internalVal = 0
private val privateVal = 0