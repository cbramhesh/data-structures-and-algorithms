package com.bramhesh;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 20, 5, 10, 2, 9};
        System.out.println(maxInRange(arr, 4, 7));
        System.out.println(max(arr));
    }

    static int maxInRange(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] > max) {
                max = arr[max];
            }
        }
        return max;
    }

    static int max(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
