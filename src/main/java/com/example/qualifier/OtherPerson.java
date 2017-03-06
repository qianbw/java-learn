package com.example.qualifier;

/**
 * Created by qianbw on 2017/3/6.
 */
public class OtherPerson {
    private Person person = new Person();

    public void print() {
        // 同package无法获取到privateVal
        String info = person.deafultVal + person.protectedVal + person.publicVal;
        System.out.println(info);
    }
}
