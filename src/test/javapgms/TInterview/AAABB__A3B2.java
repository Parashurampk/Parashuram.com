package TInterview;

public class AAABB__A3B2 {

	public static void main(String[] args) {
		String input = "AAABBCDA";
		String result = compressString(input);
		System.out.println(result);
	}

	private static String compressString(String input) {
		StringBuilder compressedString = new StringBuilder();

		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			char previousChar = input.charAt(i - 1);

			if (currentChar == previousChar) {
				count++;
			} else {
				compressedString.append(previousChar).append(count);
				count = 1;
			}
		}

		// Append the last character and its count
		compressedString.append(input.charAt(input.length() - 1)).append(count);

		return compressedString.toString();
	}
}
