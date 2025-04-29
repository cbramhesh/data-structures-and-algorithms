package com.bramhesh;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] asc = {2, 5, 10, 45, 68, 90, 109};
        int[] desc = {100, 97, 65 , 36, 27, 9};
        int target = 109;

        System.out.println(orderAgnoBS(asc, target));
        System.out.println(orderAgnoBS(desc, target));
    }
    
    static int orderAgnoBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid] ) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
         return -1;
    }
}
