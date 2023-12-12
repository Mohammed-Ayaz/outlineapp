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

// OutlineNode class to represent a node in the outline
class OutlineNode {
    private String text;
    private List<OutlineNode> children;

    public OutlineNode(String text) {
        this.text = text;
        this.children = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public List<OutlineNode> getChildren() {
        return children;
    }

    public void addChild(OutlineNode child) {
        children.add(child);
    }
}
