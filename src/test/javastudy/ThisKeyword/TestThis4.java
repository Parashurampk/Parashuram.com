package ThisKeyword;
//2) this: to invoke current class method
//3) this() : to invoke current class constructor
//4) this: to pass as an argument in the method


/*
this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.

 */

class Demo {

	Demo() {
		this(10); // to invoke current class constructor
		System.out.println("Calling constructor");

	}

	Demo(int a) {

		System.out.println("Calling parameter constructor");
	}

	public void add() {
		System.out.println("Calling m method");
	}

	public void sub() {
		System.out.println("Calling n method");
		// m();
		this.add(); // to invoke current class method
	}
}

class TestThis4 {
	public static void main(String args[]) {
		Demo a = new Demo();
		a.sub();
	}
}