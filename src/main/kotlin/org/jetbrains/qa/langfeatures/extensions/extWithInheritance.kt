package org.jetbrains.qa.langfeatures.extensions

interface ParentWithExtension

/**
 * extension for parent class [ParentWithExtension]
 */
fun ParentWithExtension.parentExtensionFun() = "ext"


/**
 * On the page should be available extension for child class [ChildWithExtension] and for parent class [ParentWithExtension]
 *
 * [parentExtensionFun] -- parent
 *
 * [childExtensionFun] -- child
 */
class ChildWithExtension : ParentWithExtension


/**
 * extension for child class [ChildWithExtension]
 */
fun ChildWithExtension.childExtensionFun() = "ext"


/**
 * @suppress
 */
private fun use(){
    ChildWithExtension().parentExtensionFun()
}