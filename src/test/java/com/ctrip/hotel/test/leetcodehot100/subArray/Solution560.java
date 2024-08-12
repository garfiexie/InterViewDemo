package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为 K 的子数组  --子串
 */
public class Solution560 {
    // 方法一 暴力求解
    public static int subarraySum1(int[] nums, int k) {
        int length = nums.length;
        int count = 0;
        for (int i=0;i<length;i++){
            int sum = 0;
            for (int j=i;j>=0;j--){
                sum+=nums[j];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    // 方法二 前缀和 + 哈希表优化
    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        int count = 0;
        int length = nums.length;
        map.put(0,1);
        for (int i=0;i<length;i++){
            preSum+=nums[i];
            if (map.containsKey(preSum-k)){
                count+=map.get(preSum-k);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,-1,0};
        System.out.println(subarraySum(nums,0));
    }
}
