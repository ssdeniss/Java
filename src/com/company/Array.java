package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a [" + i + "] = ");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("array [" + i + "] = " + array[i]);
        }

    }
}
