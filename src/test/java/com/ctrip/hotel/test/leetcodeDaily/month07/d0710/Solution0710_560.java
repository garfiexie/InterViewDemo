package com.ctrip.hotel.test.leetcodeDaily.month07.d0710;

public class Solution0710_560 {

    public int subarraySum(int[] nums, int k) {
        int count =0;
        for (int start =0;start<nums.length;start++){
            int sum = 0;
            for (int end=start;end>=0;--end){
                sum+=nums[end];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution0710_560 solution0710_560 = new Solution0710_560();
        int[] nums = new int[]{1,1,1};
        System.out.println(solution0710_560.subarraySum(nums,2));
    }
}
