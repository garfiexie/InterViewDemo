package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;


public class Solution11_13 {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = convertNum(s.charAt(0));
        for (int i=1;i<s.length();i++){
            int num = convertNum(s.charAt(i));
            if (preNum<num){
                sum = sum - preNum;
            } else {
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum = sum + preNum;
        return sum;
    }

    public Integer convertNum(char c){
        int t = 1;
        switch (c){
            case 'I':
                t = 1;
                break;
            case 'V':
                t = 5;
                break;
            case 'X':
                t = 10;
                break;
            case 'L':
                t = 50;
                break;
            case 'C':
                t = 100;
                break;
            case 'D':
                t = 500;
                break;
            case 'M':
                t = 1000;
                break;
        }
        return t;
    }

    public static void main(String[] args) {
        Solution11_13 solution11_13 = new Solution11_13();
        System.out.println(solution11_13.romanToInt("III"));
    }
}
