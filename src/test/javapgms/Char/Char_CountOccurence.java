package Char;

import java.util.HashMap;
import java.util.Map;

public class Char_CountOccurence {
	
	 public static void main(String[] args) {
	        String str = "aabbccddee";
	        char[] ch = str.toCharArray();
	        
	        Map<Character, Integer> map = new HashMap<>();
	        for (char x : ch) {
	            if (!map.containsKey(x)) {   // Check if the character is already present in the HashMap
	            	map.put(x, 1);           // If yes, increment the occurrence count by 1
	            } else {
	            	map.put(x, map.get(x) + 1);  // If no, add the character to the HashMap with an occurrence count of 1
	            }
	        }
	        System.out.println(map);
	    }
	}


/*
			Map<Character, Integer> map = new HashMap<>();
			for (char x : ch) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}
			System.out.println(map);
		}
	}
	
*/

/*
		String s = "aabbccde";
		char[] ch = s.toCharArray();// Convert the string to an array of characters
		HashMap<Character, Integer> hMap = new HashMap<>();// Create a HashMap to store characters and their occurrences

		for (char character : ch) {	
			if (hMap.containsKey(character)) {// Check if the character is already present in the HashMap	
				hMap.put(character, hMap.get(character) + 1);// If yes, increment the occurrence count by 1
			} else {
				hMap.put(character, 1);// If no, add the character to the HashMap with an occurrence count of 1
			}
		}
		System.out.println(hMap);// Print the final HashMap containing character occurrences
	}
}  
*/
