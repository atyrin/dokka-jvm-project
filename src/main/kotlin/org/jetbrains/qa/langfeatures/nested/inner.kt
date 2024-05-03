package org.jetbrains.qa.langfeatures.nested


/**
 * Class container for [ContainerForInner.Inner1] and [ContainerForInner.Inner2]
 */
class ContainerForInner{

    /**
     * Inner class [Inner1] in [ContainerForInner]
     */
    inner class Inner1{
        fun inner1method(){}
    }


    /**
     * Another inner class [Inner2]
     * Call [Inner1.inner1method]
     */
    inner class Inner2{
        fun inner2method(){
            Inner1().inner1method()
        }
    }

    abstract inner class Inner3AbstractClass{
        fun inner3method1(){}
        abstract fun inner3method2()
    }
    inner class Inner4: Inner3AbstractClass(){
        override fun inner3method2() {}
        fun inner3method2(i: Int) {}
    }
}