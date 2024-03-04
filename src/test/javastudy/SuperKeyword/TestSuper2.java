package SuperKeyword;
//2) super can be used to invoke parent class method

class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogs extends Animals {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

class TestSuper2 {
	public static void main(String args[]) {
		Dogs d = new Dogs();
		d.work();
	}
}