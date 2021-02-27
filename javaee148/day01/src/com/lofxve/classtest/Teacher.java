package com.lofxve.classtest;

/**
 * @ClassName Teacher
 * @Author 魏振东
 * @Date 2020/12/11 9:42
 */
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    // 子类

    // 扩展自己的成员
    public void teacher() {
        System.out.println(super.getName()+"教java...");
    }
}