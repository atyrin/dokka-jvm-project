package org.jetbrains.qa.inheritence.fromkotlin

open class KotlinClassWithProperties {
    public var publicVarProperty = 0
    var defaultVarProperty = 0
    private val privateVarProperty = 0
    protected var protectedVarProperty = 0

    /**
     * On java side it can be rendered as or have a separate accessor: a call with $ in the name
     */
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