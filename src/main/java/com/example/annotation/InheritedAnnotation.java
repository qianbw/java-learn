package com.example.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 会被继承的注解
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedAnnotation {
}
