package com.bramhesh;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> twoDimAL = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            twoDimAL.add( new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDimAL.get(i).add(sc.nextInt());
            }
        }

        System.out.println(twoDimAL);
    }
}
