package org.jetbrains.qa.inheritence.overrideInTheMiddle


interface TopLevelInterface {
    fun toOverrideFromInterface()
}

/**
 * KotlinParentDescr
 */
open class TopLevelClass {

    /**
     * Parent Method ([toOverrideInMiddle]) description ([TopLevelClass])
     */
    open fun toOverrideInMiddle() {}

    /**
     * Parent Method ([toOverrideInMiddleAndBottom]) description ([TopLevelClass])
     */
    open fun toOverrideInMiddleAndBottom() {}

    /**
     * Parent Method ([toOverrideInBottom]) description ([TopLevelClass])
     */
    open fun toOverrideInBottom() {}

    /**
     * Parent Method ([toNotOverride]) description ([TopLevelClass])
     */
    open fun toNotOverride() {}
}

open class MiddleSubclass : TopLevelClass(), TopLevelInterface {

    /**
     * The method in the middle [MiddleSubclass]
     */
    override fun toOverrideInMiddle() {
        println("I'm MiddleSubclass")
    }

    /**
     * The method in the middle [MiddleSubclass]
     */
    override fun toOverrideInMiddleAndBottom() {
        println("I'm MiddleSubclass")
    }

    /**
     * Override method from Interface [TopLevelInterface]
     */
    override fun toOverrideFromInterface() {
        TODO("Not yet implemented")
    }
}

class BottomClass : MiddleSubclass(), TopLevelInterface {

    /**
     * Override in Bottom [BottomClass]
     */
    override fun toOverrideInBottom() {
        println("I'm BottomClass")
    }

    /**
     * The method in the bottom [BottomClass]
     */
    override fun toOverrideInMiddleAndBottom() {
        println("I'm BottomClass")
    }
}
