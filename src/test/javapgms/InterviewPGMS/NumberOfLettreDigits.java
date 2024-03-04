package InterviewPGMS;

import java.util.Scanner;

public class NumberOfLettreDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any statement having characters,numbers,spaces and symbols:");

		String str = scanner.nextLine();

		int letterCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int otherCount = 0;

		char[] ca = str.toCharArray();

		for (Character c : ca) {

			if (Character.isLetter(c)) {

				letterCount++;

			} else if (Character.isDigit(c)) {

				digitCount++;

			} else if (Character.isSpaceChar(c)) {

				spaceCount++;

			} else {

				otherCount++;

			}

		}

		System.out.println("Number of letters is: " + letterCount);
		System.out.println("Number of digits is: " + digitCount);
		System.out.println("Number of spaces is: " + spaceCount);
		System.out.println("Number of other things is: " + otherCount);

		scanner.close();
	}
}
