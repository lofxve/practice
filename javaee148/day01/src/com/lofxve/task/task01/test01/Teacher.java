package com.lofxve.task.task01.test01;

/**
 * @ClassName Teacher
 * @Author 魏振东
 * @Date 2020/12/12 14:31
 */
public class Teacher extends Person{
    public void teacher(){
        System.out.println(this.getName()+"在学习Java");
    }

    public Teacher() {
    }

    public Teacher(String name, String sex, int age) {
        super(name, sex, age);
    }
}