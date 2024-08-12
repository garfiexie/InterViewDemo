package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

import java.util.Arrays;

public class Solution9_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int sub = arr[1] - arr[0];
        for (int i=0;i<arr.length-1;i++){
            if (arr[i+1] - arr[i] != sub){
                return false;
            }
        }
        return true;
    }
}
