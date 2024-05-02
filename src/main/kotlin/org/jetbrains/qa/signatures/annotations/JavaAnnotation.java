package org.jetbrains.qa.signatures.annotations;

//@Retention(RetentionPolicy.RUNTIME)
public @interface JavaAnnotation
{
    String word() default "Hello";
    int value() default 0;
}

@interface JavaAnnotationWithSpace{}