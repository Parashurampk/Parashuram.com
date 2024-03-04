package InterviewPGMS;

public class Solution {

	static void sumOfCharacters(String name) {
		int sum = 0;
		String n = name.toUpperCase().replaceAll("[^A-Z]", "");
		String[] res = n.split("");
		for (String s : res) {
			sum += sumTheNum(s);
		}
		if (sum > 9) {
			Solution.sumOfChar(sum);
		}

	}

	public static void sumOfChar(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Numerology Number : " + sum);

	}

	private static int sumTheNum(String ch) {

		switch (ch) {
		case "A":
		case "I":
		case "J":
		case "Q":
		case "Y":
			return 1;
		case "B":
		case "K":
		case "R":
			return 2;
		case "C":
		case "G":
		case "L":
		case "S":
			return 3;
		case "D":
		case "M":
		case "T":
			return 4;
		case "E":
		case "H":
		case "N":
		case "X":
			return 5;
		case "U":
		case "V":
		case "W":
			return 6;
		case "O":
		case "Z":
			return 7;
		case "F":
		case "P":
			return 8;
		default:
			return 0;
		}
	}

	static void CalculateDirection(String str) {
		int x = 0, y = 0;
		String[] s = str.split("");
		// char [] s=str.toCharArray();
		for (String st : s) {

			switch (st) {
			case "L":
				x--;
				break;
			case "R":
				x++;
				break;
			case "U":
				y++;
				break;
			case "D":
				y--;
				break;
			default:
				break;
			}
		}
		System.out.print("direction is " + x + " " + y);
	}

	public static void main(String[] args) {
		Solution.CalculateDirection("RRULDDDLR");
		Solution.sumOfCharacters("S. KANAPATHY");
	}
}
