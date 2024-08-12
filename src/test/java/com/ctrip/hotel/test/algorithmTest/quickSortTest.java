package com.ctrip.hotel.test.algorithmTest;

public class quickSortTest {

    public static void quickSort(int arr[],int startIndex,int endIndex){
        if (startIndex>=endIndex){
            return;
        }
        int pIndex = partition(arr,startIndex,endIndex);
        quickSort(arr,startIndex,pIndex-1);
        quickSort(arr,pIndex+1,endIndex);
    }

    public static int partition(int arr[],int startIndex,int endIndex){
        int p = arr[startIndex];
        while (startIndex<endIndex){
            while (startIndex<endIndex && arr[endIndex]>p){
                endIndex--;
            }
            arr[startIndex] = arr[endIndex];
            while (startIndex<endIndex && arr[startIndex] <=p){
                startIndex++;
            }
            arr[endIndex] = arr[startIndex];
        }
        arr[startIndex] =p;
        return startIndex;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{4,7,6,5,3,2,8,1};
        quickSortTest.quickSort(arr,0,7);
        for (int t : arr){
            System.out.println(t);
        }
    }
}
