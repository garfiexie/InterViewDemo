package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.HashMap;
import java.util.Map;

/**
 * 930. 和相同的二元子数组
 */
public class Solution930 {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count =0;
        int length = nums.length;
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<length;i++){
            pre = pre + nums[i];
            if (map.containsKey(pre-goal)){
                count+= map.get(pre - goal);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,0,1};
        System.out.println(numSubarraysWithSum(nums,2));
    }
}
