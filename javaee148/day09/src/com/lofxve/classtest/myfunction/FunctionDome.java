package com.lofxve.classtest.myfunction;

import java.util.function.Function;

/**
 * @ClassName FunctionDome
 * @Author lofxve
 * @Date 2020/12/22 12:00
 */
public class FunctionDome {
    public static void main(String[] args) {
        method(o -> {
            return Integer.valueOf(o);
        }, "26");
    }

    public static void method(Function<String, Integer> function, String string) {
        Integer apply = function.apply(string);
        System.out.println(apply);
    }
}