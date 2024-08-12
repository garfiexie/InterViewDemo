package com.ctrip.hotel.test.leetcodeDaily.month07.d0711;

/**
 * 53. 最大子数组和
 */
public class Solution0711_53 {
    public int maxSubArray(int[] nums) {

        int pre = 0;
        int maxAns = nums[0];
        for (int x : nums){
            pre = Math.max(pre + x,x);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        Solution0711_53 solution0711_53 = new Solution0711_53();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution0711_53.maxSubArray(nums));
    }
}
