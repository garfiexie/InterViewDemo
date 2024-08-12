package com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest;

public class ListNodeDemo {

    public static void main(String[] args) {
        int[] nums = {5,3,2,4,1};
        ListNode node = initListNode(nums);
//        // 链表头增加元素
//        node = addNodeFirst(node,6);
//        // 链表尾增加元素
//        node = addNodeLast(node,3);
//        //链表删除元素
//        node = deleteNode(node,3);
        //链表修改元素
        node = updateNode(node,4,6);
        // 遍历链表
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    //更新元素
    private static ListNode updateNode(ListNode head, int oldVal, int newVal) {
        ListNode cur = head;
        while (cur !=null){
            if (cur.val == oldVal){
                cur.val = newVal;
            }
            cur = cur.next;
        }
        return head;
    }

    // 删除链表元素
    private static ListNode deleteNode(ListNode head, int i) {
        ListNode cur = head;
        if (head.val==i){
            head = cur.next;
        } else {
            while (cur.next!=null){
                if (cur.next.val==i){
                    cur.next = cur.next.next;
                    return head;
                }
                cur = cur.next;
            }
        }
        return head;
    }

    // 链表尾增加元素
    private static ListNode addNodeLast(ListNode head, int i) {
        ListNode cur = head;
        while (cur.next !=null){
            cur = cur.next;
        }
        ListNode last = new ListNode(i);
        cur.next = last;
        return head;
    }

    // 数组转链表
    private static ListNode initListNode(int[] nums) {
        if (nums.length==0){
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i=1;i< nums.length;i++){
            ListNode next = new ListNode(nums[i]);
            cur.next = next;
            cur = next;
        }
        return head;
    }

    // 链表头增加元素
    private static ListNode addNodeFirst(ListNode head,int a) {
        if (head==null){
            head = new ListNode(a);
            head.next = null;
        } else {
            ListNode newNode = new ListNode(a);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}
