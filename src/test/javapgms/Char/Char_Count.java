package Char;

public class Char_Count {
	
	public static void main(String[] args) {

		String s1 = "The Art";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {// Counts each character
			if (s1.charAt(i) != ' ')           // except space
				count++;
		}
		System.out.println(count);
	}
}
