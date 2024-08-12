package com.ctrip.hotel.test.leetcodehot100.subArray;

/**
 * 303. 区域和检索 - 数组不可变
 */
public class Solution303 {
    private int[] ints = null;
    public Solution303(int[] nums) {
        ints = nums;
    }

    // 普通计算，每次都要循环遍历
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i=left;i<=right;i++){
            sum+=ints[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,3,-5,2,-1};
        Solution303 solution303 = new Solution303(nums);
        System.out.println(solution303.sumRange(0,2));
    }
}
