package org.jetbrains.qa.java.members;

public class JavaClassWithNested {
    private Integer x;

    public class Inner{
        void y(){
            System.out.println(x);
        }
    }

    public static class Nested{}
    private static class PrivateNested{}
}
