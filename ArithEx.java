package arithmeticoperations;
import java.util.Scanner;
public class ArithEx {
        public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();
            
            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();
            System.out.println("Enter the operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);
            double result = performArithmeticOperation(num1, num2, operation);
            System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);
            
            scanner.close();
        }
        public static double performArithmeticOperation(double a, double b, char op) {
            double result = 0;
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    break;
            }
            return result;
      }

}
