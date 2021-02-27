package com.lofxve.classtest.integerdome;

import java.util.ArrayList;

/**
 * @ClassName Integerdome2
 * @Author 魏振东
 * @Date 2020/12/15 9:07
 */
public class Integerdome2 {
    public static void main(String[] args) {
        // 自动装箱
        Integer in = 10;
        System.out.println(in);

        // 自动拆箱
        int i = in;
        System.out.println(i);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        Integer integer = arrayList.get(0);
        System.out.println(integer);
    }
}