package com.example.lock;

/**
 * Created by qianbw on 2017/3/8.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private int j;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockTest tt = new LockTest();
        for (int i = 0; i < 2; i++) {
            new Thread(tt.new Adder()).start();
            new Thread(tt.new Subtractor()).start();
            new Thread(tt.new tt()).start();
        }
    }

    private class Subtractor implements Runnable {
        @Override
        public void run() {
            while (true) {
                /*synchronized (ThreadTest.this) {
                    System.out.println("j--=" + j--);
					//这里抛异常了，锁能释放吗？
				}*/
                lock.lock();
                try {
                    System.out.println("j--=" + j--);
                } finally {
                    lock.unlock();
                }
            }
        }

    }

    private class tt implements Runnable {
        @Override
        public void run() {
            while (true) {
                boolean hasLock = lock.tryLock();
                if (hasLock) {
                    try {
                        System.out.println("get lock");
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("not get lock");
                }
            }
        }

    }

    private class Adder implements Runnable {
        @Override
        public void run() {
            while (true) {
                /*synchronized (ThreadTest.this) {
                System.out.println("j++=" + j++);
				}*/
                lock.lock();
                try {
                    System.out.println("j++=" + j++);
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}

