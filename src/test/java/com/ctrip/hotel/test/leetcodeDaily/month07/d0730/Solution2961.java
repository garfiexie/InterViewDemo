package com.ctrip.hotel.test.leetcodeDaily.month07.d0730;

import java.util.ArrayList;
import java.util.List;

/**
 * 2961. 双模幂运算  --技巧：快速幂
 */
public class Solution2961 {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < variables.length; i++) {
            int[] variable = variables[i];
            int i1=1;
            int variable0 = variable[0];
            for (int j=0;j<variable[1];j++){
                i1 = i1 * variable0;
                i1 = i1 % 10;
            }
            int temp = 1;
            int variable3 = variable[3];
            for (int k=0;k<variable[2];k++){
                temp = temp * i1;
                temp = temp%variable3;
            }
            if (temp ==target){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] variable = {55,19,87,22};
        int i1 = (int) (Math.pow(variable[0]%10, variable[1]) % 10);
        int i2 = (int) (Math.pow(i1,variable[2]) %variable[3]);
        System.out.println(i2);
    }
}
