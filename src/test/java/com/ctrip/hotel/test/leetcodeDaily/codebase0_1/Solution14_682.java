package com.ctrip.hotel.test.leetcodeDaily.codebase0_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution14_682 {

    // 方式一
    public int calPoints1(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (String s : operations){
            switch (s){
                case "C":
                    Integer integer1 = list.get(list.size() - 1);
                    list.remove(integer1);
                    sum= sum - integer1;
                    break;
                case "D":
                    Integer integer = list.get(list.size() - 1);
                    list.add(integer*2);
                    sum+=integer*2;
                    break;
                case "+":
                    int length = list.size();
                    int score1 = list.get(length-1) + list.get(length-2);
                    list.add(score1);
                    sum = sum + score1;
                    break;
                default:
                    int score2 = Integer.parseInt(s);
                    list.add(score2);
                    sum = sum + score2;
                    break;
            }
        }
        return sum;
    }

    // 方式二
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String s : operations){
            switch (s){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int t = stack.peek();
                    stack.push(t * 2);
                    break;
                case "+":
                    int m = stack.pop();
                    int n = m + stack.peek();
                    stack.push(m);
                    stack.push(n);
                    break;
                default:
                    int score2 = Integer.parseInt(s);
                    stack.push(score2);
                    break;
            }
        }
        while (!stack.isEmpty()){
            sum = sum + stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution14_682 solution14_682 = new Solution14_682();
        String[] operations = new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(solution14_682.calPoints(operations));
    }
}
