package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

/**
 * 构建链表 最初版本
 */
public class BasicOneLink {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        OneNode oneNode = initLinkedListNode(a);
        System.out.println(oneNode);
        while (oneNode!=null){
            System.out.println(oneNode.val);
            oneNode = oneNode.next;
        }
    }

    private static OneNode initLinkedListNode(int[] a) {
        OneNode head = null;
        OneNode oneNode5 = new OneNode(a[5]);
        OneNode oneNode4 = new OneNode(a[4]);
        OneNode oneNode3 = new OneNode(a[3]);
        OneNode oneNode2 = new OneNode(a[2]);
        OneNode oneNode1 = new OneNode(a[1]);
        OneNode oneNode0 = new OneNode(a[0]);
        head = oneNode0;
        oneNode0.next = oneNode1;
        oneNode1.next = oneNode2;
        oneNode2.next = oneNode3;
        oneNode3.next = oneNode4;
        oneNode4.next = oneNode5;
        return head;
    }
}
