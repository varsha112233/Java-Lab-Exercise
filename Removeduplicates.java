package removeduplicateelements;
import java.util.HashSet;
import java.util.Arrays;

public class Removeduplicates {
	public static int[] removeDuplicates(int[] arr) {
        // Create a HashSet to store the unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements to the HashSet
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert HashSet back to an array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        
        return result;
    }

	public static void main(String[] args) {
		 int[] array = {1, 2, 2, 3, 4, 4, 5};
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        
	        int[] arrayWithoutDuplicates = removeDuplicates(array);
	        
	        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
	    }
	}