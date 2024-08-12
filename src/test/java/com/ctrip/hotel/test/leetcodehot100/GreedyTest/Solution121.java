package com.ctrip.hotel.test.leetcodehot100.GreedyTest;

/**
 * 121. 买卖股票的最佳时机
 */
public class Solution121 {
    // 贪心算法
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i=1;i<prices.length;i++){
            max = Math.max(max,prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();
        System.out.println(solution121.maxProfit(new int[]{7,6,4,3,1}));
    }
}
