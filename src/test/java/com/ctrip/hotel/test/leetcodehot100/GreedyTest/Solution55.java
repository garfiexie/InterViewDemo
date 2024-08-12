package com.ctrip.hotel.test.leetcodehot100.GreedyTest;

/**
 * 55. 跳跃游戏
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        if (nums.length==1){
            return true;
        }
        int max = 0;
        int n = nums.length;
        for (int i=0;i<n-1;i++){
            max = Math.max(max-1,nums[i]);
            if (max==0){
                return false;
            }
        }
        if (max<=0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution55 solution55 = new Solution55();
        int[] nums = new int[]{0,2,3};
        System.out.println(solution55.canJump(nums));
    }
}
