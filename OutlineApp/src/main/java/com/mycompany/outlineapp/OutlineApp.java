/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.outlineapp;

/**
 *
 * @author human
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class OutlineApp {
    private OutlineController controller;

    public OutlineApp(OutlineController controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            try {
                System.out.println("1. Add Section");
                System.out.println("2. Add Subsection");
                System.out.println("3. Delete Node");
                System.out.println("4. Edit Node");
                System.out.println("5. Display Outline");
                System.out.println("6. Save to File");
                System.out.println("7. Load from File");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter section text: ");
                        String sectionText = scanner.nextLine();
                        controller.addNode(sectionText);
                        break;
                    case 2:
                        System.out.print("Enter section text: ");
                        String parentSectionText = scanner.nextLine();
                        System.out.print("Enter subsection text: ");
                        String subsectionText = scanner.nextLine();
                        controller.addSubsection(parentSectionText, subsectionText);
                        break; 
                    case 3: 
                        System.out.print("Enter text to delete: ");
                        String textToDelete = scanner.nextLine();
                        controller.deleteNode(textToDelete);
                        break;
                    case 4:
                        System.out.print("Enter text to edit: ");
                        String textToEdit = scanner.nextLine();
                        System.out.print("Enter new text: ");
                        String newText = scanner.nextLine();
                        controller.editNode(textToEdit, newText);
                        break; 
                    case 5:
                        controller.displayOutline();
                        break;
                    case 6:
                        System.out.print("Enter file name to save: ");
                        String saveFileName = scanner.nextLine();
                        controller.saveToFile(saveFileName);
                        break;
                    case 7:
                        System.out.print("Enter file name to load: ");
                        String loadFileName = scanner.nextLine();
                        controller.loadFromFile(loadFileName);
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        OutlineModel model = new OutlineModel();
        OutlineView view = new OutlineView();
        OutlineController controller = new OutlineController(model, view);
        OutlineApp app = new OutlineApp(controller);
 
    app.start();
    }
}
