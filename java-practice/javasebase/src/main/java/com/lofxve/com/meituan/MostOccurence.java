package com.lofxve.com.meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName MostOccurence
 * @Author lofxve
 * @Date 2021/3/13 23:41
 * @Version 1.0
 */
public class MostOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = sc.nextInt();
        }

        //也可以只使用一个HashMap保存，但移动窗口依然需要对窗口内元素遍历
        for (int i = 0; i <= len - k; i++) {
            System.out.println(getMost(res, i, i + k - 1));
        }
    }

    private static int getMost(int[] res, int start, int end) {
        if (start == end) {
            return res[start];
        }
        int temp = res[start];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = start; i <= end; i++) {
            map.put(res[i], map.getOrDefault(res[i], 0) + 1);
            if (map.get(res[i]) > map.get(res[start]) || (map.get(res[i]).equals(res[temp]) && res[i] < temp)) {
                temp = res[i];
            }
        }
        return temp;
    }
}
