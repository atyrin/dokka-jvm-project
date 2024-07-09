package org.jetbrains.qa.java.members;

public class JClassWithEdgeCases {

    /**
     * The backing field doesn't exist. It id getters javadoc
     */
    public int getNonExistingProperty() {
        return 0;
    }

    /**
     * The backing field doesn't exist. It id setters javadoc
     */
    public void setNonExistingProperty() {
    }
}
