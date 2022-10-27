package com.company.OOP.Overload;

public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        sum(4, 5, 4); // 2
        sum(4, 9); // 1
        sum(4.2f, 9.3f,3); // 3
    }
}
