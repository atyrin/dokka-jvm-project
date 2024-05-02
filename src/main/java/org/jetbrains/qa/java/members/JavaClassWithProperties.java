package org.jetbrains.qa.java.members;

public class JavaClassWithProperties{
    public int publicProperty = 0;
    int defaultProperty = 0;
    private int privateProperty = 0;
    protected int protectedProperty = 0;
    private int publicGetterAndPublicSetter = 0;
    private int protectedGetterAndProtectedSetter = 0;
    private int privateGetterAndPrivateSetter = 0;
    private int publicGetterAndPrivateSetter = 0;
    private int publicGetterNoSetter = 0;
    private int noGetterPublicSetter = 0;

    private int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public JavaClassWithProperties(){}
    public JavaClassWithProperties(int i){}

    public int getPublicGetterAndPublicSetter() {
        return publicGetterAndPublicSetter;
    }

    public void setPublicGetterAndPublicSetter(int publicGetterAndPublicSetter) {
        this.publicGetterAndPublicSetter = publicGetterAndPublicSetter;
    }

    public int getPublicGetterNoSetter() {
        return publicGetterNoSetter;
    }

    public void setNoGetterPublicSetter(int noGetterPublicSetter) {
        this.noGetterPublicSetter = noGetterPublicSetter;
    }

    protected int getProtectedGetterAndProtectedSetter() {
        return protectedGetterAndProtectedSetter;
    }

    protected void setProtectedGetterAndProtectedSetter(int protectedGetterAndProtectedSetter) {
        this.protectedGetterAndProtectedSetter = protectedGetterAndProtectedSetter;
    }

    private int getPrivateGetterAndPrivateSetter() {
        return privateGetterAndPrivateSetter;
    }

    private void setPrivateGetterAndPrivateSetter(int privateGetterAndPrivateSetter) {
        this.privateGetterAndPrivateSetter = privateGetterAndPrivateSetter;
    }

    public int getPublicGetterAndPrivateSetter() {
        return publicGetterAndPrivateSetter;
    }

    private void setPublicGetterAndPrivateSetter(int publicGetterAndPrivateSetter) {
        this.publicGetterAndPrivateSetter = publicGetterAndPrivateSetter;
    }

    public int getUnexistingProperty() {
        return 0;
    }

    public void setUnexistingProperty() {

    }
}
