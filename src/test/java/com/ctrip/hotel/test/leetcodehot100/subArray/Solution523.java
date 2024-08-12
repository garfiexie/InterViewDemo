package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.HashMap;
import java.util.Map;

/*
523. 连续的子数组和
 */
public class Solution523 {
    // 前缀和
    public static boolean checkSubarraySum1(int[] nums, int k) {
        if (nums.length<=1){
            return false;
        }
        int length = nums.length;
        int pre = 0;
        boolean ans = false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<length;i++){
            pre = pre + nums[i];
            int temp = (pre%k + k ) % k;
            Integer orDefault = map.get(temp);
            if (orDefault==null){
                if ( temp==0 && i>=1){
                    return true;
                }
            } else {
                if (temp==0){
                    if (i-orDefault>=1){
                        return true;
                    }
                } else {
                    if (i-orDefault>=2){
                        return true;
                    }
                }
            }
            if (orDefault==null){
                map.put(temp,i);
            }
        }
        return ans;
    }

    // 前缀和 优化1
    public static boolean checkSubarraySum2(int[] nums, int k) {
        if (nums.length<=1){
            return false;
        }
        int length = nums.length;
        int pre = 0;
        boolean ans = false;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<length;i++){
            pre = (pre + nums[i]) % k;
            if (map.containsKey(pre)){
                Integer index = map.get(pre);
                if (i-index>=2){
                    return true;
                }
            } else {
                map.put(pre,i);
            }
        }
        return ans;
    }

    // 前缀和 优化2
    public static boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length<=1){
            return false;
        }
        int length = nums.length;
        int pre = 0;
        boolean ans = false;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<length;i++){
            pre = pre + nums[i];
            int temp = pre % k;
            if (map.containsKey(temp)){
                Integer index = map.get(temp);
                if (i-index>=2){
                    return true;
                }
            } else {
                map.put(temp,i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0};
        System.out.println(checkSubarraySum(nums,1));
    }
}
