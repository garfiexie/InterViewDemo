package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

public class Solution15_657 {
    public boolean judgeCircle(String moves) {
        int[] ans = new int[]{0,0};
        boolean flag = false;
        for (char c : moves.toCharArray()){
            convertMove(c,ans);
        }
        if (ans[0]==0 && ans[1]==0){
            flag = true;
        }
        return flag;
    }

    public void convertMove(char c,int[] ans){
        switch (c){
            case 'R':
                ans[1]++;
                break;
            case 'L':
                ans[1]--;
                break;
            case 'U':
                ans[0]++;
                break;
            case 'D':
                ans[0]--;
                break;
        }
    }
}
