package com.company.OOP;

public class Person { // Clasa
    public Integer height;
    public String surname;
    public String name;


    public void data() { // Metoda
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("Height " + height + "cm");
        System.out.println("---------------");
    }

    public Person() {
    } // Constructor default

    public Person(Integer height, String surname, String name) { // Constructor
        this.height = height;
        this.surname = surname;
        this.name = name;
    }
//    public Person(int h, String s) { // Constructor
//        height = h;
//        surename = s;
//    }
}

