package com.ctrip.hotel.test.leetcodehot100.stacktest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 394. 字符串解码
 */
public class Solution394 {

    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>(); // 存储数字
        Deque<String> stringStack = new ArrayDeque<>(); // 存储字符串
        String currentString = ""; // 当前解码字符串
        int k = 0; // 当前的倍数

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // 处理多位数
            } else if (ch == '[') {
                // 遇到 '['，将当前的字符串和数字推入各自的栈
                countStack.push(k);
                stringStack.push(currentString);
                currentString = ""; // 重置当前字符串
                k = 0; // 重置倍数
            } else if (ch == ']') {
                // 遇到 ']'，解码
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString); // 重复当前字符串
                }
                currentString = temp.toString(); // 更新当前字符串
            } else {
                // 如果是字母，直接加到当前字符串
                currentString += ch;
            }
        }

        return currentString;
    }


    public static void main(String[] args) {
        Solution394 solution394 = new Solution394();
        System.out.println(solution394.decodeString("3[a2[c]]"));
    }
}
