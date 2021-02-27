package com.lofxve.leetcode20210201;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 888. 公平的糖果棒交换
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
 * 因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 *
 * @ClassName FairCandySwap
 * @Author lofxve
 * @Date 2021/2/1 20:28
 * @Version 1.0
 */
public class FairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        // 计算两个人拥有糖果总量的差值
        int k = (Arrays.stream(A).sum() - Arrays.stream(B).sum()) / 2;
        // 存入set 为了去除a中重复的
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : A) {
            rec.add(num);
        }
        for (int y : B) {
            int x = y + k;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 1};
        int[] B = new int[]{2, 2};
        int[] integers = fairCandySwap(A, B);
        for (int integer : integers) {
            System.out.println(integer);
        }
    }
}