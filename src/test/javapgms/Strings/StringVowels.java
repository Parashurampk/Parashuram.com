package Strings;

public class StringVowels {

	public static void main(String[] args) {
        String str = "Parashuram";
        System.out.println(countVowels(str));
    }
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive counting

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
                System.out.println("Vowel found: " + currentChar);
            }
        }
        return count;
    }
}
