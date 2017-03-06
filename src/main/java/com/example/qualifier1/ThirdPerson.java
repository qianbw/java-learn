package com.example.qualifier1;

import com.example.qualifier.Person;

/**
 * Created by qianbw on 2017/3/6.
 */
public class ThirdPerson {
    private Person person = new Person();

    public void print() {
        // 非同一package只能访问publicVal
        String info = person.publicVal;
        System.out.println(info);
    }
}
