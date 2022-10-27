package com.company.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person Denis = new Person(170,"Denis", "Seremet"); // Obiect
        Student George = new Student(182, "George", "Postica", 3); // Obiect
        Student Andrei = new Student("Andrei"); // Obiect
        Denis.data();
        George.data();
    }
}
