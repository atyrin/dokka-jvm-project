package org.jetbrains.qa.java.members;

public class JClassWithProtectedAccessProps {
    private int protectedGetterProtectedSetter = 0;
    private int defaultGetterProtectedSetter = 0;
    private int privateGetterProtectedSetter = 0;

    protected int getProtectedGetterProtectedSetter() {
        return protectedGetterProtectedSetter;
    }

    protected void setProtectedGetterProtectedSetter(int protectedGetterProtectedSetter) {
        this.protectedGetterProtectedSetter = protectedGetterProtectedSetter;
    }

    int getDefaultGetterProtectedSetter() {
        return defaultGetterProtectedSetter;
    }

    void setDefaultGetterProtectedSetter(int defaultGetterProtectedSetter) {
        this.defaultGetterProtectedSetter = defaultGetterProtectedSetter;
    }

    private int getPrivateGetterProtectedSetter() {
        return privateGetterProtectedSetter;
    }

    private void setPrivateGetterProtectedSetter(int privateGetterProtectedSetter) {
        this.privateGetterProtectedSetter = privateGetterProtectedSetter;
    }
}
