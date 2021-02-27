package com.lofxve;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Main
 * @Author lofxve
 * @Date 2020/12/18 15:26
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aab");
        list.add("abd");
        list.add("abc");
        Collections.sort(list);
        System.out.println(list);
    }
}