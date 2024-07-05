package GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApp {
    private ArrayList<String> groceryList;

    public GroceryListApp() {
        groceryList = new ArrayList<>();
    }

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println("Added Successfully");
    }

    public boolean removeItem(String item) {
        if (groceryList.remove(item)) {
            System.out.println(item + " was removed successfully.");
            return true;
        } else {
            System.out.println(item + " was not found in the list.");
            return false;
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        GroceryListApp app = new GroceryListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display List");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter the name of the item you want to add: ");
                        String addItem = scanner.nextLine();
                        app.addItem(addItem);
                        break;
                    case "2":
                        System.out.print("Enter the name of the item you want to remove: ");
                        String removeItem = scanner.nextLine();
                        app.removeItem(removeItem);
                        break;
                    case "3":
                        app.displayList();
                        break;
                    case "4":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }

            }
        scanner.close();
    }
}

