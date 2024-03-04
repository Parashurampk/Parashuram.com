package Strings;

public class String_ReverseEachWord_char {

	public static void main(String[] args) {
		String str = "Hello World";
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			int lengthOfEachWord = words[i].length();

			for (int j = lengthOfEachWord - 1; j >= 0; j--) {
				System.out.print(words[i].charAt(j));
			}

			if (i < words.length - 1) {
				System.out.print(" "); // Add space between reversed words
			}
		}
	}
}
