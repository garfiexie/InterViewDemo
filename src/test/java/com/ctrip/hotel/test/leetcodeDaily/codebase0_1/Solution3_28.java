package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution3_28 {

    // 方法一
    public int strStr1(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (m<n){
            return -1;
        } else if (m == n) {
            if (haystack.equalsIgnoreCase(needle)){
                return 0;
            }
            return -1;
        } else {
            char[] chars = needle.toCharArray();
            for (int i=0;i<m;i++){
                if (haystack.charAt(i) == chars[0]){
                    String s = "";
                    if (i+n<m){
                        s = haystack.substring(i,i + n);
                    } else {
                        s = haystack.substring(i,m);
                    }
                    if (s.equalsIgnoreCase(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    // 方法二
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution3_28 solution3_28 = new Solution3_28();
        System.out.println(solution3_28.strStr("mississippi","issipi"));
    }
}
