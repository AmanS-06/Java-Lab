import java.util.Scanner;

// Main calculator class with menu-driven interface
public class Calculator {
    // Instance variables to store the two numbers for operations
    public int n1, n2;
    
    public static void main(String[] args) {
        // Create an instance of ArithmeticOperations to perform calculations
        ArithmeticOperations operations = new ArithmeticOperations();
        Scanner scanner = new Scanner(System.in);
        
        // Get initial input from user
        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();
        
        // Initialize choice variable
        int choice = -1;
        
        // Main menu loop - continues until user chooses to exit (0)
        do {
            // Display menu options
            System.out.println("\nSelect between the following:");
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.print("Your choice: ");
            
            // Read user's menu choice
            choice = scanner.nextInt();
            
            // Process user's choice using if-else chain
            if (choice == 1) {
                System.out.println("Addition: " + operations.addNums(n1, n2));
            } else if (choice == 2) {
                System.out.println("Subtraction: " + operations.subtractNums(n1, n2));
            } else if (choice == 3) {
                System.out.println("Multiplication: " + operations.multiplyNums(n1, n2));
            } else if (choice == 4) {
                System.out.println("Division: " + operations.divideNums(n1, n2));
            } else if (choice == 5) {
                System.out.println("Modulus: " + operations.modulusNums(n1, n2));
            } else if (choice == 0) {
                // User chose to exit
                System.out.println("Exiting calculator.");
            } else {
                // Handle invalid menu choices
                System.out.println("Invalid input. Please choose a number between 0 and 5.");
            }
            
        } while (choice != 0); // Loop continues until user enters 0
        
        // Close the scanner
        scanner.close();
    }
}