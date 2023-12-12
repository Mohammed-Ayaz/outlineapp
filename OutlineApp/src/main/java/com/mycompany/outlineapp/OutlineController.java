/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outlineapp;

/**
 *
 * @author human
 */
import java.util.List;

public class OutlineController {
    private OutlineModel model;
    private OutlineView view;

    // Constructor to initialize the controller with a model and view
    public OutlineController(OutlineModel model, OutlineView view) {
        this.model = model;
        this.view = view;
    }

    // Add a node to the outline (section or subsection)
    public void addNode(String text) {
        model.addNode(text);
    }

    // Add a subsection to a section
    public void addSubsection(String sectionText, String subsectionText) {
        model.addSubsection(sectionText, subsectionText);
    }

    // Delete a node from the outline
    public void deleteNode(String text) {
        model.deleteNode(text);
    }

    // Display the outline through the view
    public void displayOutline() {
        List<String> outlineList = model.getOutlineList();
        view.displayOutline(outlineList);
    }

    // Edit a node in the outline
    public void editNode(String oldText, String newText) {
        model.editNode(oldText, newText);
    }

    // Save the outline to a file
    public void saveToFile(String fileName) {
        model.saveToFile(fileName);
    }

    // Load the outline from a file
    public void loadFromFile(String fileName) {
        model.loadFromFile(fileName);
    }
}



