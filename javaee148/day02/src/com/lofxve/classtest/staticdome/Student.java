package com.lofxve.classtest.staticdome;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/13 9:50
 */
public class Student {

    public void show() {
        int[] arr = {1, 2, 5, 478, 6, 418, 64, 8, 48};
        System.out.println(Const.getMax(arr));
        System.out.println("我的学校是" + Const.school);
    }
}