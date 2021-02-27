package com.lofxve.classtest.consumerdome;

import java.util.function.Consumer;

/**
 * @ClassName Dome
 * @Author com.lofxve
 * @Date 2020/12/17 14:23
 */
public class Dome {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t->{
            System.out.println(t);
        };
        consumer.accept(20);

    }
}