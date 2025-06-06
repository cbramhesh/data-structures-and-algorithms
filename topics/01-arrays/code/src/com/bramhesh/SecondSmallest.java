package com.bramhesh;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 4, 7, 7, 5};
        int length = arr.length;
        int secondSmallest = secondSmallest(arr, length);
        System.out.println("Second smallest is: " + secondSmallest );
    }

    private static int secondSmallest(int[] nums, int n) {
        if ( n < 2 ) {
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num: nums) {
            if (num < small) {
                secondSmallest = small;
                small = num;
            } else {
                if (num < secondSmallest && num != small) {
                    secondSmallest = num;
                }
            }
        }
        return secondSmallest;
    }
}
