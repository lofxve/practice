package com.lofxve.task.task01.test01;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/12 14:33
 */
public class Student extends Person{
    public Student() {
    }

    public Student(String name, String sex, int age) {
        super(name, sex, age);
    }

    public void study(){
        System.out.println(this.getName()+"在教Java");
    }
}