package com.ctrip.hotel.test.leetcodehot100.heapTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 347. 前 K 个高频元素
 */
public class Solution347 {
    // 暴力map
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for (int t : nums){
            if (map.containsKey(t)){
                Integer count = map.get(t);
                count++;
                map.put(t,count);
            } else {
                map.put(t,1);
            }
        }
        List<Map.Entry<Integer,Integer>> mapList = new ArrayList<>(map.entrySet());
        mapList.sort((o1, o2) -> o2.getValue()-o1.getValue());
        for (int i = 0; i < k; i++) {
            ans[i] = mapList.get(i).getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        Solution347 solution347 = new Solution347();
        System.out.println(solution347.topKFrequent(nums,3));
    }
}
