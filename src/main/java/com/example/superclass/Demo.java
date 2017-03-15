package com.example.superclass;

/**
 * Created by qianbw on 2017/3/8.
 */

import java.util.Date;

public class Demo extends Date {
    public static void main(String[] args) {
        new Demo().test();
    }

    public void test() {
        // com.example.superclass.Demo
        System.out.println(super.getClass().getName());
        System.out.println(super.getClass().getName());

        // java.util.Date
        System.out.println(getClass().getSuperclass().getName());
    }
}

