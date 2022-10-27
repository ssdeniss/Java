package com.company.OOP.Nested;

public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void start() {
            isStart = true;
            System.out.println("Proccessor start");
        }

        public void shutDown() {
            isStart = false;
            System.out.println("Proccessor shutDown");
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start() {
            isStart = true;
            System.out.println("RAM start");
        }

        public void shutDown() {
            isStart = false;
            System.out.println("RAM shutDown");
        }
    }

    Proccessor intel = new Proccessor();
    RAM kingston = new RAM();
}
