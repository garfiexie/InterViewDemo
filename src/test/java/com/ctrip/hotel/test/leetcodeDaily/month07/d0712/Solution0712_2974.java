package com.ctrip.hotel.test.leetcodeDaily.month07.d0712;

import java.util.Arrays;

/**
 * 2974. 最小数字游戏
 */
public class Solution0712_2974 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[]arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            arr[i]  = i%2==0 ? nums[i+1]:nums[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution0712_2974 solution0712_2974 = new Solution0712_2974();
        int[] nums = new int[]{5,4,2,3};
        int[]arr = solution0712_2974.numberGame(nums);
        for (int a : arr){
            System.out.println(a);
        }
    }
}
