package com.lofxve.task.task01.test03;

/**
 * @ClassName Teacher
 * @Author 魏振东
 * @Date 2020/12/13 18:46
 */
public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String name, String sex, String age) {
        super(name, sex, age);
    }

    @Override
    public void eat() {
        System.out.println("老师吃饭");
    }
}