package com.example.qualifier;

/**
 * Created by qianbw on 2017/3/6.
 */
public class Person {
    // 默认是frendly访问权限，同package，自己，可以访问
    String deafultVal;

    // 只有自己可以访问
    private String privateVal;

    // 同package，自己，子类，其他package都可以访问
    public String publicVal;

    // 同package，自己，子类可以访问
    protected String protectedVal;

    public Person() {
        this.deafultVal = "a";
        this.privateVal = "b";
        this.publicVal = "c";
        this.protectedVal = "d";
    }
}
