package TInterview;

public class FirstCharacterPrintTest {

	public static void main(String[] args) {
		String str = "Where there's smoke, there's fire";
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
// Logic to implement first character of each word in a string
			if (c[i] != ' ' && (i == 0 || c[i - 1] == ' ')) {
				System.out.println(c[i]);
			}
		}
	}
}