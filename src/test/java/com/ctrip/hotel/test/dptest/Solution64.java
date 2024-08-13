package com.ctrip.hotel.test.dptest;

/**
 * 64. 最小路径和
 * 中等
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 && j==0){
                    continue;
                } else if (i==0){
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                } else if (j==0){
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i][j-1],grid[i-1][j]) + grid[i][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
}
