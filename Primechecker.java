package primenumber;
import java.util.Scanner;


public class Primechecker {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.println("Enter a number to check if it is a prime number: ");
	        int number = scanner.nextInt();

	        // Check if the number is prime
	        boolean isPrime = checkPrime(number);

	        // Display the result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to check if a number is prime
	    public static boolean checkPrime(int n) {
	        // Prime numbers are greater than 1
	        if (n <= 1) {
	            return false;
	        }

	        // Check for factors from 2 to the square root of n
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}