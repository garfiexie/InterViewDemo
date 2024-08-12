package com.ctrip.hotel.test.sortTest;

public class InsertSortTest {

    public static void InsertSort(int[] nums){
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j=i;j>0;j--){
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4,6,1};
        InsertSort(nums);
        for (int t : nums){
            System.out.println(t);
        }
    }
}
