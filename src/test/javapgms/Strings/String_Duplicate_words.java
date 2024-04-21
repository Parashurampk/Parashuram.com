package Strings;

import java.util.HashSet;
import java.util.Set;

public class String_Duplicate_words {

	public static void main(String[] args) {
		String s1 = "Hi, I am Hritik and I am a programmer";
		String[] words = s1.split(" "); // splitting words using regex

		Set<String> set = new HashSet<String>();
		{
			for (int i = 0; i < words.length - 1; i++) {
				for (int j = 1; j < words.length; j++) {
						if (words[i].equals(words[j]) && i != j) {
						set.add(words[i]);
					}
				}
			}
			System.out.println(set);
		}}}
/*
public class RemoveDuplicateWordsFromSentence {
	public static void main(String[] args) {
		String str = "Hello I am Japneet Japneet am";
		printSentenceWithoutDuplicates(str);
	}

	private static void printSentenceWithoutDuplicates(String str) {
		String[] strSplit = str.split("\\s");
		Map<String, Integer> map = new HashMap<>();
		int counter = 1;

		for (int i = 0; i < strSplit.length; i++) {
			if (map.containsKey(strSplit[i])) {
				map.put(strSplit[i], map.get(strSplit[i]) + 1);
			} else {
				map.put(strSplit[i], counter);
			}
		}

		for (Map.Entry<String, Integer> entryMap : map.entrySet()) {
			if (entryMap.getValue() > 1) {
				System.out.print(entryMap.getKey() + " ");
			}
		}
	}
}

*/