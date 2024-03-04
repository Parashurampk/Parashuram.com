package InterviewPGMS;

import java.util.Scanner;

public class Separators_Numbers {
	public static class SetThousandSeparator {
		public static String setSeparator(int n) {
			String strNum = Integer.toString(n);
			if (strNum.length() < 4) {
				return strNum;
			}
			return setSeparator(Integer.parseInt(strNum.substring(0, strNum.length() - 3))) + ","
					+ strNum.substring(strNum.length() - 3);
		}

		public static void main(String[] args) {
			System.out.println("Enter the number: ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			String num = setSeparator(number);
			System.out.println(num);
			scanner.close();
		}
	}

}