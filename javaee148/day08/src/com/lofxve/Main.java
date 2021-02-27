package com.lofxve;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Main
 * @Author lofxve
 * @Date 2020/12/18 15:26
 */
public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(new Random().nextInt(25 + 1));
        }
        long end = System.currentTimeMillis();
        System.out.println(arrayList);
        System.out.println(end-start);
    }
}