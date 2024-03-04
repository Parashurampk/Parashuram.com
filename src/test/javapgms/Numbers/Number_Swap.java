package Numbers;

public class Number_Swap {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;

		System.out.println("Before-----" + a + "  " + b);

		int t = a;
		a = b;
		b = t;
		System.out.println("After-----" + a + "  " + b);
	}
}
