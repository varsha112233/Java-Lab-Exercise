package factorialnumber;
import java.util.Scanner;
public class FactorialEx {
        public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to calculate its factorial:");
            int number = scanner.nextInt();
            long iterativeFactorial = calculateFactorialIterative(number);
            System.out.println("Factorial of " + number + " (iterative): " + iterativeFactorial);
            long recursiveFactorial = calculateFactorialRecursive(number);
            System.out.println("Factorial of " + number + " (recursive): " + recursiveFactorial);
            
            scanner.close();
        }
        public static long calculateFactorialIterative(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Number must be non-negative.");
            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        public static long calculateFactorialRecursive(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Number must be non-negative.");
            }
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorialRecursive(n - 1);
            }
        }
    }

