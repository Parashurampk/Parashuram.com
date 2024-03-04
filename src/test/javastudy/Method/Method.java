package Method;

public class Method {

	public static void main(String[] args) {
		Method m = new Method();
		doConnectDB();
		m.doLogin();
		m.doLogout();
		System.out.println(m.addNumbers(5,5)); //arguments

	}

	public static void doConnectDB() {

		System.out.println("ConnectDB Successfull");
	}

	public void doLogin() {

		System.out.println("Login Successfull");
	}

	public void doLogout() {

		System.out.println("Logout Successfull");
	}

	public int addNumbers(int a, int b) { //Parameters

		return a + b;

	}
}
