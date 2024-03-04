package Strings;

public class String_Reverse {

	public static void main(String[] args) {
		String str = "Hello";
		int length = str.length() - 1;
		for (int i = length; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}

//output: olleH dlroW 