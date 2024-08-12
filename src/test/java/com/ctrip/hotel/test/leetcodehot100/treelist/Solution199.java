package com.ctrip.hotel.test.leetcodehot100.treelist;

import java.util.ArrayList;
import java.util.List;

/**
 * 199. 二叉树的右视图
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        dfs(root,listList,1);
        for (List<Integer> list : listList){
            int length = list.size();
            ans.add(list.get(list.size()-1));
        }
        return ans;
    }

    public void dfs(TreeNode node,List<List<Integer>> listList,int t){
        if (node==null){
            return;
        }
        if (listList.size()<t){
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            listList.add(list);
        } else {
            List<Integer> list = listList.get(t - 1);
            list.add(node.val );
            listList.set(t-1,list);
        }
        t++;
        dfs(node.left,listList,t);
        dfs(node.right,listList,t);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode4;
        Solution199 solution199 = new Solution199();
        System.out.println(solution199.rightSideView(treeNode1));
    }

}
