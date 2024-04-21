package Char;

import java.util.HashMap;

public class Char_DuplicatesCharcterCount {
	public static void main(String[] args) {

		String s = "Parashuram ";
		char[] ch = s.toCharArray();

		HashMap<Character, Integer> hMap = new HashMap<>();
		for (char c : ch) {
			if (hMap.containsKey(c)) {
				hMap.put(c, hMap.get(c) + 1);
			} else {
				hMap.put(c, 1);
			}
		}
		for (Character x : hMap.keySet()) {
			if (hMap.get(x) > 1) {
				System.out.println(x + " : " + hMap.get(x));
			}
		}
	}
}
