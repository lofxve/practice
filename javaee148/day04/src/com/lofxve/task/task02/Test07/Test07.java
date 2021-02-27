package com.lofxve.task.task02.Test07;

import java.util.Scanner;

/**
 * @ClassName Test07
 * @Author 魏振东
 * @Date 2020/12/15 10:43
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("学员信息");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String[] split = next.split(",");
        Student student = new Student(split[0].trim(), Integer.valueOf(split[1].trim()), split[2].trim().charAt(0));
        System.out.println(student);
    }
}