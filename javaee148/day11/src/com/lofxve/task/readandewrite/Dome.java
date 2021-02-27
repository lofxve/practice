package com.lofxve.task.readandewrite;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/25 10:01
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", "男", "20", "88"));
        students.add(new Student("李四", "女", "19", "99"));
        try (FileWriter fileWriter = new FileWriter("day11/3.txt")) {
            for (Student student : students) {
                fileWriter.write(student.toString()+"\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}