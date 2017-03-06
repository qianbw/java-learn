package com.example.qualifier1;

import com.example.qualifier.Person;

/**
 * Created by qianbw on 2017/3/6.
 */
public class Student extends Person {
    public void print() {
        // 子类无法获取到privateVal和deafultVal
        String info = this.protectedVal + this.publicVal;
        System.out.println(info);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.print();
    }
}
