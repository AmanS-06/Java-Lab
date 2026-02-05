import java.util.Scanner;

// Class containing basic arithmetic operations
public class ArithmeticOperations {
    // We pass values directly to methods
    
    // Method to add two numbers 
    public int addNums(int a, int b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public int subtractNums(int a, int b) {
        return a - b;
    }
    
    // Method to multiply two numbers
    public int multiplyNums(int a, int b) {
        return a * b;
    }
    
    // Method to divide two numbers
    public double divideNums(int a, int b) {
        // Check for division by zero to prevent runtime error
        if (b == 0) {
            System.out.println("Error: Division by zero is not possible.");
            return 0.0; 
        }
        // Cast to double for accurate division
        return (double) a / b;
    }
    
    // Method to find the modulus of two numbers
    public int modulusNums(int a, int b) {
        // Check for division by zero to prevent runtime error
        if (b == 0) {
            System.out.println("Error: Division by zero is not possible.");
            return 0;
        }
        return a % b;
    }

    /*	public static void main (String[] args) {
		ArithmeticOperations operations = new ArithmeticOperations();
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter first number: ");
		operations.n1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		operations.n2 = scanner.nextInt();

		System.out.println("Addition: " + operations.addNums(operations.n1, operations.n2));
		System.out.println("Subtraction: " + operations.subtractNums(operations.n1, operations.n2));
		System.out.println("Multiplication: " + operations.multiplyNums(operations.n1, operations.n2));
		System.out.println("Division: " + operations.divideNums(operations.n1, operations.n2));
		System.out.println("Modulus: " + operations.modulusNums(operations.n1, operations.n2));
	
		scanner.close();
	}
*/
}
