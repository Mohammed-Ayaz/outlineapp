/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outlineapp;

/**
 *
 * @author human
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OutlineModel {
    private List<String> outlineList;

    public OutlineModel() {
        this.outlineList = new ArrayList<>();
    }

    public void addNode(String text) {
        outlineList.add(text);
    }

    public void deleteNode(String text) {
        outlineList.remove(text);
    }

    public List<String> getOutlineList() {
        return outlineList;
    }

    // Save outline data to a file
    public void saveToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String text : outlineList) {
                writer.println(text);
            }
            System.out.println("Outline data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    // Load outline data from a file
    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                outlineList.add(line);
            }
            System.out.println("Outline data loaded from " + fileName);
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
