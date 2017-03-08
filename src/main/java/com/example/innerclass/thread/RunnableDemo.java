package com.example.innerclass.thread;

/**
 * Created by qianbw on 2017/3/8.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}