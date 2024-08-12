package com.ctrip.hotel.test.leetcodehot100.dptest;

public class Solution70_1 {
    // 动态规划->调整
    public int climbStairs(int n) {
        int p=1;
        int q=1;
        int ans = 0;
        for (int i =0;i<n-1;i++){
            ans = p + q;
            p = q;
            q = ans;
        }
        return ans;
    }
}
