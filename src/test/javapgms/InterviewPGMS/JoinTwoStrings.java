package InterviewPGMS;

public class JoinTwoStrings {

	public static void main(String[] args) {
		
		String str1= "Hello";
		String str2= "World";
		
		String newstring=str1.concat(str2); //Appends a string to the end of another string
		System.out.println(newstring);
		
		boolean contains=str1.contains("o");//Checks whether a string contains a sequence of characters
		System.out.println(contains);
		
		
		char ch =str1.charAt(1); //returns the char value at the first index.
		System.out.println(ch);
		
		String replce=str1.replace("o", "f");//Searches a string for a specified value, and returns a new string where the specified values are replaced
		System.out.println(replce);
		
		String replceall =str1.replaceAll(str1, str2); //
		System.out.println(replceall);

		String replcfirst =str1.replaceAll(str1, str2); //
		System.out.println(replceall);
	}

}
