package com.lofxve.test.student1.pojo;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/15 15:46
 */
public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }

    @Override
    public String getType() {
        return "老师";
    }

    @Override
    public String getWork() {
        return "老师";
    }
}