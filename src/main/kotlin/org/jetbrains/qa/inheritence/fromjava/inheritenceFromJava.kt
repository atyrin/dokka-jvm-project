package org.jetbrains.qa.inheritence.fromjava

import org.jetbrains.qa.java.members.JClassWithPublicFullAccessedProps
import org.jetbrains.qa.java.members.JClassWithPublicReadOnlyProps
import org.jetbrains.qa.java.members.JavaClassWithNested
import org.jetbrains.qa.java.members.JavaClassWithProperties

/**
 * Open class inherited from a Java class [JClassWithPublicFullAccessedProps]
 * All props there have a setter.
 */
open class OpenInheritJClassWithPublicFullAccessedProps: JClassWithPublicFullAccessedProps(){

}

/**
 * Final class inherited from a Java class [JClassWithPublicFullAccessedProps]
 * All props there have a setter.
 */
class FinalInheritJClassWithPublicFullAccessedProps: JClassWithPublicFullAccessedProps()
open class InheritJClassWithPublicReadOnlyProps: JClassWithPublicReadOnlyProps()



open class InheritJavaProperties: JavaClassWithProperties(){
    protected val protectedX: Int = 0
}

/**
 * Inherit a Java class with nested class
 */
open class InheritJavaNested: JavaClassWithNested(){
}


@Suppress
fun use(){
    InheritJavaProperties().publicGetterAndPublicSetter = 0
    val str = InheritJavaProperties().publicGetterAndPublicSetterString
    val str2 = JavaClassWithProperties().publicGetterAndPublicSetterString

    if(str != null){
        print("")
    }



    OpenInheritJClassWithPublicFullAccessedProps().publicPropertyWithNoGetterNoSetter = 0
    OpenInheritJClassWithPublicFullAccessedProps().publicPropertyWithProtectedGetterProtectedSetter = 0
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