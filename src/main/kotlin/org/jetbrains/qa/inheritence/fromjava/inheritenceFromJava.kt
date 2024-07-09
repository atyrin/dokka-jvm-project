package org.jetbrains.qa.inheritence.fromjava

import org.jetbrains.qa.java.members.JClassAllAccessorForPackagePrivateField
import org.jetbrains.qa.java.members.JClassAllAccessorForPrivateField
import org.jetbrains.qa.java.members.JClassAllAccessorForProtectedField
import org.jetbrains.qa.java.members.JClassAllAccessorForPublicField
import org.jetbrains.qa.java.members.JClassFieldsOnly
import org.jetbrains.qa.java.members.JClassMismatchedGetterAndSetterVisibility
import org.jetbrains.qa.java.members.JClassWithEdgeCases
import org.jetbrains.qa.java.members.JClassWithGettersOnly
import org.jetbrains.qa.java.members.JClassWithSettersOnly
import org.jetbrains.qa.java.members.JavaClassWithNested

// K2 ticket for cases where getter/setter have more narrow visibility than field
// https://github.com/Kotlin/dokka/issues/3339

final class InheritJClassAllAccessorForPackagePrivateFieldFinal : JClassAllAccessorForPackagePrivateField()
open class InheritJClassAllAccessorForPackagePrivateFieldOpen : JClassAllAccessorForPackagePrivateField()

final class InheritJClassAllAccessorForPrivateFieldFinal : JClassAllAccessorForPrivateField()
open class InheritJClassAllAccessorForPrivateFieldOpen : JClassAllAccessorForPrivateField()

final class InheritJClassAllAccessorForProtectedFieldFinal : JClassAllAccessorForProtectedField()
open class InheritJClassAllAccessorForProtectedFieldOpen : JClassAllAccessorForProtectedField()

final class InheritJClassAllAccessorForPublicFieldFinal : JClassAllAccessorForPublicField()
open class InheritJClassAllAccessorForPublicFieldOpen : JClassAllAccessorForPublicField()

final class InheritJClassFieldsOnlyFinal : JClassFieldsOnly()
open class InheritJClassFieldsOnlyOpen : JClassFieldsOnly()

final class InheritJClassWithGettersOnlyFinal : JClassWithGettersOnly()
open class InheritJClassWithGettersOnlyOpen : JClassWithGettersOnly()

final class InheritJClassWithSettersOnlyFinal : JClassWithSettersOnly()
open class InheritJClassWithSettersOnlyOpen : JClassWithSettersOnly()


final class InheritJClassMismatchedGetterAndSetterVisibilityFinal : JClassMismatchedGetterAndSetterVisibility()
open class InheritJClassMismatchedGetterAndSetterVisibilityOpen : JClassMismatchedGetterAndSetterVisibility()


open class InheritJEdgeCases : JClassWithEdgeCases() {
    protected val protectedX: Int = 0
}

/**
 * Inherit a Java class with nested class
 */
open class InheritJavaNested : JavaClassWithNested()

open class KotlinParent {
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
        set(value) {
            field = value
        }


    var varPropWithGetterAndPrivateSetter = 0
        get() = 0
        private set(value) {
            field = value
        }
}

class KotlinChild : JavaClassToInherit("str")


/**
 * Kotlin class where companion inherit Java class
 */
class KotlinCompanionChild {
    companion object : JavaClassToInherit("str") {

    }
}