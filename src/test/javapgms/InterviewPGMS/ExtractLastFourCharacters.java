package InterviewPGMS;

import java.util.Scanner;

public class ExtractLastFourCharacters {
	public static String extractLastFourChar(String str) {
		if (str == null) {
			return "Input is null";
		}
		int length = str.length();
		String res = null;
		if (length <= 4) {
			return str;
		} else {
			res = str.substring(length - 4);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scanner.nextLine();
		String result = extractLastFourChar(input);
		System.out.println(result);
		scanner.close();
	}

}