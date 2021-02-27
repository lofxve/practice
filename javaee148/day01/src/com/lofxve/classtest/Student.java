package com.lofxve.classtest;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/11 9:10
 */
public class Student extends Person { // 子类
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类代码块");
    }

    public Student() {
        System.out.println("子类构造方法");
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    // 扩展自己的成员
    public void study() {
        System.out.println(super.getName() + "学习java...");
    }
}