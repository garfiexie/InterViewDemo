package com.ctrip.hotel.test.leetcodehot100.graphTheory;

/**
 * 200. 岛屿数量
 */
public class Solution200 {
    public int numIslands(char[][] grid) {
        int num_islands = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < col; i1++) {
                if (grid[i][i1]==1){
                    num_islands++;
                    dfs(grid,i,i1);
                }
            }
        }
        return num_islands;
    }

    private void dfs(char[][] grid, int i, int i1) {
        if (!inArea(grid,i,i1)){
            return;
        }
        if (grid[i][i1]!=1){
            return;
        }
        grid[i][i1] = 2;
        dfs(grid,i,i1-1);
        dfs(grid,i,i1+1);
        dfs(grid,i+1,i1);
        dfs(grid,i-1,i1);
    }

    private boolean inArea(char[][] grid, int i, int i1) {
        return i>=0 && i< grid.length && i1>=0 && i1<grid[0].length;
    }
}
