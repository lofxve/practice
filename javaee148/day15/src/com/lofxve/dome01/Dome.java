package com.lofxve.dome01;

import java.util.function.Consumer;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2021/1/2 16:16
 * @Version 1.0
 */
public class Dome {
    /**
     * 当一些内容已经存在了，我们就可以使用方法引用，直接引用这些已经存在的内容
     */
    public static void main(String[] args) {

        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }, "张三");

        method(s -> System.out.println(s), "张三三");

        method(System.out::println, "张三三三");
    }

    public static void method(Consumer<String> con, String s) {
        con.accept(s);
    }
}