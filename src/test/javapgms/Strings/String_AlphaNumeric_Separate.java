package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_AlphaNumeric_Separate {

	public static void main(String[] args) {
		String str = "abc123d$%^&ef456$%^";
		parse(str);
	}
	public static void parse(String str) {
		Matcher matcher = Pattern.compile(".").matcher(str);
		StringBuilder sout = new StringBuilder();
		StringBuilder nout = new StringBuilder();
		StringBuilder scout = new StringBuilder();
		while (matcher.find()) {
			String element = matcher.group();
			if (element.matches("[a-zA-Z]+")) {
				sout.append(element);
			} else if (element.matches("[0-9]+")) {
				nout.append(element);
			} else {
				scout.append(element);
			}
		}
		System.out.println("Alphabetic part: " + sout);
		System.out.println("Numeric part: " + nout);
		System.out.println("Special characters: " + scout);
	}
}
