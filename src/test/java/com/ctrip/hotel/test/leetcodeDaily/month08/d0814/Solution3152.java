package com.ctrip.hotel.test.leetcodeDaily.month08.d0814;

/**
 * 3152. 特殊数组 II
 * 中等
 *
 * 如果数组的每一对相邻元素都是两个奇偶性不同的数字，则该数组被认为是一个 特殊数组 。
 *
 * 周洋哥有一个整数数组 nums 和一个二维整数矩阵 queries，对于 queries[i] = [fromi, toi]，请你帮助周洋哥检查子数组 nums[fromi..toi] 是不是一个 特殊数组 。
 *
 * 返回布尔数组 answer，如果 nums[fromi..toi] 是特殊数组，则 answer[i] 为 true ，否则，answer[i] 为 false 。
 */
public class Solution3152 {
    // 循环遍历 --超时
    public boolean[] isArraySpecial1(int[] nums, int[][] queries) {
        int m = queries.length;
        boolean[] ans = new boolean[m];
        for (int i = 0; i < m; i++) {
            ans[i] = true;
            int[] query = queries[i];
            for (int j=query[0];j<=query[1]-1;j++){
                if (nums[j]%2 == nums[j+1]%2){
                    ans[i] = false;
                }
            }
        }
        return ans;
    }

    // 前缀和
    public static boolean[] isArraySpecial2(int[] nums, int[][] queries) {
        int m = queries.length;
        boolean[] ans = new boolean[m];
        int[] sum_nums = new int[nums.length];
        sum_nums[0]=0;
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]%2 == nums[i-1]%2){
                sum+=1;
            }
            sum_nums[i] = sum;
        }
        for (int j=0;j< queries.length;j++){
            int[] query = queries[j];
            if (sum_nums[query[1]] == sum_nums[query[0]]){
                ans[j] = true;
            } else {
                ans[j] = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={3,4,1,2,6};
        int[][] queries = {{0,4}};
        isArraySpecial2(nums,queries);
    }
}
