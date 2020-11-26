package com.chen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * author: JINCHENCHEN
 * date: 2020/11/23
 */
public class ForEachTest {
    public static void forEachTest() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(9);

        list.forEach(item -> System.out.println(item));
        Stream<Integer> stream = list.stream();

    }
}
