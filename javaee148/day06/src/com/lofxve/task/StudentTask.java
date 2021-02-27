package com.lofxve.task;

import java.util.HashSet;

/**
 * @ClassName StudentTask
 * @Author lofxve
 * @Date 2020/12/18 12:09
 */
public class StudentTask {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("张三","男",20));
        set.add(new Student("李四","女",20));
        set.add(new Student("张三","男",20));
//使用增强for遍历集合，获取每个Student对象，并打印属性值；
        for (Student student : set) {
            System.out.println(student);
        }
//请实现集合中不能存储姓名年龄相同的元素
    }
}