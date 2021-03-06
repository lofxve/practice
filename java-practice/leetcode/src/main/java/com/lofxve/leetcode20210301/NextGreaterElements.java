package com.lofxve.leetcode20210301;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），
 * 输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，
 * 这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 *
 * @ClassName NextGreaterElements
 * @Author lofxve
 * @Date 2021/3/6 11:37
 * @Version 1.0
 */
public class NextGreaterElements {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        // 初始化数组
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n * 2 - 1; i++) {
            // 如果栈不为空，则比较栈顶元素和当前元素，如果当前元素大于栈顶元素
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                // 小的元素出栈，大的入栈
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints1 = nextGreaterElements(ints);
        System.out.println(Arrays.toString(ints1));
    }
}
