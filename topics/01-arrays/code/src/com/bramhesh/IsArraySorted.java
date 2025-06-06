package com.bramhesh;

public class IsArraySorted {

    private static boolean checkArraySorted(int[] nums) {
        for (int i = 1; i <  nums.length; i++) {
            if (nums[i] >= nums[i-1]) {
                continue;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(checkArraySorted(arr));
        System.out.println(checkArraySorted(arr1));

    }
}
