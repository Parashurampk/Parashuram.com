package Numbers;
//Palindrome number: is a number that is same after reverse. For example 545, 151, 34543, 
public class Number_Pallindrome {

	public static void main(String[] args) {
		int num = 12354;
		palindrome(num);
	}

	public static void palindrome(int num) {
		int org_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (org_num == rev) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}
