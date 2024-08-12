package com.ctrip.hotel.test.leetcodeDaily.month07.d0730;

/**
 * 50. Pow(x, n)  快速幂
 */
public class Solution50 {
    public double myPow(double x, int n) {
        long N = n;
        return N>=0 ? quickMul(x, (int) N): 1.0/quickMul(x, (int) -N);
    }

    public double quickMul(double x, int N){
        if (N==0){
            return 1.0;
        }
        double y = quickMul(x,N/2);
        return N%2==0 ? y * y : y*y*x;
    }
}
