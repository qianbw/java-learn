package com.example.innerclass.thread;

/**
 * Created by qianbw on 2017/3/8.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        t.start();
    }
}