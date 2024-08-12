package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution4_242 {
    // 方法一
    public boolean isAnagram1(String s, String t) {
        if (s.length() !=t.length()){
            return false;
        }
        int[] ans = new int[26];
        int i =0;
        while (i<s.length()){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
            i++;
        }
        for (int e : ans){
            if (e!=0){
                return false;
            }
        }
        return true;
    }

    // 方法二
    public boolean isAnagram(String s, String t) {
        if (s.length() !=t.length()){
            return false;
        }
        int[] ans = new int[26];
        for (char c : s.toCharArray()){
            ans[c-'a']++;
        }
        for (char d : t.toCharArray()){
            ans[d-'a']--;
            if (ans[d-'a']<0){
                return false;
            }
        }
        for (int e : ans){
            if (e!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution4_242 solution4_242 = new Solution4_242();
        System.out.println(solution4_242.isAnagram("rat","car"));
    }
}
