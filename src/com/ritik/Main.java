package com.ritik;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        BubbleSort(arr);
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
                }
            }
            if(!swapped)
                break;
        }
    }
    static void SelectionSort(int[] arr){
        
    }
}
