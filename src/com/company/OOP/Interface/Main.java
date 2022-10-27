package com.company.OOP.Interface;

public class Main {
    public static void main(String[] args) {
        Interface a = new Array();
        System.out.println(a.Add(3));
        System.out.println(a.Add(5));
        System.out.println(a.Add(9));
        System.out.println(a.Get(3));
        System.out.println("---------------");

        Interface b = new AnotherArray();
        System.out.println(b.Add(3));
        System.out.println(b.Add(5));
        System.out.println(b.Add(9));
        System.out.println(b.Get(3));
    }
}
