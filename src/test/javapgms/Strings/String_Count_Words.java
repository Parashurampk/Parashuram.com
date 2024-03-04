package Strings;

public class String_Count_Words {

	public static void main(String[] args) {
		
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println("Total words :"+countWords);
	}
}