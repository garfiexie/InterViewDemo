package com.ctrip.hotel.test.lintcode.dc0712;

import java.util.Arrays;

/**
 * 1901 · 有序数组的平方
 */
public class Solution0712_1901 {
    public int[] squareArray(int[] a) {
        // write your code here
        int[] ans = new int[a.length];
        for (int i=0;i<a.length;i++){
            ans[i] = (int) Math.pow(a[i],2);
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution0712_1901 solution0712_1901 = new Solution0712_1901();
        int[]a = new int[]{-4,-1,0,3,10};
        int []b = solution0712_1901.squareArray(a);
        Arrays.stream(b).forEach(s-> System.out.println(s));
    }
}
