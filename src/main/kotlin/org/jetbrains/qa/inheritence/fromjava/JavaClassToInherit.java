package org.jetbrains.qa.inheritence.fromjava;

/**
 * Root package Java class
 * @see Integer
 * @see String
 */
public class JavaClassToInherit {
    /**
     * Property with public
     */
    public Integer publicProperty;

    /**
     * Constructor
     * @param a some string param in constructor
     */
    public JavaClassToInherit(String a){
        System.out.println(a);
    }
}