package com.ctrip.hotel.test.leetcodeDaily.month08.d0812;

import java.util.Arrays;

/**
 * 3131. 找出与数组相加的整数 I
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 *
 * 给你两个长度相等的数组 nums1 和 nums2。
 *
 * 数组 nums1 中的每个元素都与变量 x 所表示的整数相加。如果 x 为负数，则表现为元素值的减少。
 *
 * 在与 x 相加后，nums1 和 nums2 相等 。当两个数组中包含相同的整数，并且这些整数出现的频次相同时，两个数组 相等 。
 *
 * 返回整数 x 。
 */
public class Solution3131 {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0]-nums1[0];
    }
}
