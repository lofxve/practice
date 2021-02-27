package com.lofxve.algorithrm.leetcode;

/***
 * @Author weizhendong
 * @Description //TODO 链表求和
 * @Date 8:21 2020/9/15
 * @Param 
 * @return 
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode();
        ListNode r = head;
        int sum = 0;
        int k = 0;
        while (p!=null||q!=null){
            sum = p.val + q.val+k;
            ListNode s = new ListNode(sum%10);
            k = sum/10;

            if (p == null){
                s = new ListNode((q.val+k)%10);
            }else{
                s = new ListNode((q.val+k)%10);
            }

            r.next = s;
            r = s;
        }
        return head;
    }

}
