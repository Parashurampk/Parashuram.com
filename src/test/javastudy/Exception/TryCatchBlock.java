package Exception;

public class TryCatchBlock {

	public static void tempData() {
		System.out.println("Calling the Method");
	}

	public static void main(String[] args) {

		int b = 7;
		int c = 0;

		try {
			int n = b + c;
			int k = b / c;
			int f = b - c;
			System.out.println(k);
			System.out.println(n);
			System.out.println(f);

		} catch (Exception e) {

			System.out.println("Catched the error");

		}

		finally {
			int s = b + c;
			System.out.println("**********************");
			System.out.println(s);
			tempData();
		}

	}

}
