package com.lofxve.classtest.varargsdome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName VarArgsDome
 * @Author lofxve
 * @Date 2020/12/17 20:22
 */
public class VarArgsDome {
    public static void main(String[] args) {
        System.out.println(method02(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(getSum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100).toString());
        List<List<Integer>> method = method(var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100), var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100), var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100), var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100), var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100), var(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(method);
    }

    public static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static <T> T[] method02(T... t) {
        return t;
    }

    public static <T> List<T> method(T... t) {
        List<T> ts = new ArrayList<>();
        for (T t1 : t) {
            Collections.addAll(ts,t1);
        }
        return ts;
    }

    public static <T> List<T> var(T... t) {
        return new ArrayList<>(Arrays.asList(t));
    }

}