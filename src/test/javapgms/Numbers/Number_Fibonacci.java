package Numbers;
//Fibonacci : Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,  
//the next number is found by adding up the two numbers before it
public class Number_Fibonacci {

	public static void main(String args[]) {

		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because
		{ // 0 and 1 are already printed
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
