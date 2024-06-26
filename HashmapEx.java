package hashmap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HashmapEx {
        public static void main(String[] args) {
        	Map<String, String> map = new HashMap<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the key:");
            String key = scanner.nextLine();
            System.out.println("Enter the value:");
            String value = scanner.nextLine();
            map.put(key, value);
            System.out.println("HashMap contents:");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            scanner.close();
        }
    }
