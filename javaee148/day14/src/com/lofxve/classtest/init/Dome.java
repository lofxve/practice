package com.lofxve.classtest.init;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/31 8:57
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        //1.使用java.exe命令运行某一个类的时候
        //2.创建某一个类对象的时候
        new Person();
        //3.使用类中的静态成员变量的时候
        System.out.println(Person.a);
        //4.使用类中的静态成员方法的时候
        Person.show();
        //5.创建类的子类对象的时候
        new Student();
        //6.使用反射方式来强制创建某个类或接口对应的java.lang.Class对象
    }
}