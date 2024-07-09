package org.jetbrains.qa.inheritence.multiple

open class ParentClass {
    fun basicMethod() = "OK"
    override fun toString(): String {
        return super.toString()
    }
}

interface ParentInterface1 {}
interface ParentInterface2 {
    fun foo(): String
}

/**
 * In K2 misses the [toString] method: https://github.com/Kotlin/dokka/issues/3686
 */
class ChildWithTwoParent : ParentClass(), ParentInterface1

class ChildWithTwoParentIfaces : ParentInterface1, ParentInterface2 {
    override fun foo() = "OK"
}