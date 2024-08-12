package com.ctrip.hotel.test.sortTest;

public class QuickSortTest {

    public static void quickSort(int[] nums,int low,int high){
        if (low>=high){
            return;
        }
        int position = partSort(nums,low, high);
        quickSort(nums,low,position-1);
        quickSort(nums,position+1,high);
    }

    public static int partSort(int[] nums,int left,int right){
        int key = left;
        while (left<right){
            while (left<right && nums[left]<nums[key]){
                left++;
            }
            while (right>=0 && nums[right]>nums[key]){
                right--;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,3,2,8,4,6,1};
        quickSort(nums,0, nums.length-1);
        for (int t : nums){
            System.out.println(t);
        }
    }
}
