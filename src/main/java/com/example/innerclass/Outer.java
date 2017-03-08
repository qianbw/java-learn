package com.example.innerclass;

/**
 * Created by qianbw on 2017/3/7.
 */
public class Outer {
    int out_x = 0;

    public void method() {
        Inner1 inner1 = new Inner1();

        class Inner2   //在方法体内部定义的内部类, 前面不能有public等修饰符。其类似于一个内部等变量
        {
            public void method() {
                out_x = 3;
            }
        }
        Inner2 inner2 = new Inner2();
    }

    public class Inner1   //在方法体外面定义的内部类
    {
        public void func() {
            System.out.println("Inner1.func......");
        }
    }

    public void start() {
        // 匿名内部类
        new Thread(
                new Runnable() {
                    public void run() {
                    }
                }
        ).start();
    }
}

