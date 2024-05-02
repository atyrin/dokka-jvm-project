package org.jetbrains.qa.langfeatures.extensions

interface RecieverWithNestedExtension{
    val memberProp: String
    fun memberFun()

    fun String.externalExtensionToStdLib()

    fun RecieverWithNestedExtension.extensionForParent()
}

class RecieverWithNestedExtensionInCompanion{
    val memberProp: String = ""
    fun memberFun(){}

    /**
     * Expectedly not shown on companion page in extension tab
     */
    fun Companion.extensionForCompanionInParent(){}

    companion object{
        val companionMemberProp: Int = 0
        fun RecieverWithNestedExtensionInCompanion.extensionForParentInCompanion(){}

        fun String.externalExtensionToStdLibInCompanion(){
        }
    }
}

fun RecieverWithNestedExtensionInCompanion.Companion.extensionForCompanionInOuterScope(){}

class RecieverWithNestedExtensionInNamedCompanion{
    val memberProp: String = ""
    fun memberFun(){}

    /**
     * Expectedly not shown on Named companion page in extension tab
     */
    fun NamedCompanion.extensionForNamedCompanionInParent(){}

    companion object NamedCompanion {
        val NamedCompanionMemberProp: Int = 0
        fun RecieverWithNestedExtensionInNamedCompanion.extensionForParentInNamedCompanion(){}

        fun String.externalExtensionToStdLibInNamedCompanion(){
        }
    }
}

fun RecieverWithNestedExtensionInNamedCompanion.NamedCompanion.extensionForNamedCompanionInOuterScope(){}

class RecieverWithNestedExtensionInNesterClass{
    val memberProp: String = ""
    fun memberFun(){}

    /**
     * Expectedly not shown on [NestedClass] page in extension tab
     */
    fun NestedClass.extensionForNestedClassInParent(){}

    class NestedClass{
        fun RecieverWithNestedExtensionInNesterClass.extensionForParentInNestedClass(){}
        fun NestedClass.extensionForNestedClassInNestedClass(){}

        fun String.externalExtensionToStdLibInNestedClass(){}
    }
}

fun RecieverWithNestedExtensionInNesterClass.NestedClass.extensionForNestedClassInOuterScope(){}



class RecieverWithNestedExtensionInInnerClass{
    val memberProp: String = ""
    fun memberFun(){}

    /**
     * Expectedly not shown on [InnerClass] page in extension tab
     */
    fun InnerClass.extensionForInnerClassInParent(){
        extensionForParentInInnerClass()
        "".externalExtensionToStdLibInInnerClass()
    }

    inner class InnerClass{
        fun RecieverWithNestedExtensionInInnerClass.extensionForParentInInnerClass(){}
        fun InnerClass.extensionForInnerClassInInnerClass(){}

        fun String.externalExtensionToStdLibInInnerClass(){}
    }
}

fun RecieverWithNestedExtensionInInnerClass.InnerClass.extensionForInnerClassInOuterScope(){}


class RecieverWithNestedExtensionInObject{
    val memberProp: String = ""
    fun memberFun(){}

    /**
     * Expectedly not shown on Nested object page in extension tab
     */
    fun NestedObject.extensionForNestedObjectInParent(){}

    object NestedObject{
        val companionMemberProp: Int = 0
        fun RecieverWithNestedExtensionInObject.extensionForParentInNestedObject(){}

        fun String.externalExtensionToStdLibInNestedObject(){
        }
    }
}

fun RecieverWithNestedExtensionInObject.NestedObject.extensionForCompanionInOuterScope(){}


/**
 * All extensions are visible only on [ExtensionContainer] page. Not on the reciever pages.
 */
interface ExtensionContainer{
    fun RecieverWithNestedExtensionInCompanion.extensionFunInContainer()
    fun RecieverWithNestedExtensionInCompanion.Companion.extensionFunInContainer()
    val RecieverWithNestedExtensionInCompanion.Companion.extensionValInContainer: Int
    val RecieverWithNestedExtensionInNesterClass.NestedClass.extensionValInContainer: Int
    val RecieverWithNestedExtensionInInnerClass.InnerClass.extensionValInContainer: Int
}