package com.ctrip.hotel.test.leetcodehot100.treelist;

public class Solution31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int j=nums.length-1;
            while (j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i);
    }

    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int[] nums = new int[]{1,3,2};
        solution31.nextPermutation(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums,int i){
        int left = i+1;
        int right = nums.length-1;
        while (left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}
