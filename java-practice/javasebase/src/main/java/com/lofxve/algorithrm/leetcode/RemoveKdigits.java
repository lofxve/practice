package com.lofxve.algorithrm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveKdigits {
    public static String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<Character>();
        int length = num.length();
        for (int i = 0; i < length; ++i) {
            char digit = num.charAt(i);
            // 栈不为空
            // 可删除元素大于0
            // 当前栈顶元素大于digit
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                k--;
            }
            // 进栈
            deque.offerLast(digit);
        }
        for (int i = 0; i < k; ++i) {
            deque.pollLast();
        }
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false;
            ret.append(digit);
        }
        // 如果长度等于0，则输出0
        return ret.length() == 0 ? "0" : ret.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }
}
