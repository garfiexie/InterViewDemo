package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

public class BasicDoubleLink {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        DoubleNode node = initDoubleLinkedList(a);
    }

    private static DoubleNode initDoubleLinkedList(int[] a) {
        DoubleNode head = null;
        DoubleNode node5 = new DoubleNode(a[5]);
        DoubleNode node4 = new DoubleNode(a[4]);
        DoubleNode node3 = new DoubleNode(a[3]);
        DoubleNode node2 = new DoubleNode(a[2]);
        DoubleNode node1 = new DoubleNode(a[1]);
        DoubleNode node0 = new DoubleNode(a[0]);
        head = node0;
        // 后一个元素
        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node4;
        // 前一个元素
        node0.prev=null;
        node1.prev=node0;
        node2.prev=node1;
        node3.prev=node2;
        node4.prev=node3;
        node5.prev=node4;
        return head;
    }
}
