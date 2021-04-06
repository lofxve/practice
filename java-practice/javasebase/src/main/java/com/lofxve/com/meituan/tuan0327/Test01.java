package com.lofxve.com.meituan.tuan0327;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 小美记数字
 * 时间限制： 3000MS
 * 内存限制： 1048576KB
 * 题目描述：
 * 小美的记忆力超级棒，小团决定来考一考小美。小团给了小美 n 个数，从左到右排成一行，给了1 分钟让小美记住。然后小团会询问 m 次，每次都问数 x 第一次出现的位置和最后一次出现的位置，若数 x 没出现过，那么回答 0 即可。小美的记忆力好，但是 1 分钟记住这么多数实在是太难了，请你帮帮小美，完成这次不可能的挑战。
 * 输入描述
 * 第一行两个数 n, m。(1 ≤ n, m ≤ 50000)。
 * 第二行 n 个数，第 i 个数是 ai。(1 ≤ ai ≤ 1000000000)。
 * 接下来 m 行，每行一个数 x (1 ≤ x ≤ 1000000000)，代表一次询问。
 * 输出描述
 * 输出 m 行，若数 x 出现过，输出数 x 第一次出现的位置和最后一次出现的位置。若数 x 没出现过，输出 0。
 *
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/27 16:03
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Integer m = Integer.valueOf(s[1]);
        List<String> strings = Arrays.asList(sc.nextLine().split(" "));
        if (m != 0) {
            for (Integer i = 0; i < m; i++) {
                String s1 = sc.nextLine();
                if (strings.contains(s1)) {
                    int i1 = strings.indexOf(s1) + 1;
                    int i2 = strings.lastIndexOf(s1) + 1;
                    System.out.println(i1 + " " + i2);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
