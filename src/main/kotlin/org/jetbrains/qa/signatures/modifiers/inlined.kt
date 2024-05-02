package org.jetbrains.qa.signatures.modifiers

import javax.swing.tree.TreeNode

/**
 * Here is a inline function woth non inline param
 */
inline fun noninlineIsHere(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    TODO()
}


/**
 * Inlined function with reified
 */
inline fun <reified T> TreeNode.inlinedReifiedFunction(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}


/**
 * Function with infix keyword
 */
infix fun Int.infixFunction(x: Int): Int {
    return this + x
}