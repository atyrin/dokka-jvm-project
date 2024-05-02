package org.jetbrains.qa.java.members;

public class JClassWithPublicFullAccessedProps {
    public int publicPropertyWithNoGetterNoSetter = 0;
    public int publicPropertyWithProtectedGetterProtectedSetter = 0;
    private int privatePropertyWithPublicGetterPublicSetter = 0;
    protected int protectedPropertyWithPublicGetterPublicSetter = 0;
    int defaulsPropertyWithPublicGetterPublicSetter = 0;

    public int getPrivatePropertyWithPublicGetterPublicSetter() {
        return privatePropertyWithPublicGetterPublicSetter;
    }

    public void setPrivatePropertyWithPublicGetterPublicSetter(int privatePropertyWithPublicGetterPublicSetter) {
        this.privatePropertyWithPublicGetterPublicSetter = privatePropertyWithPublicGetterPublicSetter;
    }

    public int getProtectedPropertyWithPublicGetterPublicSetter() {
        return protectedPropertyWithPublicGetterPublicSetter;
    }

    public void setProtectedPropertyWithPublicGetterPublicSetter(int protectedPropertyWithPublicGetterPublicSetter) {
        this.protectedPropertyWithPublicGetterPublicSetter = protectedPropertyWithPublicGetterPublicSetter;
    }

    public int getDefaulsPropertyWithPublicGetterPublicSetter() {
        return defaulsPropertyWithPublicGetterPublicSetter;
    }

    public void setDefaulsPropertyWithPublicGetterPublicSetter(int defaulsPropertyWithPublicGetterPublicSetter) {
        this.defaulsPropertyWithPublicGetterPublicSetter = defaulsPropertyWithPublicGetterPublicSetter;
    }

    protected int getPublicPropertyWithProtectedGetterProtectedSetter() {
        return publicPropertyWithProtectedGetterProtectedSetter;
    }

    protected void setPublicPropertyWithProtectedGetterProtectedSetter(int publicPropertyWithProtectedGetterProtectedSetter) {
        this.publicPropertyWithProtectedGetterProtectedSetter = publicPropertyWithProtectedGetterProtectedSetter;
    }
}
