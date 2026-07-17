package org.jetbrains.qa.kdoc.resolve


/**
 * Class that has references between members
 *
 * @see property1 property in the same class
 * @see property2 property in the same class
 * @see propInConstructor property from constructor in the same class
 * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
 * @see sourceFunction function in the same class
 * @see NestedClass nested class in the same class
 * @see NestedClass.nestedFunction function in the nested class
 * @see InnerClass inner class in the same class
 * @see InnerClass.innerFunction function in the inner class
 */
class SelfCrossLinks(
    /**
     * @see property1 property in the same class
     * @see property2 property in the same class
     * @see propInConstructor property from constructor in the same class
     * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
     * @see sourceFunction function in the same class
     * @see NestedClass nested class in the same class
     * @see NestedClass.nestedFunction function in the nested class
     * @see InnerClass inner class in the same class
     * @see InnerClass.innerFunction function in the inner class
     */
    val propInConstructor: String,
    internal val internalPropInConstructor: String,
    /**
     * @see property1 property in the same class
     * @see property2 property in the same class
     * @see propInConstructor property from constructor in the same class
     * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
     * @see sourceFunction function in the same class
     * @see NestedClass nested class in the same class
     * @see NestedClass.nestedFunction function in the nested class
     * @see InnerClass inner class in the same class
     * @see InnerClass.innerFunction function in the inner class
     */
    paramInConstructorUnresolvedInBodyKdoc: String,
) {

    /**
     * @see property1 property in the same class (itself)
     * @see property2 property in the same class
     * @see propInConstructor property from constructor in the same class
     * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
     * @see sourceFunction function in the same class
     * @see NestedClass nested class in the same class
     * @see NestedClass.nestedFunction function in the nested class
     * @see InnerClass inner class in the same class
     * @see InnerClass.innerFunction function in the inner class
     */
    val property1: Int = 0
    val property2: Int = 0

    /**
     * @see property1 property in the same class
     * @see property2 property in the same class
     * @see propInConstructor property from constructor in the same class
     * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
     * @see sourceFunction function in the same class (itself)
     * @see NestedClass nested class in the same class
     * @see NestedClass.nestedFunction function in the nested class
     * @see InnerClass inner class in the same class
     * @see InnerClass.innerFunction function in the inner class
     */
    fun sourceFunction() {}

    /**
     * @see property1 property in the same class
     * @see property2 property in the same class
     * @see propInConstructor property from constructor in the same class
     * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
     * @see sourceFunction function in the same class
     * @see NestedClass nested class in the same class
     * @see NestedClass.nestedFunction function in the nested class
     * @see InnerClass inner class in the same class
     * @see InnerClass.innerFunction function in the inner class
     */
    class NestedClass {
        /**
         * @see property1 property in the same class
         * @see property2 property in the same class
         * @see propInConstructor property from constructor in the same class
         * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
         * @see sourceFunction function in the same class
         * @see NestedClass nested class in the same class
         * @see NestedClass.nestedFunction function in the nested class
         * @see InnerClass inner class in the same class
         * @see InnerClass.innerFunction function in the inner class
         */
        fun nestedFunction() {}
    }

    /**
     * @see property1 property in the same class
     * @see property2 property in the same class
     * @see propInConstructor property from constructor in the same class
     * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
     * @see sourceFunction function in the same class
     * @see NestedClass nested class in the same class
     * @see NestedClass.nestedFunction function in the nested class
     * @see InnerClass inner class in the same class
     * @see InnerClass.innerFunction function in the inner class
     */
    inner class InnerClass {
        /**
         * @see property1 property in the same class
         * @see property2 property in the same class
         * @see propInConstructor property from constructor in the same class
         * @see paramInConstructorUnresolvedInBodyKdoc constructor param in the same class
         * @see sourceFunction function in the same class
         * @see NestedClass nested class in the same class
         * @see NestedClass.nestedFunction function in the nested class
         * @see InnerClass inner class in the same class
         * @see InnerClass.innerFunction function in the inner class
         */
        fun innerFunction() {}
    }
}