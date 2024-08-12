package com.ctrip.hotel.test.leetcodehot100.matrix;

/**
 * 240. 搜索二维矩阵 II
 */
public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==target){
                    return true;
                } else if (matrix[i][j]>target){
                    n = j+1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Solution240 solution240 = new Solution240();
        System.out.println(solution240.searchMatrix(matrix,5));
    }
}
