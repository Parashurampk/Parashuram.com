package JavaString;

import java.util.Arrays;

public class StringSplit {

	public static void main(String args[]) {

		String text = new String("Hello, My name is Sachin");

		String[] sentences = text.split("\\.");
		System.out.println(Arrays.toString(sentences));

		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s.trim());// Sachin
		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n"));// true
		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h
		System.out.println(s.length());// 6
		String replaceString = s.replace("Sachin", "Kava");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello

		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.replace(1, 3, "Java");
		System.out.println(sb2);// prints HJavalo

		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.delete(1, 3);
		System.out.println(sb3);// prints Hlo

		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.reverse();
		System.out.println(sb4);// prints olleH

	}
}