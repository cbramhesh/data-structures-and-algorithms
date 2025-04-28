package com.bramhesh;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int element: nums) {
            if ( even(element) ) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;

    }

    static int digits(int num) {
        if( num < 0 ) {
            num *= -1;
        }

        if(num == 0) {
            return 1;
        }
//        int count = 0;

//        while( num > 0 ) {
//            count++;
//            num /= 10;
//        }
//        return count;
        return (int)(Math.log10(num)) + 1;
    }
}
