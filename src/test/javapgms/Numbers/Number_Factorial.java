package Numbers;
//Factorial : 5= 1*2*3*4*5=24
public class Number_Factorial {

	public static void main(String[] args) {

		int num = 5;
		long fact = 1;
		for (int i = 1; i < num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
      }
}
