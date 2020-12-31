package com.chen;

/**
 * author: JINCHENCHEN
 * date: 2020/12/31
 */
public class RunTimeTest {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();

        System.out.println("freeMemory = " + freeMemory/1024/1024);
        System.out.println("totalMemory = " + totalMemory);
        System.out.println("maxMemory = " + maxMemory);
    }
}
