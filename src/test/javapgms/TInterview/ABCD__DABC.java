package TInterview;

public class ABCD__DABC {

	public static void main(String[] args) {
		String input = "ABCD";
		int rotationCount = 1; // Specify the number of positions to rotate

		String rotatedString = rotateString(input, rotationCount);
		System.out.println(rotatedString);
	}

	private static String rotateString(String input, int rotationCount) {
		int length = input.length();
		rotationCount = rotationCount % length; // Ensure rotationCount is within the string length

		// Rotate the string by moving characters from the end to the beginning
		String rotatedPart = input.substring(length - rotationCount);
		String remainingPart = input.substring(0, length - rotationCount);

		return rotatedPart + remainingPart;
	}
}
