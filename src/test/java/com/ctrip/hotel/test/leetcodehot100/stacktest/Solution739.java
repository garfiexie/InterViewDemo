package com.ctrip.hotel.test.leetcodehot100.stacktest;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调栈方式
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i=0;i<length;i++){
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature>temperatures[stack.peek()]){
                int preIndex = stack.pop();
                ans[preIndex] = i-preIndex;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution739 solution739 = new Solution739();
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        int[] ints = solution739.dailyTemperatures(temperatures);
        for (int t : ints){
            System.out.println(t);
        }
    }
}
