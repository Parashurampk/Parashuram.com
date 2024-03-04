package Char;

import java.util.HashSet;
import java.util.Set;

public class Char_DuplicateElements {

	public static void main(String[] args) {
		String str = "radar";
		duplicateString(str);
	}

	public static void duplicateString(String str) {
		str = str.replaceAll(" ", "");
		char[] cArray = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		Set<Character> set1 = new HashSet<Character>();
		for (char c : cArray) {
			if (set.add(c) == false) {
				if (set1.add(c) == true)
					System.out.println(c);
			}
		}
	}
}