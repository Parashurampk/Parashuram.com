package Strings;

public class String_Palindrome {

	public static void main(String[] args) {
		
		String str = "rar";
		String rstr = "";
		int strLength = str.length();

		// Loop to reverse the input string
		for (int i = (strLength - 1); i >= 0; i--) {
			rstr = rstr + str.charAt(i);
		}

		// Check if the original string and reversed string are equal (case-insensitive)
		if (str.toLowerCase().equals(rstr.toLowerCase())) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}
}
