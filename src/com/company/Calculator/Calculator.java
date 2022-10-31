package com.company.Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    public boolean setClear = true;
    double number, memValue;
    char op;
    String[] digitButtonText = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "."};
    String[] operatorButtonText = {"/", "*", "%", "-", "+", "="};

public JButton button = new JButton("Click");

    public Calculator() {
        super("Form");
        this.setBounds(100, 100, 300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

        for(int i = 0; i < digitButtonText.length; i++){
        }
    }


}
