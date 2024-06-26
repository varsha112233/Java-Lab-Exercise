package countnumbers;
import java.util.Scanner;
public class CountNumUseSplit {
         public static void main(String[] args) {
        	 Scanner scanner = new Scanner(System.in);
        	 System.out.println("Enter a string:");
             String inputString = scanner.nextLine();
             System.out.println("Enter the word to count:");
             String wordToCount = scanner.nextLine();
             String[] words = inputString.split("\\s+");
             int count = 0;
             for (String word : words) {
                 if (word.equalsIgnoreCase(wordToCount)) {
                     count++;
                 }
             }

             System.out.println("The word '" + wordToCount + "' occurs " + count + " times in the string.");

             scanner.close();
         }
     }
