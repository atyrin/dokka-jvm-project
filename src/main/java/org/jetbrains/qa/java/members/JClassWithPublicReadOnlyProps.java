package org.jetbrains.qa.java.members;

public class JClassWithPublicReadOnlyProps {
    private int privatePropertyWithPublicGetterPublicSetter = 0;
    protected int protectedPropertyWithPublicGetterPublicSetter = 0;
    int defaulsPropertyWithPublicGetterPublicSetter = 0;

    public int getPrivatePropertyWithPublicGetterPublicSetter() {
        return privatePropertyWithPublicGetterPublicSetter;
    }

    public int getProtectedPropertyWithPublicGetterPublicSetter() {
        return protectedPropertyWithPublicGetterPublicSetter;
    }

    public int getDefaulsPropertyWithPublicGetterPublicSetter() {
        return defaulsPropertyWithPublicGetterPublicSetter;
    }
}
