package com.ctrip.hotel.test.leetcodeDaily.month07.d0723;

import java.util.*;

/**
 * 41. 缺失的第一个正数
 */
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=1;i<n+3;i++){
            map.put(i,i);
        }
        for (int i=0;i<n;i++){
            if (map.get(nums[i]) !=null && map.get(nums[i])>0){
                map.remove(nums[i]);
            }
        }
        return (int)map.keySet().toArray()[0];
    }

    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();
        int[] nums = new int[]{};
        System.out.println(solution41.firstMissingPositive(nums));
    }
}
