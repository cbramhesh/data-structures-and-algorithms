package com.bramhesh;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 6, 1};
        int largest = largestNumber(arr);
        System.out.println("Largest element is: " + largest);
    }

    public static int largestNumber(int[] nums) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}