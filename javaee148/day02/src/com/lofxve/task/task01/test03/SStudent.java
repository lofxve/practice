package com.lofxve.task.task01.test03;

/**
 * @ClassName SStudent
 * @Author 魏振东
 * @Date 2020/12/13 18:49
 */
public class SStudent extends Student implements Smoke{
    public SStudent() {
    }

    public SStudent(int id) {
        super(id);
    }

    public SStudent(String name, String sex, String age, int id) {
        super(name, sex, age, id);
    }

    @Override
    public void smoking() {
        System.out.println("抽烟学生");
    }
}