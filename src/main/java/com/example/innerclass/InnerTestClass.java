package com.example.innerclass;

/**
 * Created by qianbw on 2017/3/7.
 */
public class InnerTestClass {
    Outer outer = new Outer();
    Outer.Inner1 inner1 = outer.new Inner1();

    public void func() {
        inner1.func();
    }

    public static void main(String[] args) {
        InnerTestClass innerTestClass = new InnerTestClass();
        innerTestClass.func();
    }
}
