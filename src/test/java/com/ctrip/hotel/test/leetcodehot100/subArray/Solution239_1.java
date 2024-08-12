package com.ctrip.hotel.test.leetcodehot100.subArray;

import java.util.Deque;
import java.util.LinkedList;

public class Solution239_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i=0;i<k;i++){
            while (!deque.isEmpty() && nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] ans = new int[length-k+1];
        ans[0] = nums[deque.peekFirst()];
        for (int i=k;i<length;i++){
            while (!deque.isEmpty() && nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst()<i-k){
                deque.pollFirst();
            }
            ans[i-k+1] = nums[deque.peekFirst()];
        }
        return ans;
    }
}
