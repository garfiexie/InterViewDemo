package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

import java.util.Arrays;

public class Solution2_389 {
    // 方法一
    public char findTheDifference1(String s, String t) {
        if (s.length()==0){
            return t.charAt(0);
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        for (int i=0;i<chars.length;i++){
            if (chars[i] !=chars1[i]){
                return chars1[i];
            }
        }
        return chars1[chars1.length-1];
    }

    // 方法二
    public char findTheDifference2(String s, String t) {
        return (char) (t.codePoints().sum() - s.codePoints().sum());
    }

    // 方法三
    public char findTheDifference(String s, String t) {
        int[] ans = new int[26];
        for (char c : s.toCharArray()){
            ans[c - 'a']++;
        }
        for (char m : t.toCharArray()){
            ans[m-'a']--;
            if (ans[m-'a']<0){
                return m;
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        Solution2_389 solution2_389 = new Solution2_389();
        System.out.println(solution2_389.findTheDifference("abcd","abcde"));
    }
}
