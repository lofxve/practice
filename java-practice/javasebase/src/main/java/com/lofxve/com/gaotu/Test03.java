package com.lofxve.com.gaotu;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 求平方根（不使用库函数）
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 不使用库函数，实现对输入的整数求平方根，结果四舍五入精确到小数点后3位。
 * 输入描述
 * 整数
 * 输出描述
 * 浮点数
 * @ClassName Test03
 * @Author lofxve
 * @Date 2021/3/11 19:45
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double exp = Math.sqrt(i);
        System.out.print(BigDecimal.valueOf(exp).setScale(3,3));
    }
}
