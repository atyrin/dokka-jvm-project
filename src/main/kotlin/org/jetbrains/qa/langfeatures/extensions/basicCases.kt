package org.jetbrains.qa.langfeatures.extensions

/**
 * Reviever without own members and only fun extensions
 */
class BasicFunReceiver

fun BasicFunReceiver.extensionFun1(){}
fun BasicFunReceiver.extensionFun2(){}

/**
 * Reviever without own members and only fun extensions
 */
class BasicValReceiver

val BasicValReceiver.extensionVal1: Int
    get() = 0
val BasicValReceiver.extensionVal2: String
    get() = ""


/**
 * Reciever with fun members and extension
 */
class RecieverWithFunMembers{
    fun member(){}
}

fun RecieverWithFunMembers.extensionFun1(){}

/**
 * Reciever with all members and extension
 */
class RecieverWithAllMembers{
    val prop: Int = 0
    fun member(){}
}

fun RecieverWithAllMembers.extensionFun1(){}
val RecieverWithAllMembers.extensionProp1: String
    get() = ""
