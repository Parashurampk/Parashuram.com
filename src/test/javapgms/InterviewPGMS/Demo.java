package InterviewPGMS;

public class Demo {

	public static void main(String[] args) {
		String str = "welcomelo";

		char[] ch = str.toCharArray();

		System.out.println("Duplicate characters in the string:");

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j]);

					int count = 2;
					while (j + count < str.length() && ch[i] == ch[j + count]) {
						count++;
					}
					System.out.println(" :  Count: " + count + "");

					break;
				}
			}
		}
	}
}
