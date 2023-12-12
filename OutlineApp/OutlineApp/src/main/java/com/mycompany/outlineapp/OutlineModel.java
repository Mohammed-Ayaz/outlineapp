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
        // Initialize the outlineList as an ArrayList
        this.outlineList = new ArrayList<>();
    }

    // Add a node to the outline
    public void addNode(String text) {
        outlineList.add(text);
    }

    // Delete a node from the outline
    public void deleteNode(String text) {
        outlineList.remove(text);
    }

    // Get the list of nodes in the outline
    public List<String> getOutlineList() {
        return outlineList;
    } 
    
    // Edit a node in the outline
    public void editNode(String oldText, String newText) {
        
        if (outlineList.contains(oldText)) {
        int index = outlineList.indexOf(oldText);
        outlineList.set(index, newText);
        System.out.println("Node edited successfully.");
    } else {
        System.out.println("Node not found in the outline.");
    }
}


    // Save outline data to a file
    public void saveToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Iterate through the outlineList and write each node to the file
            for (String text : outlineList) {
                writer.println(text);
            }
            System.out.println("Outline data saved to " + fileName);
        } catch (IOException e) {
            // Handle IOException during file write
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    // Load outline data from a file
    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file and add it to the outlineList
            while ((line = reader.readLine()) != null) {
                outlineList.add(line);
            }
            System.out.println("Outline data loaded from " + fileName);
        } catch (IOException e) {
            // Handle IOException during file read
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}


