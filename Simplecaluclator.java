package caluclator;
import java.util.Scanner;

public class Simplecaluclator {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the operation
        System.out.println("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Prompt the user to enter the operands
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0.0;
        
        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
        // Display the result
        System.out.println("The result of the operation is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
