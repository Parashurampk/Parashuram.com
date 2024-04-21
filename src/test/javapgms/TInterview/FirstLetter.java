package TInterView;

public class FirstLetter {
	public static void main(String[] args) {
		String str = "Turtle123456_fly.me";
		String firstWord = extractFirstWord(str);
		System.out.println(firstWord);         // Output: Turtle
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