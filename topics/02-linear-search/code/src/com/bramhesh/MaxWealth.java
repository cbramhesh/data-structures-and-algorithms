package com.bramhesh;

//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 2}
        };
        System.out.println(enhancedForLoop(accounts));
    }

    static int personWithMaxWealth(int[][] accounts) {
        // person = ROW
        // account = COLUMN
        int ans = 0;

        for( int person = 0; person < accounts.length; person++) {
            // When you start a new column, take a new sum for that row
            int sum = 0;
            for ( int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // Now we have the sum of accounts of person

            if ( sum > ans ) {
                ans = sum;
            }
        }
        return ans;
    }

    static int enhancedForLoop(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] persons: accounts) {
            int sum = 0;
            for (int account: persons) {
                sum += account;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
         return ans;
    }
}
