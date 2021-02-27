package com.lofxve.task.task02.test01;

/**
 * @ClassName UiTeacher
 * @Author 魏振东
 * @Date 2020/12/13 20:14
 */
public class UiTeacher extends Employee implements Draw{

    @Override
    public void drawing() {
        System.out.println("绘画");
    }
}