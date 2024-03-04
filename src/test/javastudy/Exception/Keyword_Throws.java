package Exception;
//It is used to declare exceptions. It doesn’t throw an exception. It specifies that there may occur an exception in 
//the method. It is always used with method signature.
import java.io.IOException;

class Ram {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

class Keyword_Throws {
	public static void main(String args[]) throws IOException {// declare exception
		Ram m = new Ram();
		m.method();

		System.out.println("normal flow...");
	}
}