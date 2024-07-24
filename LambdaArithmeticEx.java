package lambdaArithmetic;
public class LambdaArithmeticEx {
    @FunctionalInterface
    interface ArithmeticOperation {
    double operate(double a, double b);
    }
    public static void main(String[] args) {
    ArithmeticOperation addition = (a, b) -> a + b;
    ArithmeticOperation subtraction = (a, b) -> a - b;
    ArithmeticOperation multiplication = (a, b) -> a * b;
    ArithmeticOperation division = (a, b) -> {
    if (b == 0) {
    throw new ArithmeticException("Division by zero is not allowed.");
    }
    return a / b;
    };
    double num1 = 10.0;
    double num2 = 5.0;
    System.out.println("Numbers: " + num1 + " and " + num2);
    System.out.println("Addition: " + addition.operate(num1, num2));
    System.out.println("Subtraction: " + subtraction.operate(num1, num2));
    System.out.println("Multiplication: " + multiplication.operate(num1, num2));
    try {
    System.out.println("Division: " + division.operate(num1, num2));
    } catch (ArithmeticException e) {
    System.out.println(e.getMessage());
        }
    }
}


