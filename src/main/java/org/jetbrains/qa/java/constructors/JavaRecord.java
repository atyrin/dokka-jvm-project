package org.jetbrains.qa.java.constructors;

public record JavaRecord(String recordProp1) {
    public JavaRecord(String x, String y){
        this(x);
    }
}
