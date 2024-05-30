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

        /**
         * Overload function
         */
        fun Nested3method2(i: Int) {}
    }

    interface Nested5Interface

    /**
     * Nested object [Nested6Object] in [ContainerForNested]
     */
    object Nested6Object
}

/**
 * Function with references to class [ContainerForNested]
 * @see ContainerForNested main container class
 * @see ContainerForNested.Nested1 first nested class with method [ContainerForNested.Nested1.Nested1method]
 * @see ContainerForNested.Nested2 second nested class with method [ContainerForNested.Nested2.Nested2method]
 * @see ContainerForNested.Nested3AbstractClass third (abstract) nested class with [ContainerForNested.Nested3AbstractClass.Nested3method1] and [ContainerForNested.Nested3AbstractClass.Nested3method2]
 * @see ContainerForNested.Nested4 fourth nested class with [ContainerForNested.Nested4.Nested3method1] and [ContainerForNested.Nested4.Nested3method2]
 * @see ContainerForNested.Nested5Interface nested interface
 * @see ContainerForNested.Nested6Object nested object
 */
fun nestedReferences() {}