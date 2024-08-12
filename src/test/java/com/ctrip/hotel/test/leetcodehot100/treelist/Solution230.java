package com.ctrip.hotel.test.leetcodehot100.treelist;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 230. 二叉搜索树中第K小的元素
 */
public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        dfs(root,set);
        set.stream().sorted();
        return (int) set.toArray()[k-1];
    }

    public void dfs(TreeNode node,Set<Integer> set){
        if (node==null){
            return;
        }
        if (!set.contains(node.val)){
            set.add(node.val);
        }
        dfs(node.left,set);
        dfs(node.right,set);
    }
}
