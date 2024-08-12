package com.ctrip.hotel.test.leetcodehot100.treelist;

/**
 * 104. 二叉树的最大深度
 */
public class Solution104 {
    int maxNum = 1;
    public int maxDepth(TreeNode root) {
        int deepLength = 1;
        middlePart(root,deepLength);
        return maxNum;
    }

    public void middlePart(TreeNode node,int deepLength){
        if (node==node){
            maxNum = Math.max(maxNum,deepLength);
            return;
        }
        deepLength++;
        middlePart(node.left,deepLength);
        middlePart(node.right,deepLength);
    }
}
