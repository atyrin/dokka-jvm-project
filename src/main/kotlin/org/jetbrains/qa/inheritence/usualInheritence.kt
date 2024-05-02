package org.jetbrains.qa.inheritence

/**
 * KotlinParentDescr
 */
open class KotlinSuperclass{

    /**
     * Parent Method descr
     */
    fun toOverride(){}
}

class KotlinSubclass: KotlinSuperclass() {}

/**
 * Issue with new line
 * https://github.com/Kotlin/dokka/issues/3090
 */
class KotlinSubclassWithNameLongEnough: KotlinSuperclass() {}
class KotlinSubclassWithNameLongEnoughButAnother: KotlinSuperclass() {}