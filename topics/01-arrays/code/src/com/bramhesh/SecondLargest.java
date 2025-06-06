package com.bramhesh;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        int largest = largestNumber(arr);
        int secondLargest = secondLargest(arr);

        int secondLargestUsingPass = secondLargestUsingPass(arr);

        System.out.println("Largest number is: " + largest);
        System.out.println("Second largest number is: " + secondLargest);

        System.out.println("Second largest using PASS: " + secondLargestUsingPass);
    }

    // This is a optimal solution
    public static int largestNumber(int[] nums) {
        int largest = nums[0];
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    // This is a optimal solution
    public static int secondLargest(int[] nums) {
        int largest = largestNumber(nums);
        int secondLargest = -1;

        for (int num: nums) {
            if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    // To implement an OPTIMIZED SOLUTION WE CAN USE pass
    // Time Complexity is: O(n)
    public static int secondLargestUsingPass(int[] nums) {
        int largest = nums[0];
        int secondLargest = -1;

        for (int num: nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else {
                if (num < largest && num > secondLargest) {
                    secondLargest = num;
                }
            }
        }
        return secondLargest;
    }
}
