package com.ctrip.hotel.test.leetcodehot100.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 73. 矩阵置零
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
