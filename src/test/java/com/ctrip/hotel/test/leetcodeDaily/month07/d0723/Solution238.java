package com.ctrip.hotel.test.leetcodeDaily.month07.d0723;

import java.util.ArrayList;
import java.util.List;

/**
 * 238. 除自身以外数组的乘积
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        List<Integer> zeroIndex = new ArrayList<>();
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroIndex.add(i);
            } else {
                result = result * nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (zeroIndex == null || zeroIndex.size() == 0) {
                answer[i] = result / nums[i];
            } else if (zeroIndex.contains(i) && zeroIndex.size() == 1) {
                answer[i] = result;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution238 solution238 = new Solution238();
        int[] nums = new int[]{0,2,3,4};
        int[] ints = solution238.productExceptSelf(nums);
        for (int t : ints) {
            System.out.println(t);
        }
    }
}
