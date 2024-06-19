package fibonacci;
import java.util.Scanner;


public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.println("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        // Validate the number of terms
        if (numberOfTerms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Generate and display the Fibonacci series
            System.out.println("Fibonacci series up to " + numberOfTerms + " terms:");
            generateFibonacciSeries(numberOfTerms);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to generate and print the Fibonacci series
    public static void generateFibonacciSeries(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
		// TODO Auto-generated method stub

	}

}
