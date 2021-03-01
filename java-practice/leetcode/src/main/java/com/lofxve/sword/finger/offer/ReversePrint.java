package com.lofxve.sword.finger.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName ReversePrint
 * @Author lofxve
 * @Date 2021/3/1 10:42
 * @Version 1.0
 */
public class ReversePrint {
    /**
     * @return int[]
     * @Author lofxve
     * @Description // 剑指原解
     * @Date 11:06 2021/3/1
     * @Param [head]
     **/
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode p = null;
        ListNode r = null;
        // 当前节点是head，p为当前节点的前一节点，r为当前节点的下一节点
        while (head != null) {
            r = head.next;
            head.next = p;
            // p向后移动一位，当前节点同样向后移动一位
            p = head;
            head = r;
        }
        while (p != null) {
            arr.add(p.val);
            p = p.next;
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * @return int[]
     * @Author lofxve
     * @Description // 辅助栈
     * @Date 11:06 2021/3/1
     * @Param [head]
     **/
    public int[] reversePrintStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        // 进栈
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] ints = new int[stack.size()];
        int i = 0;
        // 出栈
        while (!stack.isEmpty()) {
            ints[i] = stack.pop();
            i++;
        }
        return ints;
    }
}
