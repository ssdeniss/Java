package com.company;

import java.util.Scanner;

public class MathOp {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float a, b, res;
        System.out.print("Enter value for a: ");
        a = num.nextInt();
        System.out.print("Enter value for b: ");
        b = num.nextInt();
        res = a + b;
        System.out.println("Result of + is: " + res);
        res = a - b;
        System.out.println("Result of - is: " + res);
        res = a * b;
        System.out.println("Result of * is: " + res);
        res = a / b;
        System.out.println("Result of / is: " + res);
        res = a % b;
        System.out.println("Result of % is: " + res);
    }
}
