package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodeSet = new HashSet<>();
        ListNode cur = head;
        while (cur!=null){
            if (listNodeSet.contains(cur)){
                return true;
            }
            listNodeSet.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
