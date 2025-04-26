package com.bramhesh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 8; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(list.get(i));
        }
    }
}
