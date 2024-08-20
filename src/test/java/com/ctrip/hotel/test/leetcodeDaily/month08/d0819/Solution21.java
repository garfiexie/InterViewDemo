package com.ctrip.hotel.test.leetcodeDaily.month08.d0819;

import com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest.ListNode;

/**
 * 21. 合并两个有序链表
 * 简单
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            return null;
        }
        if (list2==null){
            return null;
        }
        ListNode head = new ListNode(11);
        ListNode tail = head;
        while (list1!=null && list2!=null){
            if (list1.val<= list2.val){
                tail.next=list1;
                list1 = list1.next;
            } else {
                tail.next=list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1!=null? list1 : list2;
        return head.next;
    }
}
