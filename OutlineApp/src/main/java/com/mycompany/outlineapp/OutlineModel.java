/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outlineapp;

/**
 *
 * @author human
 */
import java.util.ArrayList;
import java.util.List;

public class OutlineModel {
    private List<Node> outlineList;

    public OutlineModel() {
        this.outlineList = new ArrayList<>();
    }

    // Add a node to the outline
    public void addNode(String text) {
        outlineList.add(new Node(text));
    }

    // Add a subsection to a section
    public void addSubsection(String sectionText, String subsectionText) {
        for (Node node : outlineList) {
            if (node.getText().equals(sectionText)) {
                node.addChild(new Node(subsectionText));
                return;
            }
        }
        System.out.println("Section not found: " + sectionText);
    }

    // Delete a node from the outline
    public void deleteNode(String text) {
        outlineList.removeIf(node -> node.getText().equals(text));
        outlineList.forEach(node -> node.removeChild(text));
    }

    // Get the list of nodes in the outline
    public List<String> getOutlineList() {
        List<String> result = new ArrayList<>();
        for (Node node : outlineList) {
            node.collectNodes(result);
        }
        return result;
    }

    // Edit a node in the outline
    public void editNode(String oldText, String newText) {
        for (Node node : outlineList) {
            if (node.getText().equals(oldText)) {
                node.setText(newText);
                return;
            }
        }
        System.out.println("Node not found: " + oldText);
    }

    // Save outline data to a file
    public void saveToFile(String fileName) {
        // Similar to the previous implementation
    }

    // Load outline data from a file
    public void loadFromFile(String fileName) {
        // Similar to the previous implementation
    }

    // Node class representing a section or subsection
    private static class Node {
        private String text;
        private List<Node> children;

        public Node(String text) {
            this.text = text;
            this.children = new ArrayList<>();
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void addChild(Node child) {
            children.add(child);
        }

        public void removeChild(String childText) {
            children.removeIf(child -> child.getText().equals(childText));
        }

        public void collectNodes(List<String> result) {
            result.add(text);
            for (Node child : children) {
                child.collectNodes(result);
            }
        }
    }
}



