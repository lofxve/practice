package com.lofxve.com.gaotu;

import java.util.Scanner;

/**
 * 编程题|15.0分1/3
 * 方阵转置
 * 时间限制： 3000MS
 * 内存限制： 626688KB
 * 题目描述：
 * 将一个N阶方阵原地转置。
 *
 *
 *
 * 输入描述
 * 第一行读入一个整数代表矩阵的阶数N
 *
 * 之后读入N行，每行包含N个整数，共计N * N个整数代表矩阵的元素
 *
 * 输出描述
 * 输出N行，每行包含N个整数，共计N * N个整数代表转置后的N阶矩阵
 *
 *
 * 样例输入
 * 3
 * 1 0 1
 * 2 1 3
 * 0 1 0
 * 样例输出
 * 1 2 0
 * 0 1 1
 * 1 3 0
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/11 19:18
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        // 输入
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 转置
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j) {
                    continue;
                }else{
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        // 输出
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
