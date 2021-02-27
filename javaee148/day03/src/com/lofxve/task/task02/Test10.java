package com.lofxve.task.task02;


import java.util.Arrays;

/**
 * @ClassName Test10
 * @Author 魏振东
 * @Date 2020/12/14 17:17
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = {10, 27, 8, 5, 2, 1, 3, 55, 88};
        int[] newarr = new int[5];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                System.arraycopy(arr, i, newarr, k, 1);
                k++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}