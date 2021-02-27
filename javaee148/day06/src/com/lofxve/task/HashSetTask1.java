package com.lofxve.task;

import java.util.HashSet;
import java.util.Random;

/**
 * @ClassName HashSetTask1
 * @Author lofxve
 * @Date 2020/12/18 14:50
 */
public class HashSetTask1 {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<Integer> set = new HashSet<>();

        while (set.size()<=5){
            set.add(random.nextInt(32+1));
        }

        System.out.println(set);
        System.out.println(random.nextInt(15+1));
    }
}