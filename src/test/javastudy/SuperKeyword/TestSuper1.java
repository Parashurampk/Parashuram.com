package SuperKeyword;
//1) super is used to refer immediate parent class instance variable.
//2) super can be used to invoke parent class method
//3) super is used to invoke parent class constructor.

class Animal {
	String color = "white";
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class // refer immediate parent class instance variable.
	}
}

class TestSuper1 {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.printColor();
	}
}