package TInterView;

public class StringConcatination {
	public static void main(String[] args) {
		char[] input = { 'a', 'b', 'c', 'd', 'e' };
		String output = charArrayToString(input);
		System.out.println(output);
	}

	public static String charArrayToString(char[] input) {
		return new String(input);
	}
}
