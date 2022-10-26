package com.company;

import java.util.Scanner;

public class Function {
    public static int func(int a, int b) {
        int res = 2;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }

    public static int[] readArray() {
        int[] array;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter array [" + i + "]: ");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Array[" + i + "] = [" + array[i] + "]");
        }
        return array;
    }

    public static void main(String[] args) {
        int temp = func(3, 4);
        System.out.println(temp);
        readArray();
    }
}
