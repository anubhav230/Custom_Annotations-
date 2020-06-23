package com.bridgelabz.customannotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String author() default "Anubhav";
    String date() default "23-06-2020";
    int revision() default 1;
    String comments();
}
