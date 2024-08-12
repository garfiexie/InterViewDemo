package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为 K 的子数组  --前缀和
 */
public class Solution560_1 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int length = nums.length;
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<length;i++){
            pre = pre + nums[i];
            if (map.containsKey(pre-k)){
                count = count + map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution560_1 solution560_1 = new Solution560_1();
        int[] nums = new int[]{1,2,1,2,1};
        System.out.println(solution560_1.subarraySum(nums,3));
    }
}
