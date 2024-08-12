package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution6_283 {
    public void moveZeroes(int[] nums) {
        if (nums==null){
            return;
        }
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        for (int k=j;k<nums.length;k++){
            nums[k]=0;
        }
    }

    public static void main(String[] args) {
        Solution6_283 solution6_283 = new Solution6_283();
        int[] nums = new int[]{0,1,0,3,12};
        solution6_283.moveZeroes(nums);
        for (int t : nums){
            System.out.println(t);
        }
    }
}
