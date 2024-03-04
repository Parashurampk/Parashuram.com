package Basics;

public class J3_Operators {

	public static void main(String[] args) {

		int x = 10;

		// Unary Operator Example: ++ and --
		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		int a = 10;
		int b = 10;
		int c = 20;
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
	}
}
