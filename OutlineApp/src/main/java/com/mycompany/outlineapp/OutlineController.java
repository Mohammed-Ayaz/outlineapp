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

    public OutlineController(OutlineModel model, OutlineView view) {
        this.model = model;
        this.view = view;
    }

    public void addNode(String text) {
        model.addNode(text);
    }

    public void deleteNode(String text) {
        model.deleteNode(text);
    }

    public void displayOutline() {
        List<String> outlineList = model.getOutlineList();
        view.displayOutline(outlineList);
    }

    public void saveToFile(String fileName) {
        model.saveToFile(fileName);
    }

    public void loadFromFile(String fileName) {
        model.loadFromFile(fileName);
    }
}
