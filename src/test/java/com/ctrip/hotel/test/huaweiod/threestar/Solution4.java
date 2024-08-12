package com.ctrip.hotel.test.huaweiod.threestar;

import java.util.Arrays;

public class Solution4 {
        public int countMaxMatching(int[] a, int[] b) {
            // 首先对数组a和b进行排序
            Arrays.sort(a);
            Arrays.sort(b);
            int n = a.length;

            // dp[i][j]表示在前i个a元素和前j个b元素中，最多有多少对满足a[i] > b[j]的匹配
            int[][] dp = new int[n + 1][n + 1];

            // 初始化dp数组
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    // 如果a[i-1] <= b[j-1]，那么我们不能将a[i-1]和b[j-1]匹配，所以dp[i][j] = dp[i-1][j]
                    dp[i][j] = dp[i - 1][j];

                    // 如果a[i-1] > b[j-1]，那么我们可以选择将a[i-1]和b[j-1]匹配，也可以选择不匹配
                    // 所以dp[i][j] = dp[i-1][j] + dp[i-1][j-1]
                    if (a[i - 1] > b[j - 1]) {
                        dp[i][j] += dp[i - 1][j - 1];
                    }
                }
            }

            // 找到最大的匹配数量
            int maxMatch = 0;
            for (int i = n; i >= 0; i--) {
                if (dp[n][i] > 0) {
                    maxMatch = i;
                    break;
                }
            }

            // 返回最大匹配数量对应的匹配方式的数量
            return dp[n][maxMatch];
        }

}
