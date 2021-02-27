package com.lofxve.algorithrm.leetcode;
/***
 * @Author weizhendong
 * @Description //TODO 分割链表
 * @Date 22:08 2020/9/14
 * @Param 
 * @return 
 **/
public class Partition {
    /**
     * @Author weizhendong
     * @Description //TODO 如果小于x则将元素从头插入
     * @Date 22:45 2020/9/14
     * @Param [head, x]
     * @return leetcode.ListNode
     **/
    public static ListNode partition(ListNode head, int x) {
        ListNode p = head.next;
        while (p.next!=null){
            ListNode q = head.next;
            if(p.val<x){
//                新建节点并头插
                ListNode s = new ListNode(p.val);
                s.next = q;
                head.next = s;
//               //TODO 删除当前节点
//                     将下一个节点的值赋给当前节点
//                     将当前节点指向下下一个节点
                p.val = p.next.val;
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return  head;
    }
    public ListNode partition1(ListNode head, int x) {
        if(head == null)
            return null;

        ListNode p = head;
        while(p.next != null){
            if(p.next.val < x){
                ListNode tmp = p.next;
                p.next = p.next.next;

                tmp.next = head;
                head = tmp;
            }
            else
                p = p.next;
        }

        return head;
    }
    public static void main(String[] args) {
        //头结点
        ListNode head = new ListNode();
        //活动节点
        int[] a = {2,5,2,3,4,1};
        ListNode p = new ListNode();
//           头插法创建链表
        for(int i =0;i<6;i++){
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
        System.out.println("尾插法建立链表");
        ListNode r = head;
        for(int i =0;i<6;i++){
            ListNode s = new ListNode(i);
            r.next = s;
            r = s;
        }
        p =head.next;
        while (p!=null){
            System.out.print(p.val+" ");
            p = p.next;
        }
    }
}
