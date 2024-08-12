package com.ctrip.hotel.test.sortTest;

/**
 * 冒泡排序
 */
public class BubbleSortTest {
    public void bubbleSort(int[] nums){
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j =0;j<n-i-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortTest bubbleSort = new BubbleSortTest();
        int[] nums = new int[]{3,2,4,6,1};
        bubbleSort.bubbleSort(nums);
        for (int t : nums){
            System.out.println(t);
        }
    }


}
