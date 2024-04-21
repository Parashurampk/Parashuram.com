package TInterView;

public class AAABB__A3B2 {
	public static void main(String[] args) {
		String str = "AAABBCDA";
		String rstr = compress(str);
		System.out.println(rstr);
	}
	 public static String compress(String str) {
		StringBuilder s = new StringBuilder();
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			char previousChar = str.charAt(i - 1);

			if (currentChar == previousChar) {
				count++;
			} else {
				s.append(previousChar).append(count);
				count = 1;
			}
		}
		s.append(str.charAt(str.length() - 1)).append(count);// Append the last character and its count
		return s.toString();
	}
}