package com.lofxve.leetcode20210222;

import java.util.Arrays;

/**
 * 832. 翻转图像
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * @ClassName FlipAndInvertImage
 * @Author lofxve
 * @Date 2021/2/24 21:43
 * @Version 1.0
 */
public class FlipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int right = A[i].length - 1;
            int left = 0;
            while (left < right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                left++;
                right--;
            }
            if (left == right){
                A[i][left] ^= 1;
            }
        }
        return A;
    }

    public static void fun(int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}
