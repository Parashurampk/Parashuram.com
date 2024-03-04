package TInterview;

public class CaseConversion {

	public static void main(String[] args) {
		String input = "GooD MorNinG";
		String result = swapCase(input);
		System.out.println(result);
	}

	private static String swapCase(String input) {
		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char currentChar = charArray[i];

			if (Character.isUpperCase(currentChar)) {
				charArray[i] = Character.toLowerCase(currentChar);
			} else if (Character.isLowerCase(currentChar)) {
				charArray[i] = Character.toUpperCase(currentChar);
			}
			// Ignore characters that are not letters
		}

		return new String(charArray);
	}
}
