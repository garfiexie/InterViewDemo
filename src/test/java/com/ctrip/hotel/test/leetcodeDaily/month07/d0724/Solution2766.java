package com.ctrip.hotel.test.leetcodeDaily.month07.d0724;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2766. 重新放置石块
 */
public class Solution2766 {
    // 方法1:超过时间限制
    public List<Integer> relocateMarbles1(int[] nums, int[] moveFrom, int[] moveTo) {
        List<Integer> ans = new ArrayList<>();
        int moveLenght = moveFrom.length;
        // 先完成替换
        for (int i=0;i<moveLenght;i++){
            int from = moveFrom[i];
            int to = moveTo[i];
            for (int j=0;j<nums.length;j++){
                if (nums[j]==from){
                    nums[j] = to;
                }
            }
        }
        ans = Arrays.stream(nums).boxed().distinct().sorted().collect(Collectors.toList());
        return ans;
    }

    // 方法2 优化遍历条件
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
           map.put(nums[i],0);
        }
        // 先完成替换
        for (int i=0;i<moveFrom.length;i++){
            int from = moveFrom[i];
            int to = moveTo[i];
            if (map.containsKey(from)){
                map.remove(from);
                map.put(to,0);
            }
        }
        ans = new ArrayList<>(map.keySet()).stream().sorted().collect(Collectors.toList());
        return ans;
    }

    public static void main(String[] args) {
        Solution2766 solution2766 = new Solution2766();
        List<Integer> list = solution2766.relocateMarbles(new int[]{1,6,7,8}, new int[]{1,7,2}, new int[]{2,9,5});
        System.out.println(list);
    }
}
