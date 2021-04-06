package com.lofxve.com.didi;

import java.util.Scanner;

/**
 * @ClassName Test03202
 * @Author lofxve
 * @Date 2021/3/20 19:47
 * @Version 1.0
 */
public class Test03202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();// 居民点的数量
            int m = sc.nextInt();// 边的数量
            int[][] arr = new int[n][n];
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    arr[x][y] = 0;
                }
            }
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x-1][y-1] = 1;
            }
            System.out.println();
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(arr[x][y]);
                }
                System.out.println();
            }
            if (fun(n, arr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean fun(int n, int[][] arr) {
        for (int x = 0; x < n; x++) {
            int o = 0;
            int p = 0;
            // 将路段掉
            for (int y = 0; y < n; y++) {
                if (arr[x][y] == 1) {
                    arr[x][y] = 0;
                    o = x;
                    p = y;
                }
            }
            int[] v = new int[n];
            // 初始化是否访问
            for (int i1 = 0; i1 < n; i1++) {
                v[i1] = 0;
            }
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int y = k; y <= n; y++) {
                    if (arr[i][y] == 1) {
                        v[i] = 1;
                        k = y;
                    }
                }
            }
            for (int i1 = 0; i1 < n; i1++) {
                if (v[i1] == 0) {
                    return false;
                }
            }
            // 复原路线
            arr[o][p] = 1;
        }
        return true;
    }
}
