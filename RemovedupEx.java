package removeduplicates;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovedupEx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int[] uniqueArray = removeDuplicates(array);
        
        System.out.println("Array with duplicates removed:");
        System.out.println(Arrays.toString(uniqueArray));
        
        scanner.close();
    }
    
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : array) {
            set.add(num);
        }
        
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray;
    }
}
