package com.bramhesh;

import java.util.Arrays;

public class MoveZeroesToEnd {

    //BRUTE FORCE APPROACH
    private int[] moveZeroesToEnd(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        // STEP 1: Take non zeroes in an temp
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }
        }
        // STEP 2: Fill original array with temp[]
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
        // STEP 3: Fill remaining elements with 0's  ---> OPTIONAL
        for (int i = temp.length; i < n; i++) {
            nums[i] = 0;
        }

        return nums;
    }

    // OPTIMAL Solution

    private int[] moveZeroOptimal(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < nums.length) {
            nums[j] = 0;
            j++;
        }
        return nums;
    }

    // SWAPPING

    private int[] moveZeroesSwap(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] !=0) {
                if(i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        MoveZeroesToEnd obj = new MoveZeroesToEnd();
        int[] result = obj.moveZeroesToEnd(arr);
        int[] resultOptimal = obj.moveZeroOptimal(arr);
        int[] resultSwap = obj.moveZeroesSwap(arr);
        System.out.println(Arrays.toString(resultSwap));
    }
}
