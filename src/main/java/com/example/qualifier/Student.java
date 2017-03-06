package com.example.qualifier;

/**
 * Created by qianbw on 2017/3/6.
 */
public class Student extends Person {
    public void print() {
        // 子类无法获取到privateVal
        String info = this.deafultVal + this.protectedVal + this.publicVal;
        System.out.println(info);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.print();
    }
}
