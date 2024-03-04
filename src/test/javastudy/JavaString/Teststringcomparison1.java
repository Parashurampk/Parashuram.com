package JavaString;

public class Teststringcomparison1 {
	
	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
	}
}

//1) By Using equals() Method
    //The String class equals() method compares the original content of the string. 
    //It compares values of string for equality.

//2) By Using == operator
    //The == operator compares references not values.

//3) By Using compareTo() method
    //The String class compareTo() method compares values lexicographically and returns an integer value 
    //that describes if first string is less than, equal to or greater than second string.