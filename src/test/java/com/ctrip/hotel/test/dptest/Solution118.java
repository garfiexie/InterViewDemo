package com.ctrip.hotel.test.dptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        list.add(Arrays.asList(1));
        for (int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>(i+1);
            row.add(1);
            for (int j=1;j<i;j++){
                row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        System.out.println(solution118.generate(5));
    }
}
