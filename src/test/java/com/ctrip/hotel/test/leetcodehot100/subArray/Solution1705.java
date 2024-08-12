package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 面试题 17.05. 字母与数字
 */
public class Solution1705 {
    public static String[] findLongestSubarray(String[] array) {
        int length = array.length;
        int startIndex = -1;
        int maxLength = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<length;i++){
            if (Character.isLetter(array[i].charAt(0))){
                sum--;
            } else {
                sum++;
            }
            if (map.containsKey(sum)){
                int firstIndex = map.get(sum);
                if (i-firstIndex>maxLength){
                    maxLength = i-firstIndex;
                    startIndex = firstIndex+1;
                }
            }
            map.put(sum,i);
        }
        if (maxLength == 0) {
            return new String[0];
        }
        String[] ans = new String[maxLength];
        System.arraycopy(array, startIndex, ans, 0, maxLength);
        return ans;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"42","10","O","t","y","p","g","B","96","H","5","v","P","52","25","96","b","L","Y","z","d","52","3","v","71","J","A","0","v","51","E","k","H","96","21","W","59","I","V","s","59","w","X","33","29","H","32","51","f","i","58","56","66","90","F","10","93","53","85","28","78","d","67","81","T","K","S","l","L","Z","j","5","R","b","44","R","h","B","30","63","z","75","60","m","61","a","5","S","Z","D","2","A","W","k","84","44","96","96","y","M"};
        String[] longestSubarray = findLongestSubarray(array);
        for (String s : longestSubarray){
            System.out.println(s);
        }

    }
}
