package Method;
/**
Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
*/


class Parent {
	
	  void fun(int x) {
		System.out.println("Parents doing offline business");
	}
}
class Child extends Parent {
	
	void fun() {
		System.out.println("Parents doing online business");
	}
}
class Overriding {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.fun();
	}
}

