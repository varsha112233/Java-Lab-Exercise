package factorialnumber;
import java.util.Scanner;


public class Factorialcaluclator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate the factorial using the iterative approach
        long iterativeResult = factorialIterative(number);
        System.out.println("Factorial (Iterative) of " + number + " is: " + iterativeResult);

        // Calculate the factorial using the recursive approach
        long recursiveResult = factorialRecursive(number);
        System.out.println("Factorial (Recursive) of " + number + " is: " + recursiveResult);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate factorial using iterative approach
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Function to calculate factorial using recursive approach
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}