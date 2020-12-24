package com.chen.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * author: JINCHENCHEN
 * date: 2020/12/15
 */
public class ConcurrentListTest {
    private static List<String> list = new ArrayList<>();
    private static Vector<String> vector = new Vector<>();
    private static CopyOnWriteArrayList<String> cowaList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        cowaListTest();
    }

    public static void arrayListTest() {
        list.add("123");
        list.add("456");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
//            list.add("456");
            iter.next();
        }
    }

    public static void cowaListTest() {
        cowaList.add("123");
        cowaList.add("456");

        Iterator<String> iter = cowaList.iterator();
        int i = 0;
        while (iter.hasNext()) {
            cowaList.add("456");
            i++;
            iter.next();
        }
        System.out.println(i + "  " + cowaList.size());
    }

    public static void vectorTest() {
        vector.add("123");
        vector.add("456");

        Iterator<String> iter = vector.iterator();
        while (iter.hasNext()) {
            vector.add("456");
            iter.next();
        }
    }
}
