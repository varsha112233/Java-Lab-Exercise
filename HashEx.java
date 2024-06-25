package hashset;
import java.util.HashSet;
public class HashEx {
        public static void main(String[] args) {
        	HashSet<Integer> numbers = new HashSet<>();
        	numbers.add(5);
            numbers.add(10);
            numbers.add(15);
            numbers.add(20);
            numbers.add(25);
            System.out.println("Elements of the set: " + numbers);
            if (numbers.contains(10)) {
                System.out.println("The set contains the number 10.");
            } else {
                System.out.println("The set does not contain the number 10.");
            }
            numbers.remove(15);
            System.out.println("Size of the set after removal: " + numbers.size());
        }
    }
