package com.example.annotation;

import java.lang.annotation.*;

/**
 * 列注解
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value();

    //省略部分属性...
}
