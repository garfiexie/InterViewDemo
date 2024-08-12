package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution8_1822 {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int t : nums){
            if (t ==0){
                return 0;
            }
            if (t<0){
                count++;
            }
        }
        if (count%2>0){
            return -1;
        }
        return 1;
    }
}
