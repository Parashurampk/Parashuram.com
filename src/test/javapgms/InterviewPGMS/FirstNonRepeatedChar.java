package InterviewPGMS;

import java.util.HashMap;

public class FirstNonRepeatedChar {

	public static char findFirstNonRepeatedChar(String str) {
		str = str.replaceAll(" ", "").toLowerCase();
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : str.toCharArray()) {
			if (map.get(c) == 1) {
				return c;
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		String input = "The Midnight Library";
		char res = findFirstNonRepeatedChar(input);
		if (res == '\0') {
			System.out.println("No nonrepeated characters found");
		} else {
			System.out.println(res);
		}
	}
}