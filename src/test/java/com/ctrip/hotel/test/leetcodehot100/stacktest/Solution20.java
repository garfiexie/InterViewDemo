package com.ctrip.hotel.test.leetcodehot100.stacktest;

import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Character peek;
        for (char c : s.toCharArray()){
            switch (c){
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()){
                        return false;
                    }
                    peek = stack.peek();
                    if ( '(' == peek){
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()){
                        return false;
                    }
                    peek = stack.peek();
                    if ('{' == peek){
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()){
                        return false;
                    }
                    peek = stack.peek();
                    if ( '[' == peek){
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.isValid("(])"));
    }
}
