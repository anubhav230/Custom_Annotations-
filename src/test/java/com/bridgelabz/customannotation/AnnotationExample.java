package com.bridgelabz.customannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) {
        try {
            for (Method method : AnnotationExample.class.getMethods()) {
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    try {
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in method"+method+":" +anno);
                        }
                        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                        if (myAnnotation.revision() == 1) {
                            System.out.println("Method with revision no 1 = "+method);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (Throwable ex) {
            ex.printStackTrace();
        }

    }
}
