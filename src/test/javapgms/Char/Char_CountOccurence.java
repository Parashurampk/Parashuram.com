package Char;

import java.util.HashMap;

public class Char_CountOccurence {

	public static void main(String[] args) {
		// Input string
		String s = "aabbccde";

		// Convert the string to an array of characters
		char[] ch = s.toCharArray();

		// Create a HashMap to store characters and their occurrences
		HashMap<Character, Integer> hMap = new HashMap<>();

		// Iterate through each character in the array
		for (char character : ch) {
			// Check if the character is already present in the HashMap
			if (hMap.containsKey(character)) {
				// If yes, increment the occurrence count by 1
				hMap.put(character, hMap.get(character) + 1);
			} else {
				// If no, add the character to the HashMap with an occurrence count of 1
				hMap.put(character, 1);
			}
		}

		// Print the final HashMap containing character occurrences
		System.out.println(hMap);
	}
}
