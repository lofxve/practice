package com.lofxve.com.didi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Test03201
 * @Author lofxve
 * @Date 2021/3/20 19:21
 * @Version 1.0
 */
public class Test03201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s == null || "".equals(s)){
            System.out.println("");
        }else{
            char[] chars = s.toCharArray();
            int k = 0;
            for (int i = 0; i < chars.length; i++) {
                if (k == 2) {
                    break;
                }else {
                    int min = i;
                    for (int j = i; j < chars.length; j++) {
                        if (k == 2) {
                            break;
                        } else {
                            if (chars[j] < chars[min]) {
                                min = j;
                                k++;
                            }
                        }
                    }
                    char temp = chars[min];
                    chars[min] = chars[i];
                    chars[i] = temp;
                }
            }
            for (char aChar : chars) {
                System.out.print(aChar);
            }
        }
    }
}
