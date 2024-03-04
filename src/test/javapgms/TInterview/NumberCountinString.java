package TInterview;

public class NumberCountinString {

	public static void main(String[] args) {
		String word = "abds323a4b45a";
		int digitCount = 0;

		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			if (Character.isDigit(currentChar)) {
				digitCount++;
			}
		}
		System.out.println(digitCount);
	}
}