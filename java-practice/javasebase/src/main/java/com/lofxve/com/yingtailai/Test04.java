package com.lofxve.com.yingtailai;

import java.util.Scanner;

/**
 * @ClassName Test04
 * @Author lofxve
 * @Date 2021/3/17 20:03
 * @Version 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("i="+i+" j="+j+" "+arr[i][j]+", ");
            }
            System.out.println();
        }
        int k = 0;
        for (int i = 0; i < m; i++) {
            k = i;
            int j = 0;
            while (j <n && i >= 0) {
                System.out.print(arr[j][i] + ",");
                j--;
                i++;
            }
            i = k;
        }
    }
}
