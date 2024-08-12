package com.ctrip.hotel.test.leetcodeDaily.month07.d0716;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution0716_2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[]{0,0};
        int k =0;
        int l = 0;
        List<Integer> collect1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> collect2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        collect1.retainAll(collect2);
        if (collect1.size()>0){
            for (int t: nums1){
                if (collect1.contains(t)){
                    k++;
                }
            }
            for (int t: nums2){
                if (collect1.contains(t)){
                    l++;
                }
            }
            ans[0] = k;
            ans[1] = l;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution0716_2956 solution0716_2956 = new Solution0716_2956();
        int[] result = solution0716_2956.findIntersectionValues(new int[]{4,3,2,3,1},new int[]{2,2,5,2,3,6});
        for (int t : result){
            System.out.println(t);
        }
    }
}
