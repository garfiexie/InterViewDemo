package com.ctrip.hotel.test.leetcodehot100.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix==null){
            return ans;
        }
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        int maxCircel = matrix.length * matrix[0].length;
        while (maxCircel>=1){
            for (int i=left;i<=right && maxCircel>=1;i++){
                ans.add(matrix[top][i]);
                maxCircel--;
            }
            top++;
            for (int i=top;i<=bottom && maxCircel>=1;i++){
                ans.add(matrix[i][right]);
                maxCircel--;
            }
            right--;
            for (int i=right;i>=left &&maxCircel>=1;i--){
                ans.add(matrix[bottom][i]);
                maxCircel--;
            }
            bottom--;
            for (int i=bottom;i>=top &&maxCircel>=1;i--){
                ans.add(matrix[i][left]);
                maxCircel--;
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Solution54 solution54 = new Solution54();
        System.out.println(solution54.spiralOrder(matrix));
    }
}
