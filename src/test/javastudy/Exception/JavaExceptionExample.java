package Exception;

public class JavaExceptionExample {
	public static void main(String args[]) {
		
		String s=null;   
		System.out.println(s.length());//NullPointerException  
		
		String s2="abc";  
		int i=Integer.parseInt(s2);//NumberFormatException  
		
		int a[]=new int[5];  
		a[10]=50; //ArrayIndexOutOfBoundsException  
		
		
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
		
		
	}
}


//If we divide any number by zero, there occurs an ArithmeticException.
//If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
