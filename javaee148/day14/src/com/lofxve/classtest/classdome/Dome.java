package com.lofxve.classtest.classdome;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/31 9:06
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 获取Class文件的三种方式
         * 使用Obgect.getClass
         * 基本数据类型.class
         * Class.forName
         */
        // 使用Obgect.getClass
        System.out.println(new Person().getClass());

        // 基本数据类型.class
        System.out.println(Person.class);

        // Class.forName
        System.out.println(Class.forName("com.lofxve.classtest.classdome.Person"));
    }
}