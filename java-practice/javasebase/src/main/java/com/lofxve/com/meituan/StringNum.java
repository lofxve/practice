package com.lofxve.com.meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 测试用例：he15l154lo87wor7l87d
 * 将其中包含的数字排序，输出
 * 7
 * 15
 * 87
 * 87
 * 154
 *
 * @ClassName StringNum
 * @Author lofxve
 * @Date 2021/3/13 23:32
 * @Version 1.0
 */
public class StringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Integer> res = new ArrayList<>();
        resolve(str, res);
        int[] arr = new int[res.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(i);
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void resolve(String str, List<Integer> res) {
        if (str == null) {
            return;
        }
        int length = str.length();
        int right = 0;
        String tem = "";
        while (right < length) {
            tem = "";
            while (right < length && str.charAt(right) >= 'a' && str.charAt(right) <= 'z') {
                right++;
            }
            while (right < length && str.charAt(right) >= '0' && str.charAt(right) <= '9') {
                tem += str.charAt(right);
                right++;
            }
            if (tem != "") {
                res.add(Integer.parseInt(tem));
            }
        }
    }
}
