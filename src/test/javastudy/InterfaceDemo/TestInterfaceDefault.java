package InterfaceDemo;

interface Drawables {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Rectangles implements Drawables {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawables d = new Rectangles();
		d.draw();
		d.msg();
	}
}

