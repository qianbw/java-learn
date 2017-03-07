package com.example.extendclass;

/**
 * Created by qianbw on 2017/3/7.
 * 接口可继承接口
 * 抽象类可实现(implements)接口
 * 抽象类可继承具体类
 * 抽象类中可以有静态的main方法
 */
public abstract class AbastractSon extends ConcreteClass implements FatherInterface {

    public static void main(String[] args) {
        System.out.println("11111");
    }
}
