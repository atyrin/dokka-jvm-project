package org.jetbrains.qa.java.members;

public class JClassWithSettersOnly {
    private int privatePropertyWithPublicSetter = 0;
    private int privatePropertyWithDefaultSetter = 0;
    private int privatePropertyWithProtectedSetter = 0;
    protected String protectedPropertyWithPublicSetter = "";
    protected String protectedPropertyWithDefaultSetter = "";
    int defaultPropertyWithPublicSetter = 0;

    public void setPrivatePropertyWithPublicSetter(int privatePropertyWithPublicSetter) {
        this.privatePropertyWithPublicSetter = privatePropertyWithPublicSetter;
    }

    void setPrivatePropertyWithDefaultSetter(int privatePropertyWithDefaultSetter) {
        this.privatePropertyWithDefaultSetter = privatePropertyWithDefaultSetter;
    }

    protected void setPrivatePropertyWithProtectedSetter(int privatePropertyWithProtectedSetter) {
        this.privatePropertyWithProtectedSetter = privatePropertyWithProtectedSetter;
    }

    public void setProtectedPropertyWithPublicSetter(String protectedPropertyWithPublicSetter) {
        this.protectedPropertyWithPublicSetter = protectedPropertyWithPublicSetter;
    }

    void setProtectedPropertyWithDefaultSetter(String protectedPropertyWithDefaultSetter) {
        this.protectedPropertyWithDefaultSetter = protectedPropertyWithDefaultSetter;
    }

    public void setDefaultPropertyWithPublicSetter(int defaultPropertyWithPublicSetter) {
        this.defaultPropertyWithPublicSetter = defaultPropertyWithPublicSetter;
    }
}
