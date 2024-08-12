package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> listNodeSet = new HashSet<>();
        ListNode cur = head;
        while (cur!=null){
            if (listNodeSet.contains(cur)){
                return cur;
            }
            listNodeSet.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
