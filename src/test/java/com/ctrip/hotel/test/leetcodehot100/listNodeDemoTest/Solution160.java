package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;


import java.util.HashSet;
import java.util.Set;

public class Solution160 {
    // 有问题
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        while (curA!=null){
           int val = curA.val;
           ListNode curB = headB;
           while (curB!=null){
               if (curB.val == val && curB.next.val == curA.next.val){
                   return curB;
               }
               curB = curB.next;
           }
            curA = curA.next;
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> listNodeSet = new HashSet<>();
        ListNode cur = headA;
        while (cur !=null){
            listNodeSet.add(cur);
            cur = cur.next;
        }
        cur = headB;
        while (cur !=null){
            if (listNodeSet.contains(cur)){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }


}
