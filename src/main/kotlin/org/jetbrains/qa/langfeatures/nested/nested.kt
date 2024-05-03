package org.jetbrains.qa.langfeatures.nested


/**
 * Class container for [ContainerForNested.Nested1] and [ContainerForNested.Nested2]
 */
class ContainerForNested{

    /**
     * Nested class [Nested1] in [ContainerForNested]
     */
    class Nested1{
        fun Nested1method(){}
    }


    /**
     * Another Nested class [Nested2]
     * Call [Nested1.Nested1method]
     */
    class Nested2{
        fun Nested2method(){
            Nested1().Nested1method()
        }
    }

    abstract class Nested3AbstractClass{
        fun Nested3method1(){}
        abstract fun Nested3method2()
    }
    class Nested4: Nested3AbstractClass(){
        override fun Nested3method2() {}
        fun Nested3method2(i: Int) {}
    }

    interface Nested5Interface

    /**
     * nested object [Nested6Object] in [ContainerForNested]
     */
    object Nested6Object
}