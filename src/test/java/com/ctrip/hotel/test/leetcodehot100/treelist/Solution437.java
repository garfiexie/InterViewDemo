package com.ctrip.hotel.test.leetcodehot100.treelist;

import java.util.HashMap;
import java.util.Map;

/**
 * 437. 路径总和 III
 */
public class Solution437 {
    private int ans;

    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int s = 0;
        dfs(root,s,targetSum,map);
        return ans;
    }

    private void dfs(TreeNode node, int s, int targetSum, Map<Integer, Integer> map) {
        if (node==null){
            return;
        }
        s+= node.val;
        ans+=map.getOrDefault(s-targetSum,0);
        map.merge(s,1,Integer::sum);
        dfs(node.left, s, targetSum, map);
        dfs(node.right, s, targetSum, map);
        map.merge(s,-1,Integer::sum);
    }


}
