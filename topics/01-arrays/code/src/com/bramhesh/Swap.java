package com.bramhesh;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 20, 5, 10, 2, 9};
        swap(arr, 3, 5);
        reverseArray(arr);
        reverse(arr);

        System.out.println(Arrays.toString(arr));
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
        static void reverseArray(int[] arr)  {
            int start = 0;
            int end = arr.length-1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
