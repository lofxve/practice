package com.lofxve.com.bianlifeng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最短路径
 * 时间限制： 4000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 假设有一个矩阵，矩阵由 0 和 1 数字组成。其中1代表这个节点可达，0代表这个节点不可达，从左上角第一个节点出发到右下角最后一个节点，只能上下左右移动，初始节点数为 1，移动一步节点数加 1，问最少需要经过多少节点可以达到。
 * <p>
 * 请实现计算最短路径的函数。如果不可达返回0。
 * <p>
 * 举例1、
 * <p>
 * 输入：1
 * <p>
 * 输出：1
 * <p>
 * <p>
 * <p>
 * 举例2、
 * <p>
 * 输入：1,1
 * <p>
 * 输出：2
 * 举例3、
 * <p>
 * 输入：1,0;1,0
 * <p>
 * 输出： 0
 * 输入描述
 * 矩阵数组，每行之间用”;"分隔，同一行内用","分隔
 * <p>
 * 输出描述
 * 返回最短距离
 * 样例输入
 * 1,0,1,1;1,1,1,1;1,1,0,1;0,0,0,1
 * 样例输出
 * 7
 *
 * @ClassName Test03
 * @Author lofxve
 * @Date 2021/3/20 15:38
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(";");
        int length = split[0].length();
        String[][] strings = new String[split.length][length];
        for (int i = 0; i < split.length; i++) {
            strings[i] = split[i].split(",");
        }
        int[][] dp = new int[split.length][length];
        for (int i = 0; i < strings.length; i++) {
            for (int j = strings[i].length - 1; j >= 0; j--) {
                dp[i][j] = 0;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = strings[i].length - 1; j >= 0; j--) {
                // 下
                if (j - 1 >= 0 && Integer.valueOf(strings[i][j - 1]) == 1) {
                    dp[i][j - 1] = dp[i][j] + 1;
                }
                // 左
                if (i + 1 < strings.length && Integer.valueOf(strings[i + 1][j]) == 1) {
                    dp[i + 1][j] = dp[i][j] + 1;
                }
                // 右
                if (i - 1 >= 0 && Integer.valueOf(strings[i - 1][j]) == 1) {
                    dp[i - 1][j] = dp[i][j] + 1;
                }
                // 上
                if (j + 1 <= strings[i].length - 1 && Integer.valueOf(strings[i][j + 1]) == 1) {
                    dp[i][j + 1] = dp[i][j] + 1;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = strings[i].length - 1; j >= 0; j--) {
                System.out.print(strings[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            for (int j = strings[i].length - 1; j >= 0; j--) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        if (dp[split.length-1][0] > 0) {
            System.out.println(dp[split.length][0]);
        } else {
            System.out.println(-1);
        }
    }
}
