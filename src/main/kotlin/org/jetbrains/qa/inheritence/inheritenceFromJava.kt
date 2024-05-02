package org.jetbrains.qa.inheritence

import org.jetbrains.qa.java.members.JClassWithPublicFullAccessedProps
import org.jetbrains.qa.java.members.JClassWithPublicReadOnlyProps
import org.jetbrains.qa.java.members.JavaClassWithProperties


open class InheritJClassWithPublicFullAccessedProps: JClassWithPublicFullAccessedProps()
open class InheritJClassWithPublicReadOnlyProps: JClassWithPublicReadOnlyProps()

open class InheritJavaProperties: JavaClassWithProperties(){
    protected val protectedX: Int = 0
}


@Suppress
fun use(){
    InheritJavaProperties().a = 0


    InheritJClassWithPublicFullAccessedProps().publicPropertyWithNoGetterNoSetter = 0
    InheritJClassWithPublicFullAccessedProps().publicPropertyWithProtectedGetterProtectedSetter = 0
}

open class KotlinParent{
    public var publicVarProperty = 0
    var defaultVarProperty = 0
    private val privateVarProperty = 0
    protected var protectedVarProperty = 0
    internal var internalVarProperty = 0

    val valProp = 0
    val valPropWithGetter
        get() = 0

    var varPropWithGetterAndSetter: Int = 0
        get() = 0
        set(value) {field = value}


    var varPropWithGetterAndPrivateSetter = 0
        get() = 0
        private set(value) {field = value}
}

class KotlinChild: JavaClassToInherit("str")


/**
 * Kotlin class where companion inherit Java class
 */
class KotlinCompanionChild{
    companion object: JavaClassToInherit("str"){

    }
}