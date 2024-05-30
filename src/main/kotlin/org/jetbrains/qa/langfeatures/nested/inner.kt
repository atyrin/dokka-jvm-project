package org.jetbrains.qa.langfeatures.nested


/**
 * Class container for [ContainerForInner.Inner1] and [ContainerForInner.Inner2]
 */
class ContainerForInner {

    /**
     * Inner class [Inner1] in [ContainerForInner]
     */
    inner class Inner1 {
        fun inner1method() {}
    }


    /**
     * Another inner class [Inner2]
     * Call [Inner1.inner1method]
     */
    inner class Inner2 {
        fun inner2method() {
            Inner1().inner1method()
        }
    }

    /**
     * Abstract inner class. Contains two methods: [inner3method1] and [inner3method2]
     */
    abstract inner class Inner3AbstractClass {
        fun inner3method1() {}
        abstract fun inner3method2()
    }

    inner class Inner4 : Inner3AbstractClass() {
        override fun inner3method2() {}

        /**
         * Function for overload of [inner3method2]
         */
        fun inner3method2(i: Int) {}
    }
}


/**
 * Function with references for class [ContainerForInner]
 * @see ContainerForInner main container class
 * @see ContainerForInner.Inner1 first inner class with method [ContainerForInner.Inner1.inner1method]
 * @see ContainerForInner.Inner2 second inner class with method [ContainerForInner.Inner2.inner2method]
 * @see ContainerForInner.Inner3AbstractClass third (abstract) inner class with [ContainerForInner.Inner3AbstractClass.inner3method1] and [ContainerForInner.Inner3AbstractClass.inner3method2]
 * @see ContainerForInner.Inner4 fourth inner class with [ContainerForInner.Inner4.inner3method1] and [ContainerForInner.Inner4.inner3method2]
 */
fun innerReferences() {}