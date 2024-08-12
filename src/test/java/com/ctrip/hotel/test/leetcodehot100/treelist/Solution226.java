package com.ctrip.hotel.test.leetcodehot100.treelist;

/**
 * 226. 翻转二叉树
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        middleTravel(root);
        return root;
    }

    private void middleTravel(TreeNode root) {
        if (root==null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        middleTravel(root.left);
        middleTravel(root.right);
    }
}
