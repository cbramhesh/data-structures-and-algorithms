package com.bramhesh;

// Floor of a number greatest number < target  NO.
public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 15, 17, 20, 22};
        int target = 1;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
     }
}
