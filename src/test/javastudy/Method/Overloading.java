package Method;

public class Overloading {

	static int a = 10;
	static int b = 20;
	static int c = 30;
	
	public static int add() {

		int d = a + b;
		return d;
	}

	public static int add(int a, int b) {
		int d = a + b;
		return d;
	}

	public static void main(String[] args) {

		int result = add();
		int result1 = add(5, 6);

		System.out.println(result);
		System.out.println(result1);

	}
}

//Can we overload java main() method?
   //Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
   //But JVM calls main() method which receives string array as arguments only