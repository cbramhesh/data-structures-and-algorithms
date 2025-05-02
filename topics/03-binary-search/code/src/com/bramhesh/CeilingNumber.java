package com.bramhesh;

// Q. Ceiling no is smallest number >= target

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 15, 17, 20};
        int target = 7;
        System.out.println(findCeiling(arr, target));

    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        // If target is greater than the largest no in array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
