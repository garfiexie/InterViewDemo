package com.ctrip.hotel.test.leetcodehot100.ArrayTest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 41. 缺失的第一个正数
 */
public class Solution41 {
    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=1;i<length+2;i++){
            map.put(i,1);
        }
        for (int t : nums){
            map.remove(t);
        }
        List<Integer> collect = map.keySet().stream().collect(Collectors.toList());
        Collections.sort(collect);
        return collect.get(0);
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }
}
