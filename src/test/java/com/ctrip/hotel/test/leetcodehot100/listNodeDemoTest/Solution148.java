package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

/**
 * 148. 排序链表
 */
public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode cur = head;
        int count = 0;
        while (cur!=null){
            count++;
            cur = cur.next;
        }
        for (int i=0;i<count;i++){
            cur = head;
            if (cur.next!=null && cur.next.val <head.val){
                head = cur.next;
            }
        }
        return null;
    }
}
