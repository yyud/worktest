package com.issc;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationsTest{
    String author() default "yydu";
    String name() default "yyud";
    int age() default 20;
}
