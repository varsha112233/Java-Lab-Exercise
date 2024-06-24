package largeof3num;
import java.util.Scanner;
public class Largeof3numEx {
        public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();
            
            System.out.println("Enter the third number:");
            int num3 = scanner.nextInt();
            int largest = findLargest(num1, num2, num3);
            System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is " + largest + ".");
            
            scanner.close();
        }
        public static int findLargest(int a, int b, int c) {
            int largest = a;
            
            if (b > largest) {
                largest = b;
            }
            
            if (c > largest) {
                largest = c;
            }
            
            return largest;
        }
    }
