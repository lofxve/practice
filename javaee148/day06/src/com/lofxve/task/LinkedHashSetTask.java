package com.lofxve.task;

import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @ClassName LinkedHashSetTask
 * @Author lofxve
 * @Date 2020/12/18 12:11
 */
public class LinkedHashSetTask {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        Collections.addAll(integers, 20, 30, 50, 10, 30, 20);
        System.out.println(integers.size());
        for (Integer integer : integers) {

            if (integer > 25) {
                System.out.println(integer);
            }
        }
    }
}