package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution1_1768 {

    // 方法一
    public String mergeAlternately1(String word1, String word2) {
        String ans = "";
        String end = "";
        if (word1.length()<word2.length()){
            end = word2.substring(word1.length(),word2.length());
        } else {
            end = word1.substring(word2.length(),word1.length());
        }
        for (int i=0;i<Math.min(word1.length(),word2.length());i++){
            ans = ans + word1.charAt(i) + word2.charAt(i);
        }
        ans =ans + end;
        return ans;
    }

    // 方法二
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        StringBuilder builder = new StringBuilder();
        while (i<word1.length() || j<word2.length()){
            if (i<word1.length()){
                builder.append(word1.charAt(i));
                i++;
            }
            if (j<word2.length()){
                builder.append(word2.charAt(j));
                j++;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution1_1768 solution1_1768 = new Solution1_1768();
        System.out.println(solution1_1768.mergeAlternately("abcee","pqrt"));
    }
}
