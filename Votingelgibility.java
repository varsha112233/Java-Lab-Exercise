package constructor;
import java.util.Scanner;
public class Votingelgibility {
	private int birthYear;
    private int age;
    public VotingEligibility(int birthYear) {
        this.birthYear = birthYear;
        this.age = calculateAge(birthYear);
    }
    private int calculateAge(int birthYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }
    public boolean isEligibleToVote() {
        return this.age >= 18;
    }
         public static void main(String[] args) {
        	 Scanner scanner = new Scanner(System.in);
             System.out.println("Enter your birth year:");
             int birthYear = scanner.nextInt();
             VotingEligibility voter = new VotingEligibility(birthYear);
             if (voter.isEligibleToVote()) {
                 System.out.println("You are " + voter.age + " years old. You are eligible to vote!");
             } else {
                 System.out.println("You are " + voter.age + " years old. You are not eligible to vote.");
             }
             
             scanner.close();
         }
     }
		
