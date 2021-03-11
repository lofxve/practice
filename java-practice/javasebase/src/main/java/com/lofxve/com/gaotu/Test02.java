package com.lofxve.com.gaotu;

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
 *
 * @ClassName Test02
 * @Author lofxve
 * @Date 2021/3/11 19:28
 * @Version 1.0
 */
public class Test02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = n-2;
        if(n==2 || n ==1){
            System.out.println(m);
        }
        if (m == 0 || n == 0){
            System.out.println(0);
        }else {
            System.out.println((m-k)/3*2);

        }
    }
}
