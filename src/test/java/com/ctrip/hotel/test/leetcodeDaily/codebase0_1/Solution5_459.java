package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution5_459 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution5_459 solution5_459 = new Solution5_459();
        System.out.println(solution5_459.repeatedSubstringPattern("abcabcabd"));
    }
}
