package com.lofxve.task.task02;

import java.util.Scanner;

/**
 * @ClassName Test05
 * @Author 魏振东
 * @Date 2020/12/15 10:32
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println("发帖内容");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] keyArray = {"特朗普", "普京"};
        for (String s : keyArray) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = '*';
            }
            next = next.replace(s, new String(chars));
        }
        System.out.println(next);
    }
}