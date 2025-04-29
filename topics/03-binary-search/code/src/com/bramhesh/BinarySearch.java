package com.bramhesh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 45, 68, 90, 109};
        int target = 45;

        int position = binarySearchUser(arr, target);
        System.out.println(position);
    }

    static int binarySearchUser(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while ( left <= right ) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}