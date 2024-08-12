package com.ctrip.hotel.test.lintcode.dc0712;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 244 · 删除字符
 */
public class Solution0712_244 {
    public String deleteChar(String str, int k) {
        // Write your code here.
        if(str == null || str.length() < k) {
            return str;
        }
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        int deleteCount = len - k;
        char[] ch = str.toCharArray();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && stack.peek() > ch[i] && deleteCount > 0) {
                stack.pop();
                deleteCount--;
            }
            stack.push(ch[i]);
        }

        while (deleteCount > 0) {
            stack.pop();
            deleteCount--;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Solution0712_244 solution0712_244 = new Solution0712_244();
        System.out.println(solution0712_244.deleteChar("edcba",2));;
    }
}
