package divisionoftwonumbers;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            double result = divideNumbers(numerator, denominator);

            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }

        System.out.println("Program continues after handling the exception.");
    }

    // Method to perform division
    public static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) numerator / denominator;
		// TODO Auto-generated method stub

	}

}
