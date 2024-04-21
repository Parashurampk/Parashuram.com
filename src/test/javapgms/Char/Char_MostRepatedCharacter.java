package Char;

import java.util.HashMap;
import java.util.Map;

public class Char_MostRepatedCharacter {

	 public static void main(String[] args) {
	        Map<Character, Integer> map = new HashMap<>();
	        String input = "Parashuram";
	        char maxChar = 0;
	        int maxCount = 0;

	        for (char c : input.toCharArray()) {
	            int count = map.getOrDefault(c, 0) + 1; // get count of character 'c' or 0 if not present
	            map.put(c, count);
	            if (count > maxCount) {
	                maxCount = count;
	                maxChar = c;
	            }
	        }
	        System.out.println(maxChar);
	        System.out.println(maxCount);
	        
	    }
	}