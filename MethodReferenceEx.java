package methodReference;
    @FunctionalInterface
    interface MathOperation {
    double operate(double number);
    }
    public class MethodReferenceEx {
	public static double square(double number) {
    return number * number;
    }
    public static void main(String[] args) {
    MathOperation squareOperation = MethodReferenceEx::square;
    double number = 5.0;
    double result = squareOperation.operate(number);
    System.out.println("The square of " + number + " is: " + result);
    }
}


