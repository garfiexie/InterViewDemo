package com.ctrip.hotel.test.leetcodehot100.treelist;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 */
public class Solution94 {
    // 递归方式
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        middleTraval(root,ans);
        return ans;
    }

    public void middleTraval(TreeNode root,List<Integer> ans){
        if (root==null){
            return;
        }
        middleTraval(root.left,ans);
        ans.add(root.val);
        middleTraval(root.right,ans);
    }

    // 迭代

}
