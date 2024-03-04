package TInterview;

import java.util.HashSet;

import java.util.HashMap;
import java.util.HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class FindMissingLetters {
    public static void main(String[] args) {
        String str = "aabccd";
        String sentence = "The quick brown fox jumps over the  dog";
        findMissingLetters(sentence);
        occurrenceOfChar(str);
    }

    private static void occurrenceOfChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character occurrences in the given string:");
        for (char c : charCount.keySet()) {
            System.out.println("'" + c + "': " + charCount.get(c));
        }
        System.out.println();
    }

    public static String findMissingLetters(String sentence) {
        HashSet<Character> presentChars = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                presentChars.add(c);
            } else if (c >= 'A' && c <= 'Z') {
                presentChars.add(Character.toLowerCase(c));
            }
        }
        StringBuilder missingChars = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!presentChars.contains(c)) {
                missingChars.append(c);
            }
        }
        if (missingChars.length() == 0) {
            System.out.println("The given sentence is a Pangram\n");
        } else {
            System.out.println("Missing Characters are: " + missingChars + "\n");
        }
        return null;
    }
}
