package com.chen.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author: JINCHENCHEN
 * date: 2020/12/15
 */
public class HashMapTest {
    HashMap<String, String> hashMap = new HashMap<>();
    Hashtable<String, String> hashtable = new Hashtable<>();
    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    public void hashMapTest() {
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
        }
    }
}
