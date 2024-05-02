package org.jetbrains.qa.signatures.deprecation;


/**
 * Deprecated Java Class
 */
@Deprecated(since = "1.7.20", forRemoval = false)
public class DeprecatedJClass {
    @Deprecated(since = "1.7.21", forRemoval = false)
    public String property;

    @Deprecated(since = "1.7.22", forRemoval = true)
    public static void main(String[] args) {

    }

    /**
     * Don't do anything
     * @deprecated
     * This method is no longer acceptable to compute time between versions.
     * <p> Use {@link DeprecatedJClass#getStringMethodNew()} instead.
     */
    @Deprecated(since = "18.0.2", forRemoval = true)
    public void getStringMethod(){}
    public void getStringMethodNew(){}
}
