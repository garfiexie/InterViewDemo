package com.ctrip.hotel.test.leetcodeDaily.month08.d0803;

import lombok.experimental.var;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 3143. 正方形中的最多点数
 */
public class Solution3143 {
    public static int maxPointsInsideSquare(int[][] points, String s) {
        // 定义初始化，
        int length = s.length(), secondMinValue = Integer.MAX_VALUE;
        int[] minValue = new int[26];
        Arrays.fill(minValue, Integer.MAX_VALUE);
        // 第一步，维护出最小切比雪夫距离，最小重复值
        for (int i = 0; i < length; i++) {
            int cur = s.charAt(i) - 'a';
            int distance = Math.max( Math.abs(points[i][0]), Math.abs(points[i][1]));
            if(distance < minValue[cur]){
                secondMinValue = Math.min(secondMinValue, minValue[cur]);
                minValue[cur] = distance;
            }else{
                secondMinValue = Math.min(secondMinValue, distance);
            }
        }
        // 第二步，统计最小重复之内的标签数量
        int ans = 0;
        for(int i : minValue){
            if(i < secondMinValue){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{10,-12},{-5,-4},{-7,15},{9,16}};
        String s = "dada";
        System.out.println(maxPointsInsideSquare(points,s));
    }
}
