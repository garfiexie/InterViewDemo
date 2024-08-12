package com.ctrip.hotel.test.leetcodehot100.BinarySearch;

import java.util.Arrays;

/**
 * 35. 搜索插入位置
 */
public class Solution35 {
    // 循环遍历
    public int searchInsert1(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (num==target){
                return i;
            } else if (num>target){
                return i;
            }
        }
        return length;
    }

    // 注意：只能在没有重复元素的时候使用
    // 如果 nums 有多个值为 target 的数，返回值不一定是第一个 >= target 的数的下标
    public int searchInsert2(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        return i>=0 ? i : -i-1;
    }

    // 二分查找
    public static int searchInsert3(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length-1;
        while (left<=right){
            int middle = left + (right-left) / 2 ;
            if (nums[middle]==target){
                return middle+1;
            }
            if (nums[middle] > target){
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        searchInsert3(nums,3);
    }




}
