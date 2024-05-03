package org.jetbrains.qa.langfeatures.extensions

/**
 * Reviever without own members and only fun extensions.
 * Extensions: [BasicFunReceiver.extensionFun1] and [BasicFunReceiver.extensionFun2]
 */
class BasicFunReceiver

fun BasicFunReceiver.extensionFun1(){}
fun BasicFunReceiver.extensionFun2(){}

/**
 * Reviever without own members and only fun extensions.
 * Extensions: [BasicValReceiver.extensionVal1] and [BasicValReceiver.extensionVal2]
 */
class BasicValReceiver

val BasicValReceiver.extensionVal1: Int
    get() = 0
val BasicValReceiver.extensionVal2: String
    get() = ""


/**
 * Reciever with fun members and extension.
 * Extension: [RecieverWithFunMembers.extensionFun1()]
 * Members: [RecieverWithFunMembers.member]
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
