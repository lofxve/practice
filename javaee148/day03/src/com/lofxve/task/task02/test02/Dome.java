package com.lofxve.task.task02.test02;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/14 16:45
 */
public class Dome {
    public static void main(String[] args) {
        Student student = new Student("fx", "女", "20");
        Student student2 = new Student("fx", "女", "20");
        System.out.println(student.equals(student2));
    }
}