package com.lofxve.com.haoweilai;

import java.util.Scanner;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/21 14:20
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String[] s2 = s.split(" ");
        int sum =0;
        for (int i = 0; i < s2.length; i++) {
            if (s1.equals(s2[i])){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
