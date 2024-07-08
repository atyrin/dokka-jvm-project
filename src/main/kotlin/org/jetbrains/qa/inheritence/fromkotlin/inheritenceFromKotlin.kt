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

/**
 * Class inherits [List] interface from kotlin stdlib
 */
class InheritList<T> : List<T> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<T> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        TODO("Not yet implemented")
    }
}