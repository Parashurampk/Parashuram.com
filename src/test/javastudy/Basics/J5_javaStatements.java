package Basics;

public class J5_javaStatements {

	public static void main(String[] args) {
		int x = 10;
		int y = 12;

		// if statement
		if (x + y > 20) {
			System.out.println("x + y is greater than 20");
		}

		// if else
		if (x + y < 10) {
			System.out.println("x + y is less than      10");
		} else {
			System.out.println("x + y is greater than 20");
		}

		// if-else-if statement
		String city = "Delhi";

		if (city == "Meerut") {
			System.out.println("city is meerut");
		} else if (city == "Noida") {
			System.out.println("city is noida");
		} else if (city == "Agra") {
			System.out.println("city is agra");
		} else {
			System.out.println(city);
		}

		// Nested if-statement
		String address = "Delhi, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}

		// switch statement.
		int num = 2;
		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;

		case 1:
			System.out.println("number is 1");
			break;

		default:
			System.out.println(num);
		}

		// for loop--> If number of iteration is fixed 
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);
	}

	// for-each loop --> Another form of for loop

	String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
	{
		for (String name : names) {
			System.out.println(name);
		}

		// while loop -->If number of iteration is NOT fixed 

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}

		// do-while loop --> If number of iteration is NOT fixed 

		int j = 0;

		do {
			System.out.println(j);
			i = j + 2;
		} while (j <= 10);

		// break statement
		for (int b = 0; b <= 10; b++) {
			System.out.println(b);
			if (b == 6) {
				break;
			}
		}
	}
}
