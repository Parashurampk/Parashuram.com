package Char;

import java.util.HashSet;
import java.util.Set;

public class Char_PrintDuplicateCharacter {

	public static void main(String[] args) {
		String str = "Parashuram";
		duplicate(str);
	}
	public static void duplicate(String str) {
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