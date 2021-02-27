package com.lofxve.task.task01.test03;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/13 18:44
 */
public class Student extends Person {
    private int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String sex, String age, int id) {
        super(name, sex, age);
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
}