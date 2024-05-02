package org.jetbrains.qa.signatures.modifiers

interface DelegationBase {
    fun print()
}

class DelegationBaseImpl(val x: Int) : DelegationBase {
    override fun print() { print(x) }
}

/**
 *
 */
class DelegationDerived(b: DelegationBase) : DelegationBase by b

/**
 * @suppress
 */
fun main() {
    val b = DelegationBaseImpl(10)
    DelegationDerived(b).print()
}