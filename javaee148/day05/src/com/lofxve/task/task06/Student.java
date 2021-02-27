package com.lofxve.task.task06;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/15 15:46
 */
public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学生";
    }
}