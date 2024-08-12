package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 */
public class Solution234 {
    // 使用列表判断
    public boolean isPalindrome1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur!=null){
            list.add(cur.val);
            cur = cur.next;
        }
        int length = list.size();
        for (int i=0;i<length/2;i++){
            if (list.get(i) !=list.get(length-1-i)){
                return false;
            }
        }
        return true;
    }
    // 使用列表判断
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur!=null){
            list.add(cur.val);
            cur = cur.next;
        }
        int length = list.size();
        for (int i=0;i<length/2;i++){
            if (list.get(i) !=list.get(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
