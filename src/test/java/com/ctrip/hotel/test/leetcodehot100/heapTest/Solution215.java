package com.ctrip.hotel.test.leetcodehot100.heapTest;

import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k+1];
    }
}
