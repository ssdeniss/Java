package com.company;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.print("Enter your number: ");
        number = num.nextInt();
        if (number < 5) {
            System.out.println("Number is small than 5");
        } else {
            System.out.println("Number is big than 5");
        }

        switch (number) {
            case 5:
                System.out.println("Number is equal to 5");
                break;
            default:
                System.out.println("Number is equal to some number");
        }
    }
}
