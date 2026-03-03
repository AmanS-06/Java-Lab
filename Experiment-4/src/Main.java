import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter dimension (2 OR 3): ");
            int dim = sc.nextInt();

            // Invalid dimension checks
            if (dim == 0 || dim == 1 || dim > 3) {
                throw new VectorException("Only 2D or 3D vectors are allowed.");
            }

            double[] arr1 = new double[dim];
            double[] arr2 = new double[dim];

            System.out.println("Enter elements of first vector:");
            for (int i = 0; i < dim; i++) {
                arr1[i] = sc.nextDouble();
            }

            System.out.println("Enter elements of second vector:");
            for (int i = 0; i < dim; i++) {
                arr2[i] = sc.nextDouble();
            }

            Vectors v1 = new Vectors(arr1);
            Vectors v2 = new Vectors(arr2);

            System.out.println("\nFirst Vector:");
            v1.printVector();

            System.out.println("Second Vector:");
            v2.printVector();

            // Addition
            Vectors sum = v1.add(v2);
            System.out.println("\nAddition Result:");
            sum.printVector();

            // Subtraction
            Vectors diff = v1.subtract(v2);
            System.out.println("\nSubtraction Result:");
            diff.printVector();

            // Multiplication (Dot Product)
            double dot = v1.multiply(v2);
            System.out.println("\nDot Product Result: " + dot);

        } catch (VectorException e) {
            System.out.println("Vector Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            sc.close();
        }
    }
}