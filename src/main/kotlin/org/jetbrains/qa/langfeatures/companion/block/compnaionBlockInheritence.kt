package org.jetbrains.qa.langfeatures.companion.block

/**
 * Companion block properties are unresolved https://github.com/Kotlin/dokka/issues/4555
 */
interface ParentInterfaceWithCompanionBlock{
    companion {
        const val interfaceCompanionProperty = ""
        fun interfaceCompanionFunction() {}
    }
}


/**
 * Parent class with companion block
 *
 * [interfaceCompanionProperty]
 */
open class ParentWithCompanionBlock: ParentInterfaceWithCompanionBlock {
    companion {
        val parentCompanionProperty = ""
        fun parentCompanionFunction() {}
    }
}

/**
 * Child class with companion block
 * [childValue] is a property
 *
 * [parentCompanionProperty] - prop from parent
 *
 * [ParentWithCompanionBlock.parentCompanionProperty] - prop from parent with fqn
 *
 * [parentCompanionFunction] - fun from parent
 *
 * [ParentWithCompanionBlock.parentCompanionFunction] - fun from parent with fqn
 *
 * [interfaceCompanionProperty] - prop from interface
 *
 * [ParentInterfaceWithCompanionBlock.interfaceCompanionProperty] - prop from interface
 *
 * [interfaceCompanionFunction] - fun from interface
 *
 * [ParentInterfaceWithCompanionBlock.interfaceCompanionFunction] - fun from interface
 */
class ChildWithCompanionBlock : ParentWithCompanionBlock() {
    companion {
        val childValue = "child"
    }
}


/**
 * @suppress
 */
private fun use() {
    ChildWithCompanionBlock.childValue
    ParentInterfaceWithCompanionBlock.interfaceCompanionProperty
//    ChildWithCompanionBlock.parentCompnaionProperty
}
