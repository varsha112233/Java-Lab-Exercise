package integerarray;

public class ArraySumCalculator {

	public static void main(String[] args) {
		// Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum of all elements in the array
        int sum = calculateSum(numbers);

        // Display the result
        System.out.println("The sum of all elements in the array is: " + sum);
    }

    // Method to calculate the sum of all elements in an integer array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}