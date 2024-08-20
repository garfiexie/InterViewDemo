package com.ctrip.hotel.test.leetcodeDaily.month08.d0815;

import java.util.Arrays;
import java.util.List;

/**
 * 3148. 矩阵中的最大得分
 * 中等
 *
 * 给你一个由 正整数 组成、大小为 m x n 的矩阵 grid。你可以从矩阵中的任一单元格移动到另一个位于正下方或正右侧的任意单元格（不必相邻）。从值为 c1 的单元格移动到值为 c2 的单元格的得分为 c2 - c1 。
 *
 * 你可以从 任一 单元格开始，并且必须至少移动一次。
 *
 * 返回你能得到的 最大 总得分。
 */
public class Solution3148 {
    public static int maxScore(List<List<Integer>> grid) {
        int n = grid.get(0).size();
        int[] dp = new int[n + 1];
        int res = Integer.MIN_VALUE;
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (List<Integer> row : grid) {
            dp[0] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int x = row.get(j);
                int mn = Math.min(dp[j], dp[j + 1]);
                res = Math.max(res, x - mn);
                dp[j + 1] = Math.min(x, mn);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(9,5,7,3),Arrays.asList(8,9,6,1),Arrays.asList(6,7,14,3),Arrays.asList(2,5,3,1));
        System.out.println(maxScore(grid));
    }
}
