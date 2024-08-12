package com.ctrip.hotel.test.huaweiod.onestar;

import java.util.Arrays;
import java.util.Stack;

/**
 * /**
 *  * 在学校中，N个小朋友站成一队， 第i个小朋友的身高为height[i]，
 *  * 第i个小朋友可以看到的第一个比自己身高更高的小朋友j，那么j是i的好朋友(要求j > i)。
 *  * 请重新生成一个列表，对应位置的输出是每个小朋友的好朋友位置，如果没有看到好朋友，请在该位置用0代替。
 *  * 小朋友人数范围是 [0, 40000]。
 *  * 2.数组, 栈
 *  */

public class Solution2_1 {
    public static void findFriends(int[] height){
        int length = height.length;
        int[] friends = new int[length];
        Arrays.fill(friends,0);
        Stack<Integer> stack = new Stack<>();
        for (int i=length-1;i>=0;i++){
            int t = height[i];
            while (!stack.isEmpty() && t>height[stack.peek()]){
                stack.pop();
            }
            if (!stack.empty()){
                friends[i] = height[stack.peek()];
            }
            stack.push(i);
        }
    }
}
