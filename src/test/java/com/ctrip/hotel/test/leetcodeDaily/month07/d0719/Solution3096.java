package com.ctrip.hotel.test.leetcodeDaily.month07.d0719;

public class Solution3096 {
    public int minimumLevels(int[] possible) {
        int sum = 0;
        int leftSum = 0;
        for (int m : possible){
            int t = m==0 ? -1 : 1;
            sum+=t;
        }
        for (int i = 0; i < possible.length; i++) {
            int t = possible[i]==0 ? -1 : 1;
            leftSum+=t;
            if (leftSum>sum-leftSum ){
                return i== possible.length-1 ? -1 : i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution3096 solution3096 = new Solution3096();
        System.out.println(solution3096.minimumLevels(new int[]{1,1}));
    }
}
