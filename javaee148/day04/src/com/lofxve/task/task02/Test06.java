package com.lofxve.task.task02;

import java.util.Scanner;

/**
 * @ClassName Test06
 * @Author 魏振东
 * @Date 2020/12/15 10:36
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println("java文件的文件名");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next.charAt(0));
        System.out.println(next.substring(next.lastIndexOf(".")));
        System.out.println(next.substring(0,next.indexOf(".")).concat(".java"));
    }
}