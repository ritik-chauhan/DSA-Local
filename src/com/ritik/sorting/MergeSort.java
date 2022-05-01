package com.ritik.sorting;

import com.ritik.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={112, 114, 110, 109, 17, 56};
        arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] Sort(int[] arr) {
        if(arr.length==1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left=Sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=Sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

     static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i=0, j=0, k=0;

        while ( i<first.length && j< second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be the case that one of the two arrays reach their termination index, then we will have to insert remaining elements
         while(i< first.length) {
             mix[k] = first[i];
             i++;
             k++;
         }
         while(j< second.length) {
             mix[k] = second[j];
             j++;
             k++;

         }
         return mix;
    }

}