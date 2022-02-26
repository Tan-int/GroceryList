import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        GroceryList.printInstructions();
        boolean quit = false;
        while(!quit) {
            System.out.print("\nOption: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    groceryList.addItem();
                    break;
                case 3:
                    groceryList.removeItem();
                    break;
                case 4:
                    groceryList.findItem();
                    break;
                case 5:
                    groceryList.modifyList();
                    break;
                case 6:
                    groceryList.clearGroceryList();
                    break;
                case 7:
                    GroceryList.printInstructions();
                    break;
                case 8:
                    quit = true;
                    System.out.println("Program ended");
                    break;
                default:
                    System.out.println("Please select a valid option");
            }
            scanner.nextLine();
        }
    }
}
