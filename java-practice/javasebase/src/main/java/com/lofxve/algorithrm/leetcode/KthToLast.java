package com.lofxve.algorithrm.leetcode;

import java.util.LinkedList;
/***
 * @Author weizhendong
 * @Description //TODO 倒数第k个节点
 * @Date 17:09 2020/9/14
 * @Param 
 * @return 
 **/
public class KthToLast {
    /**
     * @Author weizhendong
     * @Description //TODO 使用队列实现
     * @Date 21:44 2020/9/14
     * @Param [head, k]
     * @return int
     **/
    public static int kthToLast(ListNode head, int k) {
//        p等于链表第一个节点
        ListNode p = head.next;
        LinkedList<Integer> link = new LinkedList<>();
//        循环整个链表，当p等于最后一个元素的时候跳出循环
        while (p.next!=null){
//            如果队列中的元素小于k则加入队列，否则从队列中移除添加新的
            if(link.size()<k){
                link.addLast(p.val);
            }else{
                link.removeFirst();
                link.addLast(p.val);
            }
            p=p.next;
        }
        return link.removeFirst();
    }
    /**
     * @Author weizhendong
     * @Description //TODO 快慢指针实现
     * @Date 18:12 2020/9/14
     * @Param [head, k]
     * @return int
     **/
    public static int kthToLastKM(ListNode head, int k) {
        if (head == null)
            return 0;
        ListNode p = head;
        ListNode r = head;
        int i = 0;
//        尾指针先行走k个元素
        while (i<k){
            if(r == null)
                return 0;
            r = r.next;
            i++;
        }
//        首尾指针同时移动
        while (r!=null){
            p = p.next;
            r = r.next;
        }
        return p.val;
    }
    public static void main(String[] args) {
        //头结点
        ListNode head = new ListNode();
        //活动节点
        ListNode p = new ListNode();
//           头插法创建链表
        for(int i =5;i>0;i--){
            ListNode s = new ListNode(i);
            //后半部连接到s节点
            s.next = p;
//            头结点指向s
            head.next = s;
            //p等于头结点的下一个节点
            p = s;
        }

        p =head.next;
        while (p.next!=null){
            System.out.print(p.val+" ");
            p = p.next;
        }
        System.out.println();
        System.out.println("倒数第k个元素为 : "+kthToLast(head,2));
//        System.out.println();
//        p =head.next;
//        i = 0;
//        while (p!=null){
//            System.out.print(p.val+" ");
//            System.out.println(i++);
//            p = p.next;
//        }

    }
}
