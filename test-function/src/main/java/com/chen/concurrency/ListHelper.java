package com.chen.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试使用不同的锁而导致的线程不安全
 * author: JINCHENCHEN
 * date: 2020/12/09
 */
public class ListHelper {
    List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public synchronized void addIfAbsent(Integer integer) {
        if (!list.contains(integer)) {
            list.add(integer);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ListHelper listHelper = new ListHelper();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                listHelper.addIfAbsent(i);
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (listHelper.list) {
                    if (!listHelper.list.contains(i))
                        listHelper.list.add(i);
                }
            }
        });

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println(listHelper.list.size());
    }
}
