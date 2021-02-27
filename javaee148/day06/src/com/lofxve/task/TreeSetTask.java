package com.lofxve.task;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @ClassName TreeSetTask
 * @Author lofxve
 * @Date 2020/12/18 12:14
 */
public class TreeSetTask {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        Collections.addAll(integers, 20, 30, 50, 10, 30, 20);
        System.out.println(integers.size());
        for (Integer integer : integers) {

            if (integer > 25) {
                System.out.println(integer);
            }
        }
    }
}