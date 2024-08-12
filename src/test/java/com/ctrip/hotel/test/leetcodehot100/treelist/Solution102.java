package com.ctrip.hotel.test.leetcodehot100.treelist;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        levelTravel(root,ans,1);
        return ans;
    }

    public void levelTravel(TreeNode node,List<List<Integer>> ans,int t){
        if (node==null){
            return;
        }
        if (ans.size()<t){
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            ans.add(list);
        } else {
            List<Integer> list = ans.get(t-1);
            list.add(node.val);
            ans.set(t-1,list);
        }
        t++;
        levelTravel(node.left,ans,t);
        levelTravel(node.right,ans,t);
    }

    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        treeNode3.left=treeNode9;
        treeNode3.right=treeNode20;
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode20.left=treeNode15;
        treeNode20.right=treeNode7;
        Solution102 solution102 = new Solution102();
        System.out.println(solution102.levelOrder(treeNode3));
    }
}
