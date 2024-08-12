package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

/**
 * 2. 两数相加
 */
public class Solution2 {
    //先两数相加，然后再倒过来 --long超限
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (l1!=null){
            s1.append(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            s2.append(l2.val);
            l2 = l2.next;
        }
        long i1 = Long.valueOf(s1.reverse().toString());
        long i2 = Long.valueOf(s2.reverse().toString());
        String ansi = String.valueOf(i1 + i2);
        int length = ansi.length();
        ListNode head = new ListNode(Integer.valueOf(String.valueOf(ansi.charAt(length-1))));
        ListNode cur = head;
        for (int i=length-2;i>=0;i--){
            ListNode newNode = new ListNode(Integer.valueOf(String.valueOf(ansi.charAt(i))));
            cur.next = newNode;
            cur = newNode;
        }
        return head;
    }

    //使用链表操作
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        while (l1!=null || l2!=null){
            int n1 = l1!=null ? l1.val : 0;
            int n2 = l2!=null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head==null){
                head = tail = new ListNode(sum %10);
            } else {
                tail.next = new ListNode(sum %10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }
            if (carry>0){
                tail.next = new ListNode(carry);
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(9);
        l1.next=l11;
        l11.next=l12;
        l12.next=null;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(9);
        l2.next=l21;
        l21.next=l22;
        l22.next=l23;
        addTwoNumbers(l1,l2);
    }
}
