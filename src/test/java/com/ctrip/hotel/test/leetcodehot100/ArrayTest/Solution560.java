package com.ctrip.hotel.test.leetcodehot100.ArrayTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为 K 的子数组
 */
public class Solution560 {

    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sumAmount = 0;
        int ans = 0;
        for (int t : nums){
            sumAmount+=t;
            ans+=map.getOrDefault(sumAmount-k,0);
            map.merge(sumAmount,1,Integer::sum);
        }
        return ans;
    }
}
