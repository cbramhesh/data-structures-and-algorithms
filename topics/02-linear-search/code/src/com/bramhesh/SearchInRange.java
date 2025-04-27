package com.bramhesh;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,45,-56,8,9,3,4,90, -32};
        int target = 9;
        int position = linearSearch(arr, target, 1,6);
        System.out.println("Target found at this position:" + position);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0 ) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if ( element == target) {
                return index;
            }
        }
        return -1;
    }
}
