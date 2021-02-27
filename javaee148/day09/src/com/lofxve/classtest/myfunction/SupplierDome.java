package com.lofxve.classtest.myfunction;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName SupplierDome
 * @Author lofxve
 * @Date 2020/12/22 12:05
 */
public class SupplierDome {
    public static void main(String[] args) {
        method(()->{
            return "82";
        });
    }
    public static void method(Supplier<String> pre) {
        String test = pre.get();
        System.out.println(test);
    }
}