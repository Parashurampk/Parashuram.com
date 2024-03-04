package FinalAndFinally;

/*      final keyword--used to define the constant values
		final class--that class can not be inherited 
		final method--that method can not be override

		finally --It is used associated with try catch block 
		finally block will get executed after the try catch block 
		whatever exception occurs it doesn't matter But whatever code we have written inside finally block it will get executed 
*/

public class FinalAndFinallyKeyword {

	public static void main(String[] args) {
		
		System.out.println("i am main method");
		test();

	}
	
	public static void test() {
		try {
			System.out.println("inside test method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}
	
	

}
