package com.lofxve.classtest.integerdome;

/**
 * @ClassName integerdome1
 * @Author 魏振东
 * @Date 2020/12/15 8:57
 */
public class integerdome1 {
    public static void main(String[] args) {
        //构造方法
        Integer integer1 = new Integer(10);
        System.out.println(integer1);

        Integer integer2 = new Integer("10");
        System.out.println(integer2);

        // 静态方法
        Integer integer3 = Integer.valueOf(10);
        System.out.println(integer3);

        Integer integer4 = Integer.valueOf("10");
        System.out.println(integer4);

        // 拆箱
        int i = integer1.intValue();
        System.out.println(i);
    }
}