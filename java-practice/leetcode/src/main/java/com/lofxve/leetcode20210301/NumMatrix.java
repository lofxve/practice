package com.lofxve.leetcode20210301;

/**
 * 304. 二维区域和检索 - 矩阵不可变
 * 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2) 。
 *
 * @ClassName NumMatrix
 * @Author lofxve
 * @Date 2021/3/2 15:48
 * @Version 1.0
 */
public class NumMatrix {
    int[][] dp;

    public NumMatrix(int[][] matrix) {
        int length = matrix.length;
        if (length > 0) {
            // 初始化dp数组
            dp = new int[length][matrix[0].length + 1];
            // 计算每一行
            for (int i = 0; i < matrix.length; i++) {
                int[] row = matrix[i];
                // dp[j] 等于j前的所有数据和
                for (int j = 0; j < row.length; j++) {
                    dp[i][j + 1] = dp[i][j] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            sum += dp[i][col2 + 1] - dp[i][col1];
        }
        return sum;
    }
}
