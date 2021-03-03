package com.lofxve.leetcode20210301;

import java.util.Arrays;

/**
 * 338. 比特位计数
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * @ClassName CountBits
 * @Author lofxve
 * @Date 2021/3/3 12:32
 * @Version 1.0
 */
public class CountBits {
    //奇数：二进制表示中，奇数一定比前面那个偶数多一个 1，因为多的就是最低位的 1。
    //          举例：
    //         0 = 0       1 = 1
    //         2 = 10      3 = 11
    //偶数：二进制表示中，偶数中 1 的个数一定和除以 2 之后的那个数一样多。
    // 因为最低位是 0，除以 2 就是右移一位，也就是把那个 0 抹掉而已，所以 1 的个数是不变的。
    //           举例：
    //          2 = 10       4 = 100       8 = 1000
    //          3 = 11       6 = 110       12 = 1100
    public static int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            // 奇数，x=dp[i/2]+1
            // 偶数，x=dp[i/2]
            dp[i] = dp[i >> 1] + (i & 1);
        }
        //i >> 1 右移除以2的1次方
        //i << 1 右移乘2的1次方
        // (i&1) 是按位 与 运算,相当于 取出 i 的2 进制数值的个位数。
        // i & 1 = 1 为奇数
        // i & 1 = 0 为偶数
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
    }
}
