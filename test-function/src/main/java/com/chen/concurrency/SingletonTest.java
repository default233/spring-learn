package com.chen.concurrency;

/**
 * author: JINCHENCHEN
 * date: 2020/12/07
 */
public class SingletonTest {
    public static void main(String[] args) {

//        for (int i = 0; i < 1000; i++) {
//            new Thread(() -> {
//                Singleton instance = Singleton.getInstance();
//                System.out.println(Thread.currentThread().getName() + "\tinstance = " + instance);
//            }, "线程"+i).start();
//        }
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Singleton2 instance = Singleton2.getInstance();
                System.out.println(Thread.currentThread().getName() + "\tinstance = " + instance);
            }, "线程"+i).start();
        }
    }
}
