package Method;

public class ParametersAndArguments {

	public static void main(String[] args) {
		ParametersAndArguments p=new ParametersAndArguments();
		p.addNumber();
		p.addNumber2(2,5);
		//when we called the method and provide the values called arguments 
	}

	int a=10;
	int b=20;

	public void addNumber() {

		int c = a + b;
		System.out.println(c);
	}

	//when we create method what are the data type the method accept called parameters
	public void addNumber2(int x, int y) { 	                                     
		int z = x + y;                    	
		System.out.println(z);
	}

}
