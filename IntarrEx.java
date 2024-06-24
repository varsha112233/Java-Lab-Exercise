package integerarray;
import java.util.Scanner;
public class IntarrEx {
         public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        int sum = calculateSum(array);
	        System.out.println("The sum of all elements in the array is: " + sum);
	        
	        scanner.close();
	    }
	    public static int calculateSum(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return sum;
	    }
	}
