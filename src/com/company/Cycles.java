package com.company;

public class Cycles {
    public static void main(String[] args) {
        for (short i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        short j = 0;
        while (true) {
            System.out.println("j = " + j);
            j++;
            if (j == 10) {
                break;
            }
        }
    }
}
