package com.ctrip.hotel.test.leetcodehot100.BinarySearch;

import java.util.Arrays;

/**
 * 74. 搜索二维矩阵
 *
 * 给你一个满足下述两条属性的 m x n 整数矩阵：
 *
 *     每行中的整数从左到右按非严格递增顺序排列。
 *     每行的第一个整数大于前一行的最后一个整数。
 *
 * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
 */
public class Solution74 {
    // 循环遍历
    public boolean searchMatrix1(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j]==target){
                    return true;
                }
                if (matrix[i][j]>target){
                    return false;
                }
            }
        }
        return false;
    }

    // 循环遍历 + 优化1
    public boolean searchMatrix2(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j]==target){
                    return true;
                }
                if (matrix[i][c-1]<target){
                    j=c-1;
                }
                if (matrix[i][j]>target){
                    return false;
                }
            }
        }
        return false;
    }

    // 二分查找-使用库函数
    public boolean searchMatrix3(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][0] <=target && matrix[i][c-1]>=target){
                    int[] matrix1 = matrix[i];
                    int i1 = Arrays.binarySearch(matrix1, target);
                    return i1>0 ? true : false;
                }
                j=c;
            }
        }
        return false;
    }

    // 二分查找-手动实现
    public boolean searchMatrix4(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][0] <=target && matrix[i][c-1]>=target){
                    int[] matrix1 = matrix[i];
                    int left = 0;
                    int right = matrix1.length-1;
                    while (left<=right){
                        int middle = left + (right - left) / 2;
                        if (matrix1[middle] == target){
                            return true;
                        }
                        if (matrix1[middle]>target){
                            right = middle-1;
                        } else {
                            left = middle+1;
                        }
                    }
                }
                j=c;
            }
        }
        return false;
    }
}
