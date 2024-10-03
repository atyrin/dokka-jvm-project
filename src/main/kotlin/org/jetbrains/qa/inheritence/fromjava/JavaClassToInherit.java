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
    protected Integer protectedProperty;

    public int funToOverride(){
        return 0;
    }

    /**
     * Constructor
     * @param a some string param in constructor
     */
    public JavaClassToInherit(String a){
        System.out.println(a);
    }

    public Integer getProtectedProperty() {
        return protectedProperty;
    }
}