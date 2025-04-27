package com.bramhesh;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 6, 8},
                {2, 5, 7, 9},
                {10, 45, 3, 6}
        };
        System.out.println(max(arr));
        System.out.println(maxUsingEnhanceFor(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return  max;
    }

    static int maxUsingEnhanceFor(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row: arr) {
            for (int col: row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return  max;
    }
}
