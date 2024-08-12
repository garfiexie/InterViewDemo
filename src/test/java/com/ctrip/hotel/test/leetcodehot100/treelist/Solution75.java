package com.ctrip.hotel.test.leetcodehot100.treelist;

import java.util.HashMap;
import java.util.Map;

public class Solution75 {
    public void sortColors(int[] nums) {
        if (nums.length<=1){
            return;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int t : nums){
            Integer orDefault = map.getOrDefault(t, 0);
            map.put(t,orDefault+1);
        }
        Integer integer0 = map.getOrDefault(0,0);
        Integer integer1 = map.getOrDefault(1,0);
        for (int i=0;i<integer0;i++){
            nums[i]=0;
        }
        for (int i=integer0;i<integer0 + integer1;i++){
            nums[i]=1;
        }
        for (int i=integer0+integer1;i<nums.length;i++){
            nums[i]=2;
        }
    }

    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        int[] nums = new int[]{0,0};
        solution75.sortColors(nums);
        for (int t : nums){
            System.out.println(t);
        }
    }
}
