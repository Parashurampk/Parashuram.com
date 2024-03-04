package Char;

import java.util.HashSet;
import java.util.Set;

public class Char_UniqueElements {

	public static void main(String[] args) {
		String s = "abcdad";
		char[] cArray = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c : cArray) {
			if (!set.contains(c)) {
				set.add(c);
				System.out.println(c);
			}
		}
	}
}