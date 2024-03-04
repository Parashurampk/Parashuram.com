package JavaString;

public class TestStringConcatenation1 {
	public static void main(String args[]) {
		
		String s = "Sachin" + " Tendulkar";
		System.out.println(s);// Sachin Tendulkar

		String s2 = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s2);// 80Sachin4040

		String s3 = "Test" + 0 + 9 + 1 + "hi";

		System.out.println(s3);// Test091hi

		String s4 = 0 + 9 + 1 + "hi";
		System.out.println(s4);// Test091hi
		
		String s5 =  "hi"+0 + 9 + 1 ;
		System.out.println(s5);  //hi091  
		
	}
}