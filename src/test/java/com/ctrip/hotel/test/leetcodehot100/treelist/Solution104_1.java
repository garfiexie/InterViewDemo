package com.ctrip.hotel.test.leetcodehot100.treelist;

/**
 * 104. 二叉树的最大深度
 */
public class Solution104_1 {
    // 递归方式
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    //
    private int dfs(TreeNode node) {
        if (node==null){
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        return Math.max(left,right) + 1;
    }
}
