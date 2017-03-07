package com.example.extendclass;

/**
 * Created by qianbw on 2017/3/7.
 */
public class InterfaceImpl implements SonInterface {
    @Override
    public void fatherFunc() {
        System.out.println("fatherFunc");
    }

    @Override
    public void sonFunc() {
        System.out.println("sonFunc");
    }

    public static void main(String[] args) {
        InterfaceImpl sonInterface = new InterfaceImpl();
        sonInterface.fatherFunc();
        sonInterface.sonFunc();
    }
}
