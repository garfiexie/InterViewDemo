package com.ctrip.hotel.test.dptest;

public class Solution279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i=1;i<=n;i++){
            int minCnt = Integer.MAX_VALUE;
            for (int j=1;j*j<=i;j++){
                minCnt = Math.min(minCnt,dp[i-j*j] +1);
            }
            dp[i] = minCnt;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution279 solution279 = new Solution279();
        System.out.println(solution279.numSquares(13));
    }
}
