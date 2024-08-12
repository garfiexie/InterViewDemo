package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution12_58 {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        String[] s1 = trim.split(" ");
        return s1[s1.length-1].length();
    }
}
