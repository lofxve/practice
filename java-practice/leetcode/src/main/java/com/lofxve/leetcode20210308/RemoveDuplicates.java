package com.lofxve.leetcode20210308;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * @ClassName RemoveDuplicates
 * @Author lofxve
 * @Date 2021/3/9 15:38
 * @Version 1.0
 */
public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 出栈，删除两个元素
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                top--;
            } else {
                // 入栈
                stack.append(ch);
                top++;
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
