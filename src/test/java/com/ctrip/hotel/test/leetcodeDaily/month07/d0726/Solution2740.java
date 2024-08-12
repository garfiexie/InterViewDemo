package com.ctrip.hotel.test.leetcodeDaily.month07.d0726;

import java.util.Arrays;

public class Solution2740 {
    public static int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<nums.length-1;i++){
            ans = Math.min(ans,Math.abs(nums[i+1] - nums[i]));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100,1,10};
        System.out.println(findValueOfPartition(nums));
    }
}
