package com.bramhesh;

import java.util.Arrays;

public class LeftRotateByOnePlace {

    public static int[] leftRotateByOnePlace(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(leftRotateByOnePlace(arr)));
    }
}
