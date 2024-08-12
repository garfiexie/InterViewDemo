package com.ctrip.hotel.test.leetcodehot100.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 中等
 * 相关标签
 * 相关企业
 *
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */
public class Solution34 {
    // 方法一：循环遍历
    public int[] searchRange1(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i]==target){
                if (nums[0]==-1){
                    nums[0]=i;
                }
                nums[1] = i;
            }
        }
        return ans;
    }

    // 方法二：循环遍历优化
    public int[] searchRange2(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i]==target){
                if (nums[0]==-1){
                    nums[0]=i;
                }
                nums[1] = i;
            }
            // 优化循环数据
            if (nums[i]>target){
                break;
            }
        }
        return ans;
    }

    // 方法三：二分查找
    public static int[] searchRange3(int[] nums, int target) {
        int length = nums.length;
        int ans_left = -1;
        int ans_right = -1;
        if (nums==null || nums.length==0){
            return new int[]{ans_left,ans_right};
        }
        if ( nums[0]<=target && nums[length-1] >=target){
            int left = 0;
            int right = length-1;
            while (left<=right){
                int mid = left + (right - left) / 2;
                if (nums[mid] == target){
                    ans_left = mid;
                    right = mid-1;
                } else  if (nums[mid] > target){
                    right = mid-1;
                } else {
                    left = mid + 1;
                }
            }
            left = 0;
            right = length-1;
            while (left<=right){
                int mid = left + (right - left) / 2;
                if (nums[mid] == target){
                    ans_right = mid;
                    left = mid+1;
                }
                if (nums[mid] > target){
                    right = mid-1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return new int[]{ans_left, ans_right};
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        searchRange3(nums,8);
    }
}
