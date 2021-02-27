package com.lofxve.classtest.classloader;

/**
 * @ClassName Classloader
 * @Author lofxve
 * @Date 2020/12/31 11:28
 * @Version 1.0
 */
public class Classloader {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.lofxve.classtest.classdome.Person");

        //AppClassLoader  获取类加载器
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader);

        // ExtClassLoader
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        // 根类加载器，不是java语言描写,所以没有对象
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}