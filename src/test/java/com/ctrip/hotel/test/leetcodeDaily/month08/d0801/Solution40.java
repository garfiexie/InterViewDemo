package com.ctrip.hotel.test.leetcodeDaily.month08.d0801;

import java.util.Arrays;

/**
 * LCP 40. 心算挑战
 */
public class Solution40 {
    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int length = cards.length;
        int sum = 0;
        for (int i=length-cnt;i<length;i++){
            sum+=cards[i];
        }
        if (sum%2==0){
            return sum;
        }
        int x = cards[length-cnt];
        int ans = replaceSum(cards,cnt,sum,x);
        for (int i=length-cnt+1;i<length;i++){
            if (cards[i]%2 !=x%2){
                ans = Math.max(ans,replaceSum(cards,cnt,sum,cards[i]));
                break;
            }
        }
        return ans;
    }

    private int replaceSum(int[] cards, int cnt, int sum, int x) {
        for (int i= cards.length-cnt-1;i>=0;i--){
            if (cards[i]%2 !=x%2){
                return sum-x + cards[i];
            }
        }
        return 0;
    }
}
