package Basics;

/*
  Packages : com.sun.eng
  Classes  : class Basics;
  Interfaces : interface Storing;
  Methods  :  runFast();
		      getBackground();		  
  Variables : int  i;
 			  char c;
 			  float myWidth;
  Constants:  static final int MIN_WIDTH = 4;
  
  --------------------------------------------------
  == --> Operator , reference comparison , It can't overridden
  equals --> method , Content comparison , It can overridden
  
 */

public class J1_Basics {

	public static void main(String[] args) {

		String str1 = "RCV"; // String Literal -->
		String str2 = "RCV";
		String str3 = new String("RCV"); // String Object  --> It creates the new object in the Heap

		System.out.println(str1 == str3); // false --> used for reference comparison /Object values comparison
		System.out.println(str1.equals(str3)); // true --> used for Content comparison
	}
}

