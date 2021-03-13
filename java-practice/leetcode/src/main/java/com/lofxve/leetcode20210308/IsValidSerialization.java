package com.lofxve.leetcode20210308;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 331. 验证二叉树的前序序列化
 * 序列化二叉树的一种方法是使用前序遍历。当我们遇到一个非空节点时，我们可以记录下这个节点的值。如果它是一个空节点，
 * 我们可以使用一个标记值记录，例如 #。
 *      _9_
 *     /   \
 *    3     2
 *   / \   / \
 *  4   1  #  6
 * / \ / \   / \
 * # # # #   # #
 * 例如，上面的二叉树可以被序列化为字符串 "9,3,4,#,#,1,#,#,2,#,6,#,#"，其中 # 代表一个空节点。
 * 给定一串以逗号分隔的序列，验证它是否是正确的二叉树的前序序列化。编写一个在不重构树的条件下的可行算法。
 * 每个以逗号分隔的字符或为一个整数或为一个表示 null 指针的 '#' 。
 * 你可以认为输入格式总是有效的，例如它永远不会包含两个连续的逗号，比如 "1,,3" 。
 * @ClassName IsValidSerialization
 * @Author lofxve
 * @Date 2021/3/12 9:55
 * @Version 1.0
 */
public class IsValidSerialization {
    public static boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        while (i < n) {
            if (stack.isEmpty()) {
                return false;
            }
            // 向后挪位置
            if (preorder.charAt(i) == ',') {
                i++;
                // 如果遇到了空节点，则要消耗一个槽位；
            } else if (preorder.charAt(i) == '#') {
                int top = stack.pop() - 1;
                if (top>0) {
                    stack.push(top);
                }
                i++;
                // 如果遇到了非空节点，则除了消耗一个槽位外，还要再补充两个槽位。
            } else {
                // 向后挪位置
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                int top = stack.pop() - 1;
                if (top>0) {
                    stack.push(top);
                }
                stack.push(2);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }
}
