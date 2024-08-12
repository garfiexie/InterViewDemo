package com.ctrip.hotel.test.leetcodehot100.GreedyTest;

/**
 * 45. 跳跃游戏 II  贪心算法
 */
public class Solution45 {
    // 反向查找
    public static int jump1(int[] nums) {
        int ans = 0;
        int n = nums.length-1;
        while (n > 0) {
            for (int i=0;i<n;i++){
                if (n-i<=nums[i]){
                    n = i;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
    // 正向查找
    public static int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,0,2,0,4};
        System.out.println(jump(nums));
    }
}
