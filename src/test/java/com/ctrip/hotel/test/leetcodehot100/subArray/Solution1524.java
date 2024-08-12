package com.ctrip.hotel.test.leetcodehot100.subArray;

/**
 * 1524. 和为奇数的子数组数目  子数组--前缀和
 */
public class Solution1524 {
    // 双重循环，超时
    public static int numOfSubarrays1(int[] arr) {
        int count=0;
        int length = arr.length;
        int[] pre = new int[length+1];
        pre[0]=0;
        // 求前缀和
        for (int i=0;i<length;i++){
            pre[i+1] = pre[i] + arr[i];
        }
        // 双重循环遍历
        for (int j=0;j<pre.length-1;j++){
            for (int k=j+1;k<pre.length;k++){
               if ((pre[k]-pre[j]) %2>0 ){
                   count++;
               }
            }
        }
        return count;
    }
    // 前缀和 + 一次循环
    public static int numOfSubarrays2(int[] arr) {
        long count=0;
        int length = arr.length;
        int[] pre = new int[length+1];
        pre[0]=0;
        // 求前缀和
        for (int i=0;i<length;i++){
            pre[i+1] = pre[i] + arr[i];
        }
        int oddCount = 0;// 奇数个数
        int evenCount = 0;// 偶数个数
        // 一次循环
        for (int j=0;j< pre.length;j++){
            if (pre[j]%2==1){
                count+=evenCount;
                oddCount++;
            } else {
                count+=oddCount;
                evenCount++;
            }
        }
        int t = (int)(count % (Math.pow(10,9) + 7));
        return t;
    }
    // 前缀和时直接算出
    public static int numOfSubarrays(int[] arr) {
        final int MODULO=1000000007;
        int count=0;
        int length = arr.length;
        int preSum = 0;
        int oddCount = 0;// 奇数个数
        int evenCount = 1;// 偶数个数
        // 求前缀和
        for (int i=0;i<length;i++){
            preSum = preSum + arr[i];
            count = (count + (preSum %2 ==0 ? oddCount : evenCount)) % MODULO;
            if (preSum%2==1){
                oddCount++;
            } else {
                evenCount++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3};
        System.out.println(numOfSubarrays(arr));
    }
}
