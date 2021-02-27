package com.lofxve.classtest.init;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

/**
 * @ClassName Person
 * @Author lofxve
 * @Date 2020/12/31 8:58
 * @Version 1.0
 */
public class Person {
    public static int a = 0;
    public Person() {
        System.out.println("空参构造方法");
    }
    public static void show(){
        System.out.println("show 方法");
    }
}