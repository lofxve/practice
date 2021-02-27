package com.lofxve.task.task02;

import java.util.ArrayList;

/**
 * @ClassName Test11
 * @Author 魏振东
 * @Date 2020/12/14 17:22
 */
public class Test11 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            objects.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}