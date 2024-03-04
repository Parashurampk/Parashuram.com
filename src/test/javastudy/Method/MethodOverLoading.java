package Method;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(5);
		obj.sum(10, 20);
	}

	// Can we overload main method ?--> Yes, we have to pass arguments 
	//(we never used to over load main method, But Yes we can overload main method)
	// we need to create it in main method only
	public static void main(int p) {
		System.out.println("Overloading main method");
	}

	// method overloading-->developing multiple method with same name with different
	// parameters
	// Duplicate methods-->same parameters are not allowed
	public void sum() {
		System.out.println("sum method--zero para");
	}

	public void sum(int i) {
		System.out.println("sum method --1 input para");
	}

	public void sum(int k, int l) {
		System.out.println("sum method --2 input para");
		System.out.println(k + l);
	}
}
