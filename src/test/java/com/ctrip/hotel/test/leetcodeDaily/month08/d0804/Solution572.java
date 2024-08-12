package com.ctrip.hotel.test.leetcodeDaily.month08.d0804;

import com.ctrip.hotel.test.leetcodehot100.treelist.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 572. 另一棵树的子树
 */
public class Solution572 {
    List<TreeNode> treeNodeList = new ArrayList<>();
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        middleTravel(root,subRoot.val);
        if (treeNodeList.size()==0){
            return false;
        }
        for (TreeNode treeNode : treeNodeList){
            boolean flag = compareTreeNode(treeNode,subRoot);
            if (flag){
                return true;
            }
        }
        return false;
    }

    public boolean compareTreeNode(TreeNode node, TreeNode subRoot){
        if (node!=null && subRoot!=null){
            if (node.val!=subRoot.val){
                return false;
            }
        }
        if (node!=null && subRoot==null){
            return false;
        }
        if (node==null && subRoot!=null){
            return false;
        }
        if (node==null && subRoot==null){
            return true;
        }
        return compareTreeNode(node.left,subRoot.left) && compareTreeNode(node.right,subRoot.right);
    }


    public void middleTravel(TreeNode node, int subVal){
        if (node==null){
            return;
        }
        if (node.val == subVal) {
            treeNodeList.add(node);
        }
            middleTravel(node.left,subVal);
            middleTravel(node.right,subVal);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode111 = new TreeNode(1);
        treeNode1.left = treeNode11;
        Solution572 solution572 = new Solution572();
        System.out.println(solution572.isSubtree(treeNode1,treeNode111));
    }

}
