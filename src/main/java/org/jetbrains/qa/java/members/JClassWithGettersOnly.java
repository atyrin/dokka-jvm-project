package org.jetbrains.qa.java.members;

/**
 * No setters in the class
 */
public class JClassWithGettersOnly {
    private int privatePropertyWithPublicGetter = 0;
    private int privatePropertyWithDefaultGetter = 0;
    private int privatePropertyWithProtectedGetter = 0;
    protected String protectedPropertyWithPublicGetter = "";
    protected String protectedPropertyWithDefaultGetter = "";
    int defaultPropertyWithPublicGetter = 0;

    public int getPrivatePropertyWithPublicGetter() {
        return privatePropertyWithPublicGetter;
    }

    int getPrivatePropertyWithDefaultGetter() {
        return privatePropertyWithDefaultGetter;
    }

    protected int getPrivatePropertyWithProtectedGetter() {
        return privatePropertyWithProtectedGetter;
    }


    public String getProtectedPropertyWithPublicGetter() {
        return protectedPropertyWithPublicGetter;
    }

    String getProtectedPropertyWithDefaultGetter() {
        return protectedPropertyWithDefaultGetter;
    }

    public int getDefaultPropertyWithPublicGetter() {
        return defaultPropertyWithPublicGetter;
    }
}
