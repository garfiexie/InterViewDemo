package com.ctrip.hotel.test.leetcodehot100.treelist;

/**
 * 543. 二叉树的直径
 */
public class Solution543 {
    int max = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        int sum = 0;
        if (root==null){
            return 0;
        }
        middleTravel(root.left,0);
        sum = sum + max;
        max = 1;
        middleTravel(root.right,0);
        sum = sum + max;
        return sum;
    }

    public void middleTravel(TreeNode node,int t){
        if (node==null){
            max = Math.max(max,t);
            return;
        }
        t++;
        middleTravel(node.left,t);
        middleTravel(node.right,t);
    }

}
