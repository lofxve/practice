package com.lofxve.com.yonghui;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定两个字符串str1和str2，输出连个字符串的最长公共子序列。如过最长公共子序列为空，则输出-1。
 * 输入描述
 * 两个字符串str1和str2
 * 输出描述
 * 最长公共子序列
 * 样例输入
 * 1A2C3D4B56 B1D23CA45B6A
 * 样例输出
 * 123456
 *
 * @ClassName Test02
 * @Author lofxve
 * @Date 2021/3/14 15:08
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        System.out.println(longestCommonSubsequence(str[1], str[0]));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i - 1) == text1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int index = dp[n][m] - 1;
        char[] chars = new char[index];
        while (index > 0) {
            if (n > 0 && dp[n][m] == dp[n - 1][m]) {
                n--;
            } else if (m > 0 && dp[n][m] == dp[n][m - 1]) {
                m--;
            } else {
                chars[index] = text1.charAt(n);
                n--;
                m--;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(chars));
        return dp[n][m];
    }
}
