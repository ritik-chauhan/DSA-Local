package com.ritik.Patterns;

import java.util.Arrays;

public class SortByRec {
    public static void main(String[] args) {
        int[] arr = {12,11,10,9,8};
        Selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection (int[] arr, int r, int c, int max) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[max]) {
                Selection(arr, r, c+1, c);
            } else {
                Selection(arr, r, c+1, max);
            }

        } else {
            int temp = arr[max]; //when the above if fails means that we have a max element
            arr[max] = arr[r-1]; //we can now swap the max element with the last element which is at r-1
            arr[r-1] = temp;
            Selection(arr, r-1, 0, 0);
        }
    }
}
