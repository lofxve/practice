package com.lofxve.com.meituan.tuan0327;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 小美中奖啦
 * 时间限制： 3000MS
 * 内存限制： 1048576KB
 * 题目描述：
 * 小美超级幸运，这不今天又双叒叕中奖了！！！主办方给了小美 n 个积分球，从左到右排成一行，第 i 个积分球的积分为 ai 。让小美自行选取其中一段连续的积分球，最多选取k 个。假设小美选取了 [l, r] 这个区间中的积分球，小美获得的积分为al⊕al+1⊕…⊕ar-1⊕ar。例如，小美选取了 [3, 4, 2] 这三个积分球那么小美最终获得的积分为 3⊕4⊕2 = 5。
 * <p>
 * 小美想要获得最多的积分。小美虽然幸运，但是却被这个难题难倒了，请你帮帮小美，帮她获得更多积分。
 * <p>
 * ⊕：异或运算的数学符号。其运算法则相当于不带进位的二进制加法：二进制下用1表示真，0表示假，则异或的运算法则为：0⊕0=0，1⊕0=1，0⊕1=1，1⊕1=0（同为0，异为1），这些法则与加法是相同的，只是不带进位，所以异或常被认作不进位加法。例如：3⊕5=(011)2 ⊕ (101) 2 = (110) 2 = 6。
 * <p>
 * 异或在C语言中表示为^。
 * 输入描述
 * 第一行两个数 n, k。(1 ≤ n, k ≤ 100000)。
 * <p>
 * 第二行 n 个数，第 i 个数是 ai。(0 ≤ ai ≤ 1000000000)。
 * <p>
 * 输出描述
 * 输出一个数，代表小美能够获得的最多积分。
 *
 * @ClassName Test02
 * @Author lofxve
 * @Date 2021/3/27 16:22
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Integer n = Integer.valueOf(s[0]);
        Integer k = Integer.valueOf(s[1]);
        List<String> strings = Arrays.asList(sc.nextLine().split(" "));
        int max = 0;
        for (int i = 0; i <= strings.size() - k+1; i++) {
            int x1 = fun1(strings, i, k);
            if (x1 > max) {
                max = x1;
            }
            if (i + k - 1<strings.size()){
                int x = fun(strings, i, i + k - 1);
                if (x > max) {
                    max = x;
                }
            }
        }
        System.out.println(max);
    }

    private static int fun1(List<String> strings, int i, int j) {
        int sum = Integer.valueOf(strings.get(i));
        for (int k = 0; k < j; k++) {
            sum ^= sum;
        }
        return sum;
    }

    private static int fun(List<String> strings, int i, int j) {
        int sum = Integer.valueOf(strings.get(i));
        i++;
        for (; i <= j; i++) {
            sum ^= Integer.valueOf(strings.get(i));
        }
        return sum;
    }
}
