package com.ctrip.hotel.test.leetcodehot100.treelist;

/**
 * 101. 对称二叉树
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return middleTravel(root.left,root.right);
    }

    public boolean middleTravel(TreeNode left,TreeNode right){
        if (right==null && left==null){
            return true;
        }
        if (left==null || right==null){
            return false;
        }
        return left.val == right.val && middleTravel(left.left,right.right) && middleTravel(left.right,right.left);
    }
}
