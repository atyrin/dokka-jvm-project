package org.jetbrains.qa.java.members;

import java.util.List;

/**
 * All fields are public
 */
public class JClassMismatchedGetterAndSetterVisibility {
    private List<Integer> publicGetterPrivateSetter;
    private List<Integer> publicGetterProtectedSetter;
    private List<Integer> publicGetterDefaultSetter;

    private List<Integer> defaultGetterPublicSetter;
    private List<Integer> defaultGetterProtectedSetter;
    private List<Integer> defaultGetterPrivateSetter;

    private List<Integer> protectedGetterPublicSetter;
    private List<Integer> protectedGetterDefaultSetter;
    private List<Integer> protectedGetterPrivateSetter;

    private List<Integer> privateGetterPublicSetter;
    private List<Integer> privateGetterDefaultSetter;
    private List<Integer> privateGetterProtectedSetter;

    public List<Integer> getPublicGetterPrivateSetter() {
        return publicGetterPrivateSetter;
    }

    private void setPublicGetterPrivateSetter(List<Integer> publicGetterPrivateSetter) {
        this.publicGetterPrivateSetter = publicGetterPrivateSetter;
    }

    public List<Integer> getPublicGetterProtectedSetter() {
        return publicGetterProtectedSetter;
    }

    protected void setPublicGetterProtectedSetter(List<Integer> publicGetterProtectedSetter) {
        this.publicGetterProtectedSetter = publicGetterProtectedSetter;
    }

    public List<Integer> getPublicGetterDefaultSetter() {
        return publicGetterDefaultSetter;
    }

    void setPublicGetterDefaultSetter(List<Integer> publicGetterDefaultSetter) {
        this.publicGetterDefaultSetter = publicGetterDefaultSetter;
    }

    List<Integer> getDefaultGetterPublicSetter() {
        return defaultGetterPublicSetter;
    }

    public void setDefaultGetterPublicSetter(List<Integer> defaultGetterPublicSetter) {
        this.defaultGetterPublicSetter = defaultGetterPublicSetter;
    }

    List<Integer> getDefaultGetterProtectedSetter() {
        return defaultGetterProtectedSetter;
    }

    protected void setDefaultGetterProtectedSetter(List<Integer> defaultGetterProtectedSetter) {
        this.defaultGetterProtectedSetter = defaultGetterProtectedSetter;
    }

    List<Integer> getDefaultGetterPrivateSetter() {
        return defaultGetterPrivateSetter;
    }

    private void setDefaultGetterPrivateSetter(List<Integer> defaultGetterPrivateSetter) {
        this.defaultGetterPrivateSetter = defaultGetterPrivateSetter;
    }

    protected List<Integer> getProtectedGetterPublicSetter() {
        return protectedGetterPublicSetter;
    }

    public void setProtectedGetterPublicSetter(List<Integer> protectedGetterPublicSetter) {
        this.protectedGetterPublicSetter = protectedGetterPublicSetter;
    }

    protected List<Integer> getProtectedGetterDefaultSetter() {
        return protectedGetterDefaultSetter;
    }

    void setProtectedGetterDefaultSetter(List<Integer> protectedGetterDefaultSetter) {
        this.protectedGetterDefaultSetter = protectedGetterDefaultSetter;
    }

    protected List<Integer> getProtectedGetterPrivateSetter() {
        return protectedGetterPrivateSetter;
    }

    private void setProtectedGetterPrivateSetter(List<Integer> protectedGetterPrivateSetter) {
        this.protectedGetterPrivateSetter = protectedGetterPrivateSetter;
    }

    private List<Integer> getPrivateGetterPublicSetter() {
        return privateGetterPublicSetter;
    }

    public void setPrivateGetterPublicSetter(List<Integer> privateGetterPublicSetter) {
        this.privateGetterPublicSetter = privateGetterPublicSetter;
    }

    private List<Integer> getPrivateGetterDefaultSetter() {
        return privateGetterDefaultSetter;
    }

    void setPrivateGetterDefaultSetter(List<Integer> privateGetterDefaultSetter) {
        this.privateGetterDefaultSetter = privateGetterDefaultSetter;
    }

    private List<Integer> getPrivateGetterProtectedSetter() {
        return privateGetterProtectedSetter;
    }

    protected void setPrivateGetterProtectedSetter(List<Integer> privateGetterProtectedSetter) {
        this.privateGetterProtectedSetter = privateGetterProtectedSetter;
    }
}
