package palindrome;
import java.util.Scanner;
public class PalindromeEx {
         public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string to check if it is a palindrome:");
	        String original = scanner.nextLine();
	        String normalized = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        if (isPalindrome(normalized)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
	    public static boolean isPalindrome(String str) {
	        int length = str.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (str.charAt(i) != str.charAt(length - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
