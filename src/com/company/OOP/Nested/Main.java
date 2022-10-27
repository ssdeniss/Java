package com.company.OOP.Nested;

public class Main {
    public static void main(String[] args) {
        Computer myPC = new Computer();
        myPC.intel.start();
        myPC.kingston.start();
        myPC.intel.shutDown();
        myPC.kingston.shutDown();

        new Computer() { // Anonym class
            void superComp() {
                this.intel.start();
                this.kingston.start();
            }
        };
    }
}
