package com.ctrip.hotel.test.leetcodehot100.dptest;

import com.ctrip.hotel.test.leetcodehot100.listNodeDemoTest.ListNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 70. 爬楼梯
 * 已解答
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Solution70 {
    // 动态规划  超时
    public int climbStairs(int n) {
        return dfs(n);
    }

    private int dfs(int n) {
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        return dfs(n-1) + dfs(n-2);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        int count = in.nextInt();
//        int t = 0;
//        while(t <count){
//            list.add(in.nextInt());
//            t++;
//        }
//        list = list.stream().distinct().sorted().collect(Collectors.toList());
//        for(int i : list){
//            System.out.println(i);
//        }

        String s = "123456789";
        System.out.println(s.substring(0,8));
        s = s.substring(8,s.length());
        System.out.println(s);
    }
}
