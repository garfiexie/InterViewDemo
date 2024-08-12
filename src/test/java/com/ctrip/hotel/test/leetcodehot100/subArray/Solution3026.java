package com.ctrip.hotel.test.leetcodehot100.subArray;

/**
 * 3026. 最大好子数组和
 */
public class Solution3026 {

    // 前缀和 + 双层循环  -->超时
    public static long maximumSubarraySum1(int[] nums, int k) {
        int length = nums.length;
        long ans = Long.MIN_VALUE;
        long[] preSum = new long[length+1];
        preSum[0]=0;
        for (int i=0;i<length;i++){
            preSum[i+1] = preSum[i] + nums[i];
          for (int j=i-1;j>=0;j--){
              while (Math.abs(nums[i]-nums[j])==k){
                  ans = Math.max(ans,preSum[i+1] - preSum[j]);
                  break;
              }
          }
        }
        return ans == Long.MIN_VALUE ? 0 : ans;
    }

    // 前缀和 + 优化
    public static long maximumSubarraySum(int[] nums, int k) {
        int length = nums.length;
        long ans = Long.MIN_VALUE;
        long[] preSum = new long[length+1];
        preSum[0]=0;
        for (int i=0;i<length;i++){
            preSum[i+1] = preSum[i] + nums[i];
            for (int j=i-1;j>=0;j--){
                while (Math.abs(nums[i]-nums[j])==k){
                    ans = Math.max(ans,preSum[i+1] - preSum[j]);
                    break;
                }
            }
        }
        return ans == Long.MIN_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{999999994,999999995};
        System.out.println(maximumSubarraySum(nums,18));
    }
}
