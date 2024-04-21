package Strings;

public class String_RemoveAllSpecialCharacters {
	public static void main(String[] args) {
		String str = "Hello^^%#$(!)+_ J@apneet";
		System.out.print(removeSpecialCharacters(str));
	}

	private static String removeSpecialCharacters(String str) {
		String newStr = str.replaceAll("[^a-zA-Z0-9]", " ");
		String nnewStr = newStr.replaceAll(" ", "");
		return nnewStr;
	}

}
