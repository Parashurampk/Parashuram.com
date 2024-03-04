package TInterview;

public class StringMethods {

	public static void main(String[] args) {
		String a = " javatraining";// string

		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("rahul teaches"));
		// a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		// split
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));

		
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
