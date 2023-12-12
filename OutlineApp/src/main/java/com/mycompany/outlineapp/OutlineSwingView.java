/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outlineapp;

/**
 *
 * @author human
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class OutlineSwingView {
    private JFrame frame;
    private JTextArea textArea;
    private JButton addButton;
    private JButton deleteButton;
    private JButton displayButton;
    private JButton saveButton;
    private JButton loadButton;

    public OutlineSwingView() {
        frame = new JFrame("Outline App");
        textArea = new JTextArea();
        addButton = new JButton("Add Node");
        deleteButton = new JButton("Delete Node");
        displayButton = new JButton("Display Outline");
        saveButton = new JButton("Save to File");
        loadButton = new JButton("Load from File");

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 5, 5, 5));
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void displayOutline(List<String> outlineList) {
        StringBuilder sb = new StringBuilder();
        for (String text : outlineList) {
            sb.append(text).append("\n");
        }
        textArea.setText(sb.toString());
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setDeleteButtonListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }

    public void setDisplayButtonListener(ActionListener listener) {
        displayButton.addActionListener(listener);
    }

    public void setSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public void setLoadButtonListener(ActionListener listener) {
        loadButton.addActionListener(listener);
    }

    public String getUserInput(String prompt) {
        return JOptionPane.showInputDialog(frame, prompt);
    }
}


