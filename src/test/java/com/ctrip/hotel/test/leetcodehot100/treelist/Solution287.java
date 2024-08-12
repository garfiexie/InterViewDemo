package com.ctrip.hotel.test.leetcodehot100.treelist;

import java.util.HashMap;
import java.util.Map;

public class Solution287 {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int t: nums){
            Integer orDefault = map.getOrDefault(t, 0);
            if (orDefault>0){
                return t;
            } else {
                map.put(t,1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution287 solution287 = new Solution287();
        int[] nums = new int[]{1,3,4,2,2};
        System.out.println(solution287.findDuplicate(nums));
    }
}
