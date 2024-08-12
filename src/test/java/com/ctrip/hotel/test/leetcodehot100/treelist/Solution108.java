package com.ctrip.hotel.test.leetcodehot100.treelist;

/**
 * 108. 将有序数组转换为二叉搜索树  中序遍历
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0, nums.length);
    }

    public TreeNode dfs(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int middle = left + (right - left) / 2  ;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = dfs(nums,left,middle-1);
        root.right = dfs(nums,middle+1,right);
        return root;
    }
}
