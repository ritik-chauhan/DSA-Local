package com.ritik;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        SelectionSortMod(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSort(int[] arr){
        boolean swapped; //to find out if any there is a cycle of i that went by without doing any swapping if it did we can terminate
        for(int i=0; i<arr.length; i++){
            swapped=false;
            for(int j=1; j<= arr.length-i-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            //find max item in remaining array and replace with correct index
            int last=arr.length-i-1;
            int maxIndex=0;
            //loop to find index of maximum element
            for (int j=0; j<=last; j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            //swap element at maxIndex with element at last
            int temp=arr[last];
            arr[last]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }
    static void SelectionSortMod(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last = arr.length -i -1;
            int maxIndex = findMaxIndex(arr, 0, last);
            swap(arr[i], arr[last]);
        }
    }

    private static void swap(int first, int second) {
        int temp = first;
        first=second;
        second=temp;


    }

    private static int findMaxIndex(int[] arr, int first, int last) {
        int maxIndex=first;
        for(int i=0; i<=last; i++){
            if(arr[i]<arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
