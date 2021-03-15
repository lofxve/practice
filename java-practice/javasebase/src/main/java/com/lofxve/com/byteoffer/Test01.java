package com.lofxve.com.byteoffer;

import java.util.Scanner;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/14 0:06
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String newstr = fun(str);
            System.out.println(newstr);
        }
    }

    private static String fun(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
             if (i + 3 < str.length() && str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 2) == str.charAt(i + 1)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(str.charAt(i + 1));
                i = i + 2;
            } else if (i + 4 <= length && str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 2) == str.charAt(i + 3)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(str.charAt(i + 1));
                stringBuilder.append(str.charAt(i + 2));
                i = i + 3;
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
