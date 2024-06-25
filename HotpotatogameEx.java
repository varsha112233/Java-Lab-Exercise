package queue;
import java.util.*;
public class HotpotatogameEx {
        public static void main(String[] args) {
        Queue<String> players = new LinkedList<>();
        players.add("Alice");
        players.add("Bob");
        players.add("Charlie");
        players.add("David");
        players.add("Eve");
        int passes = 3;
        while (players.size() > 1) {
        for (int i = 0; i < passes; i++) {
        String player = players.remove();
        players.add(player);
                }

         String eliminatedPlayer = players.remove();
         System.out.println(eliminatedPlayer + " is eliminated.");
            }

          String winner = players.peek();
          System.out.println("The winner is " + winner + ".");
        }
    }
