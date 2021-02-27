package com.lofxve.classtest.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/19 12:56
 */
public class Dome {
    public static void main(String[] args) {
        myshow(a -> System.out.println(a + " " + a), "fx");

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 10, 12, 45, 78, 6, 1, 4, 87, 6, 48, 78);
        arrayList.forEach(a -> System.out.println(a + " " + a));
    }

    public static void myshow(MyFunction<String> con, String string) {
        con.show(string);
    }
}