package dictionaryappusingtreemap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TreemapEx {
         public static void main(String[] args) {
        	 TreeMap<String, String> dictionary = new TreeMap<>();
             Scanner scanner = new Scanner(System.in);
             boolean exit = false;
             while (!exit) {
                 System.out.println("Dictionary Application:");
                 System.out.println("1. Add a word-definition pair");
                 System.out.println("2. Retrieve and display the definition of a specific word");
                 System.out.println("3. Display all word-definition pairs");
                 System.out.println("4. Exit");
                 System.out.print("Choose an option: ");
                 int option = scanner.nextInt();
                 scanner.nextLine(); // Consume newline
                 switch (option) {
                     case 1:
                         System.out.print("Enter the word: ");
                         String word = scanner.nextLine();
                         System.out.print("Enter the definition: ");
                         String definition = scanner.nextLine();
                         dictionary.put(word, definition);
                         System.out.println("Word-definition pair added.\n");
                         break;
                     case 2:
                         System.out.print("Enter the word to retrieve the definition: ");
                         String searchWord = scanner.nextLine();
                         if (dictionary.containsKey(searchWord)) {
                             System.out.println(searchWord + ": " + dictionary.get(searchWord) + "\n");
                         } else {
                             System.out.println("Word not found in the dictionary.\n");
                         }
                         break;
                     case 3:
                         System.out.println("Dictionary contents:");
                         for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                             System.out.println(entry.getKey() + ": " + entry.getValue());
                         }
                         System.out.println();
                         break;
                     case 4:
                         exit = true;
                         System.out.println("Exiting the dictionary application.");
                         break;
                     default:
                         System.out.println("Invalid option. Please try again.\n");
                 }
             }

             scanner.close();
         }
     }

