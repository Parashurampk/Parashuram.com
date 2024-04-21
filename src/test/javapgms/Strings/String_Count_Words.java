package Strings;

public class String_Count_Words {

	public static void main(String[] args) {
		
		String words = "One Two Three Four";
		int countWords = words.split(" ").length;
		System.out.println("Total words :"+countWords);
		
		String str = "Hello@$%^";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}