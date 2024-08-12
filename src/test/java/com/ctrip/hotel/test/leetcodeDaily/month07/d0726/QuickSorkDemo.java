package com.ctrip.hotel.test.leetcodeDaily.month07.d0726;

public class QuickSorkDemo {
    public static void quickSort(int[] nums,int low,int high){
        if (low>=high){
            return;
        }
        int position = partSort(nums,low,high);
        quickSort(nums,low,position-1);
        quickSort(nums,position+1,high);
    }

    public static int partSort(int[] nums,int low,int high){
        int key = low;
        while (low<high){
            while (low<high && nums[low]<nums[key]){
                low++;
            }
            while (high>=0 && nums[high] > nums[key]){
                high--;
            }
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;
        }
        return high;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,3,2,8,4,6,1};
        quickSort(nums,0, nums.length-1);
        for (int t : nums){
            System.out.println(t);
        }
    }
}
