package mapinterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapintEx {
	      public static void main(String[] args) {
	    	  Map<String, Integer> cricketerScores = new HashMap<>();
	          Scanner scanner = new Scanner(System.in);
              cricketerScores.put("Virat Kohli", 12000);
	          cricketerScores.put("Sachin Tendulkar", 18000);
	          cricketerScores.put("Ricky Ponting", 14000);
	          cricketerScores.put("Brian Lara", 13000);
              System.out.println("Enter the name of the cricketer to search for:");
	          String cricketerName = scanner.nextLine();
              if (cricketerScores.containsKey(cricketerName)) {
	              int score = cricketerScores.get(cricketerName);
	              System.out.println(cricketerName + " has scored " + score + " runs.");
	          } else {
	              System.out.println(cricketerName + " is not found in the records.");
	          }

	          scanner.close();
	      }
	  }
