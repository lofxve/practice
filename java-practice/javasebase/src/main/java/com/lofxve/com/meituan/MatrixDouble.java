package com.lofxve.com.meituan;

import java.util.Scanner;

/**
 *
 * 测试用例
 * 3 4 //行和列
 * 1 2 3 11
 * 4 5 6 12
 * 7 8 9 13 输出
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 11 12 13
 * @ClassName MatrixDouble
 * @Author lofxve
 * @Date 2021/3/13 23:23
 * @Version 1.0
 */
public class MatrixDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (rows-1 > j) {
                    System.out.print(arr[j][i]+" ");
                }else {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}
