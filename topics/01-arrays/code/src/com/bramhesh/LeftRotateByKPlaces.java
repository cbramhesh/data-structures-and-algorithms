package com.bramhesh;

import java.util.Arrays;

public class LeftRotateByKPlaces {

    // BRUTE FORCE APPROACH
    // TC = O(n)
    // SC = O(n)
    private int[] leftRotateByKPlace(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        // Store first k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        // Shift remaining elements to the left
        for (int iterateNums = k; iterateNums < nums.length; iterateNums++) {
            nums[iterateNums - k] = nums[iterateNums];
        }

        // Copy temp to the end
        for  (int iterateTemp = 0; iterateTemp < k; iterateTemp++) {
            nums[iterateTemp + k] = temp[iterateTemp];
        }
        return nums;
    }

    //OPTIMAL SOLUTION: Where we will
    // Revere array to first d places                                   E.g {3, 2, 1, 4 ,5, 6}
    // Reverse remaining array                                          E.g {3, 2, 1, 6, 5, 4}
    // Reverse the resultant array which will give us the result        E.g {4, 5, 6, 1, 2, 3}

    private void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    private int[] leftRotateOptimal(int[] nums, int k ) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);

        reverse(nums,  k, n - 1);

        reverse(nums, 0, n-1);

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        LeftRotateByKPlaces obj = new LeftRotateByKPlaces();
//        int[] result = obj.leftRotateByKPlace(arr, k);

        int[] resultOptimal = obj.leftRotateOptimal(arr, k);

//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultOptimal));
    }
}
