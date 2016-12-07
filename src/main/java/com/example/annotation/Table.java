package com.example.annotation;

import java.lang.annotation.*;

/**
 * 表注解
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();

    //省略部分属性...
}