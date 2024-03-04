package Inheritance;

class Vehical {

	void sound0() {
		System.out.println("bonw  bonw...");
	}
}

class Bike extends Vehical {

	void sound1() {
		System.out.println("dru dru...");
	}
}

class TestInheritance {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.sound0();
		b.sound1();

	}
}