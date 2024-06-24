package fibonacci;
import java.util.Scanner;
public class FiboEx {
        public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of terms for the Fibonacci series:");
            int numTerms = scanner.nextInt();
            generateFibonacci(numTerms);
            scanner.close();
         }
        public static void generateFibonacci(int numTerms) {
            if (numTerms <= 0) {
                System.out.println("The number of terms should be a positive integer.");
                return;
            }
            int firstTerm = 0;
            int secondTerm = 1;
            System.out.println("Fibonacci series up to " + numTerms + " terms:");
            for (int i = 1; i <= numTerms; i++) {
                System.out.print(firstTerm + " ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            
            System.out.println();
        }
}
