package com.lofxve.com.didi;

import java.util.*;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/4/6 20:19
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            arr.add(i);
        }
//        Collections.shuffle(arr);
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        ArrayList<Integer> integers3 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        while (set.size()<54){
            Random random = new Random();
            int k = random.nextInt(54);
            set.add(k);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next%3 == 0) {
                integers1.add(next);
            } else if (next%3 == 1) {
                integers2.add(next);
            } else if (next%3 == 2) {
                integers3.add(next);
            }
        }
        System.out.println(integers1.size());
        System.out.println(integers2.size());
        System.out.println(integers3.size());
        System.out.println(Arrays.toString(integers1.toArray()));
        System.out.println(Arrays.toString(integers2.toArray()));
        System.out.println(Arrays.toString(integers3.toArray()));

    }
}
