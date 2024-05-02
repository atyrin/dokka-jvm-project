package org.jetbrains.qa.members

class ClassWithNested {

    /**
     * Class with inner modifier
     */
    inner class Inner
    class Nested
}

fun ClassWithNested.extensionFun(){}
val ClassWithNested.extensionVal: Int
    get() = 0

fun ClassWithNested.Nested.extensionNestedFun(){}
fun ClassWithNested.Inner.extensionInnerFun(){}

interface NoMembers

annotation class ExtensionFunOnly
interface ExtensionValOnly

fun ExtensionFunOnly.extension(){}

val ExtensionValOnly.extensionVal: String by lazy { "" }