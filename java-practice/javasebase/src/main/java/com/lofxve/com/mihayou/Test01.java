package com.lofxve.com.mihayou;

import java.util.Scanner;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/27 20:10
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Integer l = Integer.valueOf(s[0]);
        Integer r = Integer.valueOf(s[1]);
        int sum = 0;
        for (Integer i = l; i <= r; i++) {
            String s1 = i.toString();
            if (fun(s1)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static boolean fun(String s1) {
        int[] ints = {0, 0};
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                ints[0] += s1.charAt(i) - 48;
            }else {
                ints[1] += s1.charAt(i) - 48;
            }
        }
        if (ints[0] == ints[1]){
            return true;
        }else {
            return false;
        }
    }
}
