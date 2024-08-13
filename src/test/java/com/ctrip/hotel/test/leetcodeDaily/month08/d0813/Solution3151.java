package com.ctrip.hotel.test.leetcodeDaily.month08.d0813;

/**
 * 3151. 特殊数组 I
 *
 * 如果数组的每一对相邻元素都是两个奇偶性不同的数字，则该数组被认为是一个 特殊数组 。
 *
 * Aging 有一个整数数组 nums。如果 nums 是一个 特殊数组 ，返回 true，否则返回 false。
 */
public class Solution3151 {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length==1){
            return true;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] %2 == nums[i+1]%2){
                return false;
            }
        }
        return true;
    }
}
