package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution16_1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int [] t : accounts){
            int sum = 0;
            for (int x : t){
                sum+=x;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
