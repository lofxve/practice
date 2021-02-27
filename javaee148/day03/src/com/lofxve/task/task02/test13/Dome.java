package com.lofxve.task.task02.test13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/14 17:30
 */
public class Dome {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", "男", "20", "79.5"));
        students.add(new Student("李四", "女", "21", "80.2"));
        students.add(new Student("王五", "男", "22", "77.9"));
        students.add(new Student("周六", "男", "20", "55.8"));
        students.add(new Student("赵七", "女", "21", "99.9"));
        BigDecimal bigDecimal = new BigDecimal("0");
        for (Student student : students) {
            bigDecimal = bigDecimal.add(new BigDecimal(student.getScore()));
        }
        System.out.println(bigDecimal.divide(new BigDecimal(students.size()),2, RoundingMode.HALF_UP));
    }
}