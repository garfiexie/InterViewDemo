package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 206. 反转链表
 */
public class Solution206 {
    // 方式一
    public ListNode reverseList1(ListNode head) {
        if (head==null){
            return head;
        }
        List<ListNode> nodeList = new ArrayList<>();
        ListNode cur = head;
        while (cur !=null){
            nodeList.add(cur);
            cur = cur.next;
        }
        head = nodeList.get(nodeList.size()-1);
        cur = head;
        for (int i=nodeList.size()-1;i>=0;i--){
            cur.next = nodeList.get(i);
            cur = nodeList.get(i);
        }
        cur.next=null;
        return head;
    }
    // 方式二
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        while (cur !=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return head;
    }
}
