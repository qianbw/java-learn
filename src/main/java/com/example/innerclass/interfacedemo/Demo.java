package com.example.innerclass.interfacedemo;

/**
 * Created by qianbw on 2017/3/8.
 */
public class Demo {
    public static void main(String[] args) {
        Person p = new Person() {

            @Override
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}
