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

public class OutlineView {
    // Display the outline by printing each node in the list
    public void displayOutline(List<String> outlineList) {
        for (String text : outlineList) {
            System.out.println(text);
        }
    }
}



