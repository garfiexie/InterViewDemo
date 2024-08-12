package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution10_896 {
    public boolean isMonotonic(int[] nums) {
        int t = nums[nums.length-1] - nums[0];
        for (int i=0;i<nums.length-1;i++){
            if (t>0){
                if (nums[i+1]<nums[i]){
                    return false;
                }
            } else {
                if (nums[i+1]>nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
