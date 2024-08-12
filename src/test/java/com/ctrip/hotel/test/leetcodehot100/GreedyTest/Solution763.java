package com.ctrip.hotel.test.leetcodehot100.GreedyTest;

import com.dianping.cat.kafka.common.protocol.types.Field;

import java.util.*;

/**
 * 763. 划分字母区间  贪心算法
 */

public class Solution763 {
    // 硬算
    public static List<Integer> partitionLabels1(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.toCharArray().length;i++){
            Integer count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i),count+1);
        }
        Set<Character> characterSet = new HashSet<>();
        for (int i=0;i<s.toCharArray().length;i++){
            characterSet.add(s.charAt(i));
            Integer count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i),count-1);

            Optional<Character> any = characterSet.stream().filter(p -> map.get(p) > 0).findAny();
            if (!any.isPresent()){
                ans.add(i);
                characterSet = new HashSet<>();
            }
        }
        List<Integer> ans1 = new ArrayList<>();
        ans1.add(ans.get(0)+1);
        for (int i=0;i<ans.size()-1;i++){
            ans1.add(ans.get(i+1) - ans.get(i));
        }
        return ans1;
    }

    // 硬算
    public static List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int start=0;
        int end=0;
        for (int i=0;i<s.length();i++){
            end = Math.max(end,map.get(s.charAt(i)));
            if (i==end){
                ans.add(end - start +1);
                start = end+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> list = partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(list);

    }
}
