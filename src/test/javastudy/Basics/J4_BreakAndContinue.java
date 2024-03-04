package Basics;

public class J4_BreakAndContinue {

	public static void main(String[] args) {
		// break
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Final statemnt");

		// Continue
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Final statemnt");
	}

}