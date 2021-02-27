package com.lofxve.classtest.classdome;

/**
 * @ClassName Dome01
 * @Author lofxve
 * @Date 2020/12/31 9:19
 * @Version 1.0
 */
public class Dome01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.lofxve.classtest.classdome.Person");
        /**
         * 使用Class.forName会运行class类中的静态代码块
         */

        // getSimpleName  Person
        System.out.println(clazz.getSimpleName());
        // getName com.lofxve.classtest.classdome.Person
        System.out.println(clazz.getName());
        // getClassLoader  sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(clazz.getClassLoader());

    }
}