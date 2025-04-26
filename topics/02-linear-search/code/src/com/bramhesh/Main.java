package com.bramhesh;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 45, -9, 787, 89, 54, -34 };
        int target = 787;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //Search element in array: If not found return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //Check for element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this will execute if none of the return statements above have been executed
        return -1;
    }


}