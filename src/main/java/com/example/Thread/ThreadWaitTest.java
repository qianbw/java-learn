package com.example.Thread;

/**
 * Created by qianbw on 2017/3/8.
 * wait是Object类的方法，对此对象调用wait方法导致本线程放弃对象锁，进入等待此对象的等待锁定池，
 * 只有针对此对象发出notify方法（或notifyAll）后本线程才进入对象锁定池准备获得对象锁进入运行状态。
 */
public class ThreadWaitTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        new Thread(new Thread1()).start();

        new Thread(new Thread2()).start();
    }


    private static class Thread1 implements Runnable {

        @Override
        public void run() {
            // 由于这里的Thread1和下面的Thread2内部run方法要用同一对象作为监视器，我们这里不能用this，
            // 因为在Thread2里面的this和这个Thread1的this不是同一个对象。我们用MultiThread.class这个字节码对象，当前虚拟机里引用这个变量时，指向的都是同一个对象。
            synchronized (ThreadWaitTest.class) {
                System.out.println("enter thread1...");
                System.out.println("thread1 is waiting");

                try {
                    // 释放锁有两种方式，第一种方式是程序自然离开监视器的范围，也就是离开了synchronized关键字管辖的代码范围，
                    // 另一种方式就是在synchronized关键字管辖的代码内部调用监视器对象的wait方法。这里，使用wait方法释放锁。
                    ThreadWaitTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread1 is going on...");
                System.out.println("thread1 is being over!");
            }
        }

    }

    private static class Thread2 implements Runnable {

        @Override
        public void run() {
            synchronized (ThreadWaitTest.class) {
                System.out.println("enter thread2...");
                System.out.println("thread2 notify other thread can release wait status..");

                // 由于notify方法并不释放锁， 即使thread2调用下面的sleep方法休息了10毫秒，但thread1仍然不会执行，因为thread2没有释放锁，所以Thread1无法得不到锁。
                ThreadWaitTest.class.notify();

                System.out.println("thread2 is sleeping ten millisecond...");
                try {
                    //sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，
                    //但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
                    //在调用sleep()方法的过程中，线程不会释放对象锁。
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread2 is going on...");
                System.out.println("thread2 is being over!");
            }
        }
    }
}
