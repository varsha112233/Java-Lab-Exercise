package constructor;
import java.util.Scanner;
import java.time.Year;

public class Votingelgibility {
	private int birthYear;
    private int age;

    // Constructor to initialize the birth year and calculate the age
    public VotingEligibility(int birthYear) {
        this.birthYear = birthYear;
        this.age = calculateAge();
    }

    // Method to calculate age
    private int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    // Method to check if the person is eligible to vote
    public boolean isEligibleToVote() {
        return age >= 18;
    }

    // Method to display the results
    public void displayEligibility() {
        System.out.println("You are " + age + " years old.");
        if (isEligibleToVote()) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth year
        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Create an instance of VotingEligibility
        VotingEligibility votingEligibility = new VotingEligibility(birthYear);

        // Display the eligibility result
        votingEligibility.displayEligibility();

        // Close the scanner
        scanner.close();
		// TODO Auto-generated method stub

	}

}
