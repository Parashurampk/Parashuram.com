package Strings;

public class String_OccurrenceofWordcount {

	public static void main(String[] args) {

	String string = "Spring is but but so is winter";
	String word = "but";
	String temp[] = string.split(" ");
	int count = 0;
	for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
				count++;
		}
	System.out.println(count);
	}
}