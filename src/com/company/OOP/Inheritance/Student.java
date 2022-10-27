package com.company.OOP.Inheritance;

public class Student extends Person { // Clasa
    public Integer course;

    public Student(Integer height, String surname, String name, Integer course) {
        super(height, surname, name);
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    public void data() { // Overwriting
        System.out.println("Course " + course);
        super.data();
    }


}
