package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class Solution19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode cur = head;
        while (cur!=null){
            length++;
            cur = cur.next;
        }
        n = n%length;
        int index = 0;
        if (n==length){
            cur = head;
            head = cur.next;
            return head;
        } else if (n==1){
            cur = head;
            ListNode prev = head;
            while (cur.next!=null){
                length++;
                prev = cur;
                cur = cur.next;
            }
            prev.next = null;
            return head;
        } else {
            int count = 1;
            cur = head;
            ListNode prev = head;
            while (cur!=null){
                if (count == length-n+1){
                    prev.next = cur.next;
                    return head;
                }
                count++;
                prev = cur;
                cur = cur.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next=l11;
        removeNthFromEnd(l1,1);
    }
}
