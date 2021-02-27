package com.lofxve.classtest.objectdome;

/**
 * @ClassName DateDome
 * @Author 魏振东
 * @Date 2020/12/14 9:50
 */
public class Dome {
    public static void main(String[] args) {
        Student student = new Student("pink","25");
        System.out.println(student);
        Student student2 = new Student("pink","25");
        System.out.println(student2);

        System.out.println(student.equals(student2));

        System.out.println(student==student2);
    }
}