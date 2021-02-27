package com.lofxve.task.task02;

import java.util.Scanner;

/**
 * @ClassName Test01
 * @Author 魏振东
 * @Date 2020/12/15 10:58
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("分数");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(Integer.valueOf(next) + 5);
    }
}