package Constructor;
//Java program to overload constructors  


public class Student5 {
	int id;
	String name;
	int age;

	// creating two arg constructor
	Student5(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	Student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		Student5 s1 = new Student5(111, "Karan");
		Student5 s2 = new Student5(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}


/**
	  Java Constructor	
A constructor is used to initialize the state of an object.	
A constructor must not have a return type.	
The constructor is invoked implicitly.	
The Java compiler provides a default constructor if you don't have any constructor in a class.	.
The constructor name must be same as the class name.	


     Java Method
A method is used to expose the behavior of an object.
A method must have a return type.
The method is invoked explicitly.
The method is not provided by the compiler in any case
The method name may or may not be same as the class name.
*/