package com.lofxve.classtest.staticdome;

/**
 * @ClassName Const
 * @Author 魏振东
 * @Date 2020/12/13 9:53
 */
public class Const {
    public static String school = "传智播客-顺义校区";

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
}