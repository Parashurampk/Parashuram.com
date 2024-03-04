package Strings;

public class String_PrintNumbers {

	public static void main(String[] args) {

		String str = "sdfvsdf68fsdfsf8999fsdf09@#$%";

		String lettersOnly = str.replaceAll("[^a-z]", "");
		System.out.println(lettersOnly);

		String numberOnly = str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);

		String removeSpecailChar = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(removeSpecailChar);

		String ScharctersOnly = str.replaceAll("[a-zA-Z0-9]+", "");
		System.out.println(ScharctersOnly);

		String input = "Turtle123456_fly.me";
		String firstWord = extractFirstWord(input);
		System.out.println(firstWord); // Output: Turtle
	}

	public static String extractFirstWord(String input) {
		StringBuilder result = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (Character.isDigit(c))
				break;
			result.append(c);
		}

		return result.toString();
	}

}
