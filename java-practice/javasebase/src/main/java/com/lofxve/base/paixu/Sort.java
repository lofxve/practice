package com.lofxve.base.paixu;

/**
 * @ClassName Sort
 * @Author lofxve
 * @Date 2021/3/8 21:13
 * @Version 1.0
 */
public class Sort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arr[j];
                }
            }
        }
    }

    public static void kuaipai(int[] arr, int l, int r) {
        int i = l;
        int j = r;
        int x = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= x) {
                j--;
            }
            if (i < j) {
                arr[i++] = arr[j];
            }
            while (i < j && arr[i] < x) {
                i++;
            }
            if (i < j) {
                arr[j--] = arr[i];
            }
            arr[i] = x;
            kuaipai(arr, l, i - 1);
            kuaipai(arr, i + 1, r);
        }
    }
}
