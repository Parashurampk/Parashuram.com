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

//public static void main(String[] args) {
//	SwapNumbers(5, 7);
//}
//
//public static void SwapNumbers(int a, int b){
//	a = a * b;
//	b = a / b;
//	a = a / b;
//	System.out.print("a:" + a + "b:" + b);
//}
//}
