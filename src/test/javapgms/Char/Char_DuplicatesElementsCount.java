package Char;

import java.util.HashMap;

public class Char_DuplicatesElementsCount {
	public static void main(String[] args) {
		// Input string
		String s = "aabbcc";

		// Convert the string to an array of characters
		char[] ch = s.toCharArray();

		// Create a HashMap to store characters and their occurrences
		HashMap<Character, Integer> hMap = new HashMap<>();

		// Count occurrences of each character
		for (char character : ch) {
			if (hMap.containsKey(character)) {
				hMap.put(character, hMap.get(character) + 1);
			} else {
				hMap.put(character, 1);
			}
		}

		// Print characters that are repeated along with their repetition count
		for (Character character : hMap.keySet()) {
			if (hMap.get(character) > 1) {
				System.out.println(character + " is repeated: " + hMap.get(character) + " times");
			}
		}
	}
}
