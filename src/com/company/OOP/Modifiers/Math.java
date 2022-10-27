package com.company.OOP.Modifiers;

public class Math { // Static
    public static int x = 23;
    public static int Sum(int a, int b) { // Static
        return a + b;
    }

    public int mult(int a, int b) { // No static
        return a + b;
    }
}
