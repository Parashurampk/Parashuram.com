package InterviewPGMS;

public class StringPGM {

	public static void main(String[] args) {
		
		String str="ajbjsbGHJM";
		String str1="Hello";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(4));      //Used to return the character at the specified Index 
		System.out.println(str.indexOf("H"));   //Used to return the position of the specified character
		System.out.println(str.equals(str1));  //Compare the 2 string content 
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(2,5));
		System.out.println(str.replace("h", "y"));
		System.out.println(10 + 20 + "Javatpoint");
		System.out.println("Javatpoint" + 10 + 20);
		
	}

}
