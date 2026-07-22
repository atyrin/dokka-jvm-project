package org.jetbrains.qa.langfeatures.companion.extension.inheritance

interface ParentInterfaceCompanionExtContainer

/**
 * Companion extension for interface
 */
companion val ParentInterfaceCompanionExtContainer.interfaceCompanionExtProperty = ""
const companion val ParentInterfaceCompanionExtContainer.interfaceCompanionExtConstant = ""
companion fun ParentInterfaceCompanionExtContainer.interfaceCompanionExtFunction() = ""

open class ParentClassCompanionExtContainer: ParentInterfaceCompanionExtContainer

companion val ParentClassCompanionExtContainer.parentClassCompanionExtProperty = ""
const companion val ParentClassCompanionExtContainer.parentClassCompanionExtConstant = ""
companion fun ParentClassCompanionExtContainer.parentClassCompanionExtFunction() = ""

class ChildClassCompanionExtContainer: ParentClassCompanionExtContainer()


/**
 * [parentClassCompanionExtProperty] - extension property from parent class
 *
 * [interfaceCompanionExtProperty] - extension property from interface
 *
 * [interfaceCompanionExtConstant] - extension constant from interface
 */
companion val ChildClassCompanionExtContainer.childClassCompanionExtProperty = ""
const companion val ChildClassCompanionExtContainer.childClassCompanionExtConstant = ""
companion fun ChildClassCompanionExtContainer.childClassCompanionExtFunction() = ""


/**
 * @suppress
 */
private fun useExt(){
    ChildClassCompanionExtContainer.childClassCompanionExtProperty
//    ChildClassCompanionExtContainer.interfaceCompanionExtConstant
}