package com.ctrip.hotel.test.leetcodehot100.ArrayTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 189. 轮转数组
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i=0;i<length;i++){
            int moveStep = (i + k) % length;
            nums[moveStep] = list.get(i);
        }
    }

    public static void main(String[] args) {
        Solution189 solution189 = new Solution189();
        int [] nums = new int[]{-1,-100,3,99};
        solution189.rotate(nums,2);
        for (int t : nums){
            System.out.println(t);
        }
    }
}
