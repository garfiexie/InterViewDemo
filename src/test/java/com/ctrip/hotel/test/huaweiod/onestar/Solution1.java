package com.ctrip.hotel.test.huaweiod.onestar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 数组最大N个数与最小N个数的和  1.数组, 排序
 */
public class Solution1 {
    public static int summaxNandMinN(int[] nums,int n){
        int ans = 0;
        List<Integer> collect = Arrays.stream(nums).boxed().distinct().sorted().collect(Collectors.toList());
        int length = collect.size();
        if (length<n * 2){
            return -1;
        }
        for (int i=0;i<n;i++){
            ans = ans + collect.get(i) + collect.get(length-1-i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,5,1,6,3};
        System.out.println(summaxNandMinN(nums,2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.nextLine();
        System.out.println("字符串：" + s);
    }
}
