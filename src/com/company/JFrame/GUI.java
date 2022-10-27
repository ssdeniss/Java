package com.company.JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JButton button = new JButton("Click");
    private JTextField input = new JTextField("", 8);
    private JLabel label = new JLabel("Input: ");
    private JRadioButton radioFirst = new JRadioButton("Select");
    private JRadioButton radioSecond = new JRadioButton("Select");
    private JCheckBox checkBox = new JCheckBox("Check", false);

    public GUI() {
        super("Form");
        this.setBounds(100, 100, 300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radioFirst);
        group.add(radioSecond);
        container.add(radioFirst);
        radioFirst.setSelected(true);
        container.add(radioSecond);
        container.add(checkBox);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radioFirst.isSelected() ? "Radio #1" : "Radio #2" + " is selected\n");
            message += "Checkbox is " + ((checkBox.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
