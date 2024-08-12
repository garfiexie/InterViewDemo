package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.HashMap;
import java.util.Map;

/**
 *974. 和可被 K 整除的子数组
 */
public class Solution974 {
    // 方法一：前缀和 + 双重遍历 -->超时
    public static int subarraysDivByK1(int[] nums, int k) {
        int count = 0;
        int lenght = nums.length;
        int[] pre = new int[lenght+1];
        pre[0]=0;
        for (int i=0;i<lenght;i++){
            pre[i+1] = pre[i] + nums[i];
        }
        for (int j=0;j<pre.length-1;j++){
            for (int m=j+1;m<pre.length;m++){
                if ((pre[m] - pre[j]) % k ==0){
                    count++;
                }
            }
        }
        return count;
    }

    // 方法二：前缀和
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int t : nums){
            pre = pre + t;
            int temp = (pre%k + k) % k;
            int tempCount = map.getOrDefault(temp,0);
            count+=tempCount;
            map.put(temp,tempCount+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,9};
        System.out.println(subarraysDivByK(nums,2));
        System.out.println(-5%2);
    }
}
