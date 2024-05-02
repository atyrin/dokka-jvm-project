package org.jetbrains.qa.java.members;

public class JClassWithSetters {
    public int publicProperty = 0;
    private int privateProperty = 0;
    protected int protectedProperty = 0;
    int defaulsProperty = 0;

    public void setPublicProperty(int publicProperty) {
        this.publicProperty = publicProperty;
    }

    public void setPrivateProperty(int privateProperty) {
        this.privateProperty = privateProperty;
    }

    public void setProtectedProperty(int protectedProperty) {
        this.protectedProperty = protectedProperty;
    }

    public void setDefaulsProperty(int defaulsProperty) {
        this.defaulsProperty = defaulsProperty;
    }
}
