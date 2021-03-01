package com.lofxve.sword.finger.offer;

/**
 * 斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * @ClassName Fib
 * @Author lofxve
 * @Date 2021/3/1 10:14
 * @Version 1.0
 */
public class Fib {
    public int fib(int n) {
        // 数据校验
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // 构建dp数组
        int[] sums = new int[n + 1];
        // 存值
        sums[0] = 0;
        sums[1] = 1;
        for (int i = 2; i <= n; i++) {
            sums[i] = sums[i - 1] + sums[i - 2];
            sums[i] %= 1000000007;
        }
        return sums[n];
    }

    public static int fib1(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib1(5));
        System.out.println(fib1(2));
    }
}
