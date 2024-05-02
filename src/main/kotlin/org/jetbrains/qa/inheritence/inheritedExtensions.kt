package org.jetbrains.qa.inheritence

open class ExtensionParentRoot
open class ExtensionParentFirst: ExtensionParentRoot()
class ExtensionParentSecond: ExtensionParentFirst()

/**
 * Extension function for [ExtensionParentRoot]
 */
fun ExtensionParentRoot.extensionFun(){

}

/**
 * Extension function for [JavaClassToInherit]
 */
fun JavaClassToInherit.extensionForJavaClass(){}