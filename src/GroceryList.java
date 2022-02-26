import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);

    public static void printInstructions() {
        System.out.println("----- WELCOME TO YOUR GROCERY LIST -----");
        System.out.println("----- PLEASE SELECT AN OPTION -----");
        System.out.println("1. Print Grocery List");
        System.out.println("2. Add Item to Grocery List");
        System.out.println("3. Remove Item from Grocery List");
        System.out.println("4. Search for Item in Grocery List");
        System.out.println("5. Replace an Item in Grocery List");
        System.out.println("6. Clear the Grocery List");
        System.out.println("7. Print Options");
        System.out.println("8. Quit");
    }

    public void addItem() {
        System.out.print("Add item: ");
        groceryList.add(scanner.nextLine().toLowerCase(Locale.ROOT));
        System.out.println("Item added to the grocery list");
    }

    public void removeItem() {
        System.out.print("Remove item: ");
        int position = groceryList.indexOf(scanner.nextLine());
        if (position >= 0) {
            System.out.println(groceryList.get(position) + " has been removed from the list");
            groceryList.remove(position);
        } else {
            System.out.println("Item doesn't exist in the list");
        }
    }

    public void clearGroceryList() {
        if (groceryList.isEmpty()) {
            System.out.println("Grocery list is currently empty");
        } else {
            groceryList.clear();
            System.out.println("The grocery list has been cleared");
        }
    }

    public void modifyList() {
        if(groceryList.isEmpty()) {
            System.out.println("Grocery list is empty, please add an item to modify the list");
        }
        else {
            System.out.println("Enter the item you want to replace: ");
            int position = groceryList.indexOf(scanner.nextLine());
            if (position >= 0) {
                System.out.println("Enter the new item");
                groceryList.set(position, scanner.nextLine());
                System.out.println("Item successfully replaced, " +
                        groceryList.get(position) + " has been added to the list");
            } else {
                System.out.println("Item was not found in the list");
            }
        }
    }

    public int findItem() {
        System.out.println("Search for item: ");

        int position = groceryList.indexOf(scanner.nextLine().toLowerCase(Locale.ROOT));
        if (position >= 0) {
            System.out.println(groceryList.get(position) + " found in the list");
        } else {
            System.out.println("Item was not found in the list");
        }
        return position;
    }

    public void printList() {
        System.out.println("You have " + groceryList.size() + " item(s) in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + groceryList.get(i));
        }
    }
}
