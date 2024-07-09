package org.jetbrains.qa.java.members;

public class JClassAllAccessorForPrivateField {
    private int publicGetterSetter = 0;
    private int protectedGetterSetter = 0;
    private int defaultGetterSetter = 0;
    private int privateGetterSetter = 0;

    public int getPublicGetterSetter() {
        return publicGetterSetter;
    }

    public void setPublicGetterSetter(int publicGetterSetter) {
        this.publicGetterSetter = publicGetterSetter;
    }

    protected int getProtectedGetterSetter() {
        return protectedGetterSetter;
    }

    protected void setProtectedGetterSetter(int protectedGetterSetter) {
        this.protectedGetterSetter = protectedGetterSetter;
    }

    int getDefaultGetterSetter() {
        return defaultGetterSetter;
    }

    void setDefaultGetterSetter(int defaultGetterSetter) {
        this.defaultGetterSetter = defaultGetterSetter;
    }

    private int getPrivateGetterSetter() {
        return privateGetterSetter;
    }

    private void setPrivateGetterSetter(int privateGetterSetter) {
        this.privateGetterSetter = privateGetterSetter;
    }
}
