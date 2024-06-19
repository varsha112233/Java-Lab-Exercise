package readintegerfromuser;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Readint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt(); // Attempt to read an integer

            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            // Handle the exception
            System.out.println("InputMismatchException: Please enter a valid integer.");
            // Optionally, you can print more details about the exception
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }

        System.out.println("Program continues after handling the exception.");
    }
		// TODO Auto-generated method stub

	}
