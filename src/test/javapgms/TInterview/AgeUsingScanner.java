package TInterView;

import java.util.Scanner;

public class AgeUsingScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Create a Scanner object for user input
		System.out.print("Enter your age: ");	// Get the age as input
		int age = scanner.nextInt();
		if (0 <= age && age <= 10) { // Determine the category based on age
			System.out.println("Infant");
		} else if (11 <= age && age <= 20) {
			System.out.println("Youth");
		} else if (21 <= age && age <= 30) {
			System.out.println("Adult");
		} else {
			System.out.println("Category not defined for this age group.");
		}
		scanner.close();// Close the Scanner to avoid resource leak
	}
}
