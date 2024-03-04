package InterviewPGMS;

public class SplitAndPrnitString {

	public static void main(String[] args) {

		String str = "Automation Interview";
		String[] words = str.split(" ");

		for (String word : words) {
			System.out.println(word);
		}

	}
}
