package com.lofxve.task;

import java.util.ArrayList;

/**
 * @ClassName Task05
 * @Author com.lofxve
 * @Date 2020/12/17 19:09
 */
public class Task05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(listTest(list, 5));
    }

    private static int listTest(ArrayList<Integer> list, int i) {
        for (int i1 = 0; i1 < list.size(); i1++) {
            if (list.get(i1).equals(i)){
                return i1;
            }
        }
        return -1;
    }
}