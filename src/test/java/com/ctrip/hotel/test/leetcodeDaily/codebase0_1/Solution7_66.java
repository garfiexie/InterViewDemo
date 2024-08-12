package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution7_66 {
    public int[] plusOne(int[] digits) {
        List<Integer> collect = Arrays.stream(digits).boxed().collect(Collectors.toList());
        int size = collect.size();
        collect.set(size-1,collect.get(size-1)+1);
        for (int i=size-1;i>=1;i--){
            if (collect.get(i)==10){
                collect.set(i,0);
                collect.set(i-1,collect.get(i-1)+1);
            }
        }
        if (collect.get(0)==10){
            collect.set(0,0);
            collect.add(0,1);
        }
        int[] nums = new int[collect.size()];
        for (int i=0;i<nums.length;i++){
            nums[i] = collect.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution7_66 solution7_66 = new Solution7_66();
        int[] digits = new int[]{9,9};
        int[] ints = solution7_66.plusOne(digits);
        for (int t : ints){
            System.out.println(t);
        }

    }
}
