package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution18_1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i=0;i<n;i++){
            int[] row = mat[i];
            for (int j=0;j<n;j++){
                if (i==j){
                    sum+=mat[i][j];
                } else if (i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
