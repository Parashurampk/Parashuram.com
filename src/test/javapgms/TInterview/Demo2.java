package TInterview;

public class Demo2 {

	public static void main(String[] args) {
		String str = "Paruuuuuuusharam";
		char mostRC = findMRC(str);
		System.out.println("Most repeated character: " + mostRC);

		// Replace the most repeated character with 'z'
		String replacedStr = replaceMostRepeatedChar(str, mostRC);
		System.out.println("Output after replacement: " + replacedStr);
	}

	private static char findMRC(String str) {
		char[] charArray = str.toCharArray();
		int maxCount = 0;
		char mrc = '0';

		for (int i = 0; i < charArray.length; i++) {
			char currentChar = charArray[i];
			int count = 0;

			for (int j = 0; j < charArray.length; j++) {
				if (charArray[j] == currentChar) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				mrc = currentChar;
			}
		}

		return mrc;
	}

	private static String replaceMostRepeatedChar(String str, char mostRC) {
		return str.replace(mostRC, 'z');
	}
}
