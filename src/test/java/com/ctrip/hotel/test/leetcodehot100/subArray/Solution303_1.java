package com.ctrip.hotel.test.leetcodehot100.subArray;

/**
 * 区域和检索 - 数组不可变  --前缀和方法
 */
public class Solution303_1 {
    int[] ans;
    public Solution303_1(int[] nums) {
       int length = nums.length;
        ans = new int[length+1];
        ans[0]=0;
       for (int i=0;i<length;i++){
           ans[i+1] = ans[i] + nums[i];
       }
    }

    // 普通计算，每次都要循环遍历
    public int sumRange(int left, int right) {
        return ans[right+1] - ans[left];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,3,-5,2,-1};
        Solution303 solution303 = new Solution303(nums);
        System.out.println(solution303.sumRange(0,2));
    }
}
