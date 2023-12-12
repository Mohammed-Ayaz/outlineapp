/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.outlineapp;

/**
 *
 * @author human
 */
import java.util.Scanner;

public class OutlineApp {
    private OutlineController controller;

    public OutlineApp(OutlineController controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Display Outline");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    controller.addNode(text);
                    break;
                case 2:
                    System.out.print("Enter text to delete: ");
                    String textToDelete = scanner.nextLine();
                    controller.deleteNode(textToDelete);
                    break;
                case 3:
                    controller.displayOutline();
                    break;
                case 4:
                    System.out.print("Enter file name to save: ");
                    String saveFileName = scanner.nextLine();
                    controller.saveToFile(saveFileName);
                    break;
                case 5:
                    System.out.print("Enter file name to load: ");
                    String loadFileName = scanner.nextLine();
                    controller.loadFromFile(loadFileName);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) {
        OutlineModel model = new OutlineModel();
        OutlineView view = new OutlineView();
        OutlineController controller = new OutlineController(model, view);
        OutlineApp app = new OutlineApp(controller);

        app.start();
    }
}
