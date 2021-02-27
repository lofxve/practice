package com.lofxve.task.task02;

import com.lofxve.task.task02.Test07.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Test02
 * @Author 魏振东
 * @Date 2020/12/15 11:05
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.next());
        }
        Student student = new Student();
        student.setName(strings.get(0));
        student.setAge(Integer.valueOf(strings.get(1)));
        student.setHeight(Double.valueOf(strings.get(2)));
        student.setHun(Boolean.valueOf(strings.get(3)));
        student.setSex(strings.get(4).charAt(0));
        System.out.println(student);
    }
}