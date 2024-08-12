package com.ctrip.hotel.test.leetcodehot100.BinarySearch;

/**
 * 33. 搜索旋转排序数组
 * 中等
 * 相关标签
 * 相关企业
 *
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 *
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 *
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题
 */
public class Solution33 {
    // 方法一：循环遍历
    public int search1(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    // 方法二：二分查找
    public static int search2(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length-1;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[0]<nums[mid]){
                if (nums[mid]>target && nums[left]<=target){
                    right = mid-1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[length-1]>=target && nums[mid] < target){
                    left = mid + 1;
                } else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2,3};
        System.out.println(search2(nums,8));
    }
}
