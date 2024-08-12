package com.ctrip.hotel.test.leetcodeDaily.month08.d0802;

import java.util.Arrays;

/**
 * 给你一个二维 boolean 矩阵 grid 。
 *
 * 请你返回使用 grid 中的 3 个元素可以构建的 直角三角形 数目，且满足 3 个元素值 都 为 1 。
 *
 * 注意：
 *
 *     如果 grid 中 3 个元素满足：一个元素与另一个元素在 同一行，同时与第三个元素在 同一列 ，那么这 3 个元素称为一个 直角三角形 。这 3 个元素互相之间不需要相邻。
 */
public class Solution3128 {
    public static long numberOfRightTriangles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] colSum = new int[m];
        for (int i=0;i<n;i++){
            for (int i1 = 0; i1 < m; i1++) {
                colSum[i1]+= grid[i][i1];
            }
        }
        long ans =0;
        for (int i=0;i<n;i++){
            int[] ints = grid[i];
            int sum = Arrays.stream(ints).sum();
            for (int j=0;j<m;j++){
                if (grid[i][j]==1){
                    ans = ans + (sum-1) * (colSum[j]-1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,0,1},{1,0,0},{1,0,0}};
        System.out.println(numberOfRightTriangles(grid));
    }
}
